package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dao.RecursoDAO;
import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.modelo.dto.RecursoDTO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import co.edu.unbosque.modelo.entidades.Recurso;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
public class RecursoServicios implements Serializable {
    private static final long serialVersionUID = 1L;

    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    RecursoDAO recursoDAO;


    public RecursoDTO crearRecurso(RecursoDTO recurso) {
        System.out.println("En el servicio creando: " + recurso.toString());
        return modelMapper.map(recursoDAO.crear(modelMapper.map(recurso, Recurso.class)), RecursoDTO.class);
    }

    public RecursoDTO actualizarRecurso(RecursoDTO recurso) {
        System.out.println("En el servicio actualizando: " + recurso.toString());
        return modelMapper.map(recursoDAO.actualizar(modelMapper.map(recurso, Recurso.class)), RecursoDTO.class);
    }

    public RecursoDTO eliminarRecurso(RecursoDTO recurso) {
        System.out.println("En el servicio eliminando: " + recurso.toString());
        return modelMapper.map(recursoDAO.eliminar(modelMapper.map(recurso, Recurso.class)), RecursoDTO.class);
    }

    public RecursoDTO buscarRecursoPorId(Integer id) {
        System.out.println("En el servicio buscando el siguiente id: " + id);
        return modelMapper.map(recursoDAO.buscar(id), RecursoDTO.class);
    }

    public Set<RecursoDTO> buscarRecursos() {
        System.out.println("En el servicio buscando todas los recursos: ");
        return recursoDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, RecursoDTO.class))
                .collect(Collectors.toSet());
    }


}
