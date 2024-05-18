package co.edu.unbosque.modelo.dao;

import java.util.Set;

public interface GeneralDAO<T , K >{
    T crear(T entidad);
    T actualizar(T entidad);
    T eliminar(T entidad);
    T buscar(K id);
    Set<T> buscarTodos();
}
