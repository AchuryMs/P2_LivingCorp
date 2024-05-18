package co.edu.unbosque.modelo.dao.impl;

import co.edu.unbosque.modelo.dao.PropiedadDAO;
import co.edu.unbosque.modelo.entidades.Propiedad;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Set;

@Stateless
public class PropiedadDAOImpl implements PropiedadDAO {

@PersistenceContext(unitName = "LivingDBP")
private EntityManager em;


    @Override
    public Propiedad crear(Propiedad entidad) {
    System.out.println("En el DAO implementado, creando Propiedad" + entidad.toString());
    em.persist(entidad);
    return entidad;
    }

    @Override
    public Propiedad actualizar(Propiedad entidad) {
        System.out.println("en el DAO implementado, actualizando Propiedad" + entidad.toString());
        return null;
    }

    @Override
    public Propiedad eliminar(Propiedad entidad) {
        System.out.println("en el DAO implementado, eliminando Propiedad" + entidad.toString());
        em.remove(entidad);
        return entidad;
    }

    @Override
    public Propiedad buscar(Integer id) {
        System.out.println("en el DAO implementado, buscando Propiedad con id: " + id);
        return em.find(Propiedad.class, id);
    }

    @Override
    public List<Propiedad> buscarTodos() {
        System.out.println("En la implementacion de propiedad, consultando todos");
        TypedQuery<Propiedad> query = em.createQuery("SELECT all FROM Propiedad all", Propiedad.class);
        return query.getResultList();
    }
}
