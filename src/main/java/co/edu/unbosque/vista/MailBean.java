package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.servicios.PropiedadServicios;
import co.edu.unbosque.servicios.UsuarioWebServicios;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@Named
@RequestScoped
public class MailBean implements Serializable {

    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(false);

    private String emailSender;
    private String senderMessage;
    private String emailUsername = (String) session.getAttribute("usuario");
    private PropiedadDTO propiedad = new PropiedadDTO();
    @Inject
    private UsuarioWebServicios usuarioWebServicios;

    @Inject
    private PropiedadServicios propiedadServicios;


    public void crearRequest(){
        propiedadServicios.enviarCotizacionCorreo(propiedad, emailSender, senderMessage, emailUsername);
    }

    public String getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }

    public String getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
    }

    public String getEmailUsername() {
        return emailUsername;
    }

    public void setEmailUsername(String emailUsername) {
        this.emailUsername = emailUsername;
    }

    public PropiedadDTO getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(PropiedadDTO propiedad) {
        this.propiedad = propiedad;
    }
}
