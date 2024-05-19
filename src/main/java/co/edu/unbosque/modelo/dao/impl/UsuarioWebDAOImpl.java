package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.UsuarioWebDAO;
import co.edu.unbosque.modelo.entidades.UsuarioWeb;
import co.edu.unbosque.servicios.PropiedadServicios;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class UsuarioWebDAOImpl implements UsuarioWebDAO {

    @PersistenceContext(unitName = "LivingDBP")
    private EntityManager em;


    @Override
    public UsuarioWeb crear(UsuarioWeb entidad) {
        entidad.setUltimo_inicio_sesion(LocalDateTime.now());
        entidad.setBloqueado(false);
        entidad.setResidente_propietario(false);
        System.out.println("En el DAO implementado, Creando UsuarioWeb" + entidad.toString());

        // Verificar si la entidad ya existe en la base de datos
        if (em.find(UsuarioWeb.class, entidad.getNombre_usuario()) != null) {
            throw new EntityExistsException("La entidad ya existe en la base de datos");
        }

        em.persist(entidad);
        return entidad; // Devolver la entidad persistida
    }


    @Override
    public UsuarioWeb actualizar(UsuarioWeb entidad) {
        System.out.println("En el DAO implementado, Actualizando UsuarioWeb" + entidad.toString());
        return em.merge(entidad);
    }

    @Override
    public UsuarioWeb eliminar(UsuarioWeb entidad) {
        System.out.println("En el DAO implementado, eliminando UsuarioWeb" + entidad.toString());
        em.remove(entidad);
        return entidad;
    }

    @Override
    public UsuarioWeb buscar(String nombre_usuario) {

        System.out.println("En el DAO implementado, Buscando UsuarioWeb con el nombre de usuario: " + nombre_usuario);
        return em.find(UsuarioWeb.class, nombre_usuario);
    }


    @Override
    public List<UsuarioWeb> buscarTodos() {
        System.out.println("En la implementacion de propiedad, consultando todos");
        TypedQuery<UsuarioWeb> query = em.createQuery("SELECT u FROM UsuarioWeb u", UsuarioWeb.class);
        return query.getResultList();
    }

}
