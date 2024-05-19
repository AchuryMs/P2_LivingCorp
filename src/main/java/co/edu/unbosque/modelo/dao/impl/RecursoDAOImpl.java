package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.dao.RecursoDAO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import co.edu.unbosque.modelo.entidades.Recurso;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class RecursoDAOImpl implements RecursoDAO {

@PersistenceContext(unitName = "LivingDBP")
private EntityManager em;


    @Override
    public Recurso crear(Recurso entidad) {
    System.out.println("En el DAO implementado, creando recurso" + entidad.toString());
    em.persist(entidad);
    return entidad;
    }

    @Override
    public Recurso actualizar(Recurso entidad) {
        System.out.println("en el DAO implementado, actualizando Recurso" + entidad.toString());
        return em.merge(entidad);
    }

    @Override
    public Recurso eliminar(Recurso entidad) {
        System.out.println("en el DAO implementado, eliminando Recurso" + entidad.toString());
        em.remove(entidad);
        return entidad;
    }

    @Override
    public Recurso buscar(Integer id) {
        System.out.println("en el DAO implementado, buscando Recurso con id: " + id);
        return em.find(Recurso.class, id);
    }

    @Override
    public List<Recurso> buscarTodos() {
        System.out.println("En la implementacion de propiedad, consultando todos");
        TypedQuery<Recurso> query = em.createQuery("SELECT all FROM Recurso all", Recurso.class);
        return query.getResultList();
    }
}
