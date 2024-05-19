package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.servicios.PropiedadServicios;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;

import java.io.Serializable;

@Named
@SessionScoped
public class AdminBean implements Serializable {

    private static final long serialVersionUID = 1L;
    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(false);

    private UsuarioWebDTO usuarioWebDTO = new UsuarioWebDTO();
    private PropiedadDTO propiedadDTO = new PropiedadDTO();

    @Inject
    private PropiedadServicios propiedadServicios;

    public PropiedadDTO crearPropiedad(){
        return propiedadServicios.crearPropiedad(propiedadDTO);
    }



}
