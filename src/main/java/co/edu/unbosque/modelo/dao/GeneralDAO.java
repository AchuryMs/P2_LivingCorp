package co.edu.unbosque.modelo.dao;

import java.util.List;

public interface GeneralDAO<T , K >{
    T crear(T entidad);
    T actualizar(T entidad);
    T eliminar(T entidad);
    T buscar(K id);
    List<T> buscarTodos();
}
