package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dao.ResidentePropiedadDAO;
import co.edu.unbosque.modelo.dto.PropiedadDTO;
import co.edu.unbosque.modelo.dto.ResidentePropiedadDTO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import co.edu.unbosque.modelo.entidades.ResidentePropiedad;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
public class ResidentePropiedadServicios implements Serializable {
    private static final long serialVersionUID = 1L;


    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    ResidentePropiedadDAO residentePropiedadDAO;


    public ResidentePropiedadDTO crearResdientePropiedad(ResidentePropiedadDTO residentePropiedad) {
        System.out.println("En el servicio creando: " + residentePropiedad.toString());
        return modelMapper.map(residentePropiedadDAO.crear(modelMapper.map(residentePropiedad, ResidentePropiedad.class)), ResidentePropiedadDTO.class);
    }

    public ResidentePropiedadDTO actualizarResidentePropiedad(ResidentePropiedadDTO residentePropiedad) {
        System.out.println("En el servicio actualizando: " + residentePropiedad.toString());
        return modelMapper.map(residentePropiedadDAO.actualizar(modelMapper.map(residentePropiedad, ResidentePropiedad.class)), ResidentePropiedadDTO.class);
    }

    public ResidentePropiedadDTO eliminarResidentePropiedad(ResidentePropiedadDTO residentePropiedad) {
        System.out.println("En el servicio eliminando: " + residentePropiedad.toString());
        return modelMapper.map(residentePropiedadDAO.eliminar(modelMapper.map(residentePropiedad, ResidentePropiedad.class)), ResidentePropiedadDTO.class);
    }

    public ResidentePropiedadDTO buscarResidentePropiedadPorId(ResidentePropiedadDTO residentePropiedad) {
        System.out.println("En el servicio buscando el siguiente id: " + residentePropiedad.getId_residente_propiedad());
        return modelMapper.map(residentePropiedadDAO.buscar(residentePropiedad.getId_residente_propiedad()), ResidentePropiedadDTO.class);
    }

    public Set<ResidentePropiedadDTO> buscarResidentesPropiedades() {
        System.out.println("En el servicio buscando todos los residentes propiedades: ");
        return residentePropiedadDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, ResidentePropiedadDTO.class))
                .collect(Collectors.toSet());
    }

    public Set<ResidentePropiedadDTO> buscarResidentesPropiedadPorFiltro(int filtro) {
        System.out.println("En el servicio buscando todos los residentes: ");
        return residentePropiedadDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, ResidentePropiedadDTO.class))
                .filter(ResidentePropiedadDTO -> ResidentePropiedadDTO.getId_residente_propiedad() ==filtro)
                .collect(Collectors.toSet());
    }

}
