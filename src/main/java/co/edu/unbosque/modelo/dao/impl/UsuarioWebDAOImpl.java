package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.UsuarioWebDAO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import co.edu.unbosque.modelo.entidades.UsuarioWeb;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class UsuarioWebDAOImpl implements UsuarioWebDAO {

    @PersistenceContext(unitName = "LivingDBP")
    private EntityManager em;

    @Override
    public UsuarioWeb crear(UsuarioWeb entidad) {
        System.out.println("En el DAO implementado, Creando UsuarioWeb" + entidad.toString());
        em.persist(entidad);
        return entidad;
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
    public UsuarioWeb buscar(Integer id) {
        System.out.println("En el DAO implementado, Buscando UsuarioWeb con id: " + id);
        return em.find(UsuarioWeb.class, id);
    }
    public UsuarioWeb buscarPorNombre(String user) {
        System.out.println("En el DAO implementado, Buscando UsuarioWeb con nombre de usuario: " + user);
        return em.find(UsuarioWeb.class, user);
    }

    @Override
    public List<UsuarioWeb> buscarTodos() {
        System.out.println("En la implementacion de propiedad, consultando todos");
        TypedQuery<UsuarioWeb> query = em.createQuery("SELECT all FROM UsuarioWeb all", UsuarioWeb.class);
        return query.getResultList();
    }
}
