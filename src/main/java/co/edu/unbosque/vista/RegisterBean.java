package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.servicios.UsuarioWebServicios;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@RequestScoped
public class RegisterBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    UsuarioWebServicios usuarioWebServicios;

    private  UsuarioWebDTO usuarioWebDTO = new UsuarioWebDTO();
    //ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    //HttpSession session;

    public String crearUsuario(){
        System.out.println("En el bean, recibiendo: " + usuarioWebDTO.toString() + "para persistir");
        usuarioWebServicios.crearUsuario(usuarioWebDTO);
        //session = (HttpSession) externalContext.getSession(true);
        //session.setAttribute("usuario", usuarioWebDTO);
    return "home-user";
    }

    public UsuarioWebDTO getUsuarioWebDTO() {
        return usuarioWebDTO;
    }

    public void setUsuarioWebDTO(UsuarioWebDTO usuarioWebDTO) {
        this.usuarioWebDTO = usuarioWebDTO;
    }
}
