package co.edu.unbosque.modelo.dto;

import jakarta.persistence.Column;

public class RecursoDTO {

    private int id_recurso;
    private String descripcion_recurso;
    private String tipo_recurso;

    public RecursoDTO() {
    }

    public RecursoDTO(int id_recurso, String descripcion_recurso, String tipo_recurso) {
        this.id_recurso = id_recurso;
        this.descripcion_recurso = descripcion_recurso;
        this.tipo_recurso = tipo_recurso;
    }

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    public String getDescripcion_recurso() {
        return descripcion_recurso;
    }

    public void setDescripcion_recurso(String descripcion_recurso) {
        this.descripcion_recurso = descripcion_recurso;
    }

    public String getTipo_recurso() {
        return tipo_recurso;
    }

    public void setTipo_recurso(String tipo_recurso) {
        this.tipo_recurso = tipo_recurso;
    }

    @Override
    public String toString() {
        return "RecursoDTO{" +
                "id_recurso=" + id_recurso +
                ", descripcion_recurso='" + descripcion_recurso + '\'' +
                ", tipo_recurso='" + tipo_recurso + '\'' +
                '}';
    }
}
