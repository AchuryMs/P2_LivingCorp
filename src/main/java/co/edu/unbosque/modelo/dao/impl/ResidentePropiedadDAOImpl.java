package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.ReservaRecursoDAO;
import co.edu.unbosque.modelo.dao.ResidentePropiedadDAO;
import co.edu.unbosque.modelo.entidades.ReservaRecurso;
import co.edu.unbosque.modelo.entidades.ResidentePropiedad;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Stateless
public class ResidentePropiedadDAOImpl implements ResidentePropiedadDAO {

@PersistenceContext(unitName = "LivingDBP")
private EntityManager em;


    @Override
    public ResidentePropiedad crear(ResidentePropiedad entidad) {
    System.out.println("En el DAO implementado, creando residente +" + entidad.toString() + "para recurso");
    em.persist(entidad);
    return entidad;
    }

    @Override
    public ResidentePropiedad actualizar(ResidentePropiedad entidad) {
        System.out.println("en el DAO implementado, actualizando reserva " + entidad.toString() + " para recurso");
        return em.merge(entidad);
    }

    @Override
    public ResidentePropiedad eliminar(ResidentePropiedad entidad) {
        System.out.println("en el DAO implementado, eliminando reserva" + entidad.toString() + "del recurso");
        em.remove(entidad);
        return entidad;
    }

    @Override
    public ResidentePropiedad buscar(Integer id) {
        System.out.println("en el DAO implementado, buscando reserva con id: " + id);
        return em.find(ResidentePropiedad.class, id);
    }

    @Override
    public List<ResidentePropiedad> buscarTodos() {
        System.out.println("En la implementacion de  residente de propiedad, consultando todos");
        TypedQuery<ResidentePropiedad> query = em.createQuery("SELECT all FROM ResidentePropiedad all", ResidentePropiedad.class);
        return query.getResultList();
    }
}
