package co.edu.unbosque.servicios;

import co.edu.unbosque.modelo.dao.UsuarioWebDAO;
import co.edu.unbosque.modelo.dto.UsuarioWebDTO;
import co.edu.unbosque.modelo.entidades.UsuarioWeb;
import co.edu.unbosque.util.SHA256Util;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

@Stateless
public class UsuarioWebServicios implements Serializable {
    private static final long serialVersionUID = 1L;

    public ModelMapper modelMapper = new ModelMapper();

    @Inject
    UsuarioWebDAO usuarioWebDAO;


    public UsuarioWebDTO crearUsuario(UsuarioWebDTO usuario) {
        System.out.println("En el servicio creando: " + usuario.toString());
        usuario.setContrasenia_usuario(SHA256Util.hash(usuario.getContrasenia_usuario())); // Cifrando
        return modelMapper.map(usuarioWebDAO.crear(modelMapper.map(usuario, UsuarioWeb.class)), UsuarioWebDTO.class);
    }

    public UsuarioWebDTO actualizarUsuario(UsuarioWebDTO usuario) {
        System.out.println("En el servicio actualizando: " + usuario.toString());
        return modelMapper.map(usuarioWebDAO.actualizar(modelMapper.map(usuario, UsuarioWeb.class)), UsuarioWebDTO.class);
    }

    public UsuarioWebDTO eliminarPropiedad(UsuarioWebDTO usuario) {
        System.out.println("En el servicio eliminando: " + usuario.toString());
        return modelMapper.map(usuarioWebDAO.eliminar(modelMapper.map(usuario, UsuarioWeb.class)), UsuarioWebDTO.class);
    }

    public UsuarioWebDTO buscarUsuario(String usuario) {
        System.out.println("En el servicio buscando este id: " + usuario);
        return modelMapper.map(usuarioWebDAO.buscar(usuario), UsuarioWebDTO.class);
    }
    public Set<UsuarioWebDTO> buscarUsuarios() {
        System.out.println("En el servicio buscando todas las propiedades: ");
        return usuarioWebDAO.buscarTodos()
                .stream()
                .map(entity -> modelMapper.map(entity, UsuarioWebDTO.class))
                .collect(Collectors.toSet());
    }
}
