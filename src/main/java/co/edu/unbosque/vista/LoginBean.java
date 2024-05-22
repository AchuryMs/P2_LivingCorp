package co.edu.unbosque.vista;

import co.edu.unbosque.excepciones.UsuarioWebException;
import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.servicios.UsuarioWebServicios;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@Named
@RequestScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;

    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(true);

    private UsuarioWebDTO usuarioWebDTO = new UsuarioWebDTO();
    @Inject
    private UsuarioWebServicios usuarioWebServicios;

    public String iniciarSesion() {
        System.out.println("Iniciando sesion con estas credenciales: " + usuarioWebDTO.getNombre_usuario() + usuarioWebDTO.getContrasenia_usuario() );

        if (usuarioWebServicios.buscarUsuario(usuarioWebDTO.getNombre_usuario() )!= null){
            System.out.println("LOGUEADO");
        session.setAttribute("usuario", usuarioWebDTO.getNombre_usuario());
            return "dashboardAdmin.xhtml";
        }
        System.out.println("NO LOGUEADO");
        return "index.xhtml";

    }

    public UsuarioWebDTO getUsuarioWebDTO() {
        return usuarioWebDTO;
    }

    public void setUsuarioWebDTO(UsuarioWebDTO usuarioWebDTO) {
        this.usuarioWebDTO = usuarioWebDTO;
    }
}
