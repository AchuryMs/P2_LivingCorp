package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dto.PropiedadDTO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.io.Serializable;

@Stateless
public class PropiedadServicios implements Serializable {

    @Inject
    PropiedadDAO propiedadDAO;

    public PropiedadDTO crearPropiedad(PropiedadDTO propiedad) {

    }
}
