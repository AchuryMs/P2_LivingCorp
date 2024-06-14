package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.ReservaRecursoDAO;
import co.edu.unbosque.modelo.dto.ReservaRecursoDTO;
import co.edu.unbosque.modelo.entidades.ReservaRecurso;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

import java.io.Serializable;

@Stateless
public class ReservaRecursoServicios implements Serializable {
    private static final long serialVersionUID = 1L;

    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    ReservaRecursoDAO reservaRecursoDAO;

    public ReservaRecursoDTO crearReservaRecurso(ReservaRecursoDTO reservaRecurso) {
        System.out.println("en el servicio de las reservas de los recursos, creando: " + reservaRecurso.toString());
        return modelMapper.map(reservaRecursoDAO.crear(modelMapper.map(reservaRecurso, ReservaRecurso.class)), ReservaRecursoDTO.class);
    }
}
