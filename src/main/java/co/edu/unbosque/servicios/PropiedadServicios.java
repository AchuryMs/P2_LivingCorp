package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
public class PropiedadServicios implements Serializable {
    private static final long serialVersionUID = 1L;


    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    PropiedadDAO propiedadDAO;


    public PropiedadDTO crearPropiedad(PropiedadDTO propiedad) {
        System.out.println("En el servicio creando: " + propiedad.toString());
        return modelMapper.map(propiedadDAO.crear(modelMapper.map(propiedad, Propiedad.class)), PropiedadDTO.class);
    }

    public PropiedadDTO actualizarPropiedad(PropiedadDTO propiedad) {
        System.out.println("En el servicio actualizando: " + propiedad.toString());
        return modelMapper.map(propiedadDAO.actualizar(modelMapper.map(propiedad, Propiedad.class)), PropiedadDTO.class);
    }

    public PropiedadDTO eliminarPropiedad(PropiedadDTO propiedad) {
        System.out.println("En el servicio eliminando: " + propiedad.toString());
        return modelMapper.map(propiedadDAO.eliminar(modelMapper.map(propiedad, Propiedad.class)), PropiedadDTO.class);
    }

    public PropiedadDTO buscarPropiedadPorId(PropiedadDTO propiedad) {
        System.out.println("En el servicio buscando el siguiente id: " + propiedad.getId_propiedad());
        return modelMapper.map(propiedadDAO.buscar(propiedad.getId_propiedad()), PropiedadDTO.class);
    }

    public Set<PropiedadDTO> buscarPropiedades() {
        System.out.println("En el servicio buscando todas las propiedades: ");
        return propiedadDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, PropiedadDTO.class))
                .collect(Collectors.toSet());
    }

    public Set<PropiedadDTO> buscarPropiedadesPorFiltro(String filtro) {
        System.out.println("En el servicio buscando todas las propiedades: ");
        return propiedadDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, PropiedadDTO.class))
                .filter(propiedadDTO -> propiedadDTO.getCiudad_propiedad().equals(filtro))
                .collect(Collectors.toSet());
    }

}
