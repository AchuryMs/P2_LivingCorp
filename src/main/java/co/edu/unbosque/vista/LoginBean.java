package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.servicios.UsuarioWebServicios;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private UsuarioWebDTO usuarioWebDTO = new UsuarioWebDTO();
    @Inject
    private UsuarioWebServicios usuarioWebServicios = new UsuarioWebServicios();

    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(false);

    public void iniciarSesion(){
        usuarioWebServicios.buscarUsuario(usuarioWebDTO);
    }

}
