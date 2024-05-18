package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.ReservaRecursoDAO;
import co.edu.unbosque.modelo.entidades.ReservaRecurso;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class ReservaRecursoDAOImpl implements ReservaRecursoDAO {

@PersistenceContext(unitName = "LivingDBP")
private EntityManager em;


    @Override
    public ReservaRecurso crear(ReservaRecurso entidad) {
    System.out.println("En el DAO implementado, creando reserva +" + entidad.toString() + "para recurso");
    em.persist(entidad);
    return entidad;
    }

    @Override
    public ReservaRecurso actualizar(ReservaRecurso entidad) {
        System.out.println("en el DAO implementado, actualizando reserva " + entidad.toString() + " para recurso");
        return em.merge(entidad);
    }

    @Override
    public ReservaRecurso eliminar(ReservaRecurso entidad) {
        System.out.println("en el DAO implementado, eliminando reserva" + entidad.toString() + "del recurso");
        em.remove(entidad);
        return entidad;
    }

    @Override
    public ReservaRecurso buscar(Integer id) {
        System.out.println("en el DAO implementado, buscando reserva con id: " + id);
        return em.find(ReservaRecurso.class, id);
    }

    @Override
    public List<ReservaRecurso> buscarTodos() {
        System.out.println("En la implementacion de propiedad, consultando todos");
        TypedQuery<ReservaRecurso> query = em.createQuery("SELECT all FROM ReservaRecurso all", ReservaRecurso.class);
        return query.getResultList();
    }
}
