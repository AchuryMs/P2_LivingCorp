package co.edu.unbosque.vista;


import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.servicios.UsuarioWebServicios;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@Named
@SessionScoped
public class RegisterBean implements Serializable {

    private static final long serialVersionUID = 1L;

    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(false);

    private UsuarioWebDTO usuarioWebDto = new UsuarioWebDTO();

    @Inject
    private UsuarioWebServicios serviciosUsuario;


    public void registrarCliente() {
        if (usuarioWebDto == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos de usuario no proporcionados", null));
            return;
        }

        if (usuarioWebDto.getNombre_usuario() == null || usuarioWebDto.getNombre_usuario().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El nombre es obligatorio", null));
            return;
        }

        if (usuarioWebDto.getEmail_usuario() == null || !usuarioWebDto.getEmail_usuario().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El correo electrónico no es válido", null));
            return;
        }

        if (usuarioWebDto.getContrasenia_usuario() == null || usuarioWebDto.getContrasenia_usuario().length() < 8) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "La contraseña debe tener al menos 8 caracteres", null));
            return;
        }

        try {
            serviciosUsuario.crearUsuario(usuarioWebDto);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario registrado correctamente", null));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al registrar el usuario: " + e.getMessage(), null));
        }
    }



}
