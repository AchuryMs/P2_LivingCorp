package co.edu.unbosque.vista;


import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.servicios.PropiedadServicios;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class IndexBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private PropiedadDTO propiedadDTO = new PropiedadDTO();
    private List<PropiedadDTO> tempPropiedades  = new ArrayList<>();
    @Inject
    PropiedadServicios propiedadServicios;


    public String showWebPropertyDTOByCity() {

    return "inmuebleComprar.xhtml";
    }

    public PropiedadDTO getPropiedadDTO() {
        return propiedadDTO;
    }

    public void setPropiedadDTO(PropiedadDTO propiedadDTO) {
        this.propiedadDTO = propiedadDTO;
    }
}
