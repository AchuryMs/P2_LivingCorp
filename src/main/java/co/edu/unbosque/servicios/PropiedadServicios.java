package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dao.UsuarioWebDAO;
import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import co.edu.unbosque.modelo.entidades.UsuarioWeb;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
public class PropiedadServicios implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LogManager.getLogger(PropiedadServicios.class);

    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    PropiedadDAO propiedadDAO;

    @Inject
    UsuarioWebDAO usuarioWebDAO;


    public PropiedadDTO crearPropiedad(PropiedadDTO propiedad, String nombre_admin) {
        UsuarioWeb admin = usuarioWebDAO.buscar(nombre_admin);
        logger.info("Creando propiedad , usuario encontrado {}", nombre_admin);
        System.out.println("Creando propiedad, usuario encontrado " + admin.getNombre_usuario());
        UsuarioWebDTO adminDto = modelMapper.map(admin, UsuarioWebDTO.class);
        propiedad.setAdministrador_propiedad(adminDto);
        System.out.println("seteando: " + adminDto.toString());
        System.out.println("Creando propiedad, usuario encontrado " + admin.getNombre_usuario());

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

    public Set<PropiedadDTO> buscarPropiedadesPorAdmin(String filtro) {
        System.out.println("En el servicio buscando todas las propiedades: ");
        return propiedadDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, PropiedadDTO.class))
                .filter(propiedadDTO -> propiedadDTO.getAdministrador_propiedad().equals(filtro))
                .collect(Collectors.toSet());
    }

    public void enviarCotizacionCorreo(PropiedadDTO propiedadDTO, String emailSender, String senderMessage, String emailUsername){

    }

}
