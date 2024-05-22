package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
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
public class RegisterBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    UsuarioWebServicios usuarioWebServicios;

    private  UsuarioWebDTO usuarioWebDTO = new UsuarioWebDTO();
    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(true);

    public String crearUsuario(){
        System.out.println("En el bean, recibiendo: " + usuarioWebDTO.toString() + "para persistir");
        usuarioWebServicios.crearUsuario(usuarioWebDTO);
        session.setAttribute("usuario", usuarioWebDTO.getNombre_usuario());
    return "home-user";
    }

    public UsuarioWebDTO getUsuarioWebDTO() {
        return usuarioWebDTO;
    }

    public void setUsuarioWebDTO(UsuarioWebDTO usuarioWebDTO) {
        this.usuarioWebDTO = usuarioWebDTO;
    }
}
