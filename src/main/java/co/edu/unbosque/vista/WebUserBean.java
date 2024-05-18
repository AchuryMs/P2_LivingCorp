package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class WebUserBean {
    private UsuarioWebDTO usuarioWebDTO;


    public UsuarioWebDTO getUsuarioWebDTO() {
        return usuarioWebDTO;
    }

    public void setUsuarioWebDTO(UsuarioWebDTO usuarioWebDTO) {
        this.usuarioWebDTO = usuarioWebDTO;
    }
}
