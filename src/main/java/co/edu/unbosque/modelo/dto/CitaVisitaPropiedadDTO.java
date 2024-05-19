package co.edu.unbosque.modelo.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class CitaVisitaPropiedadDTO {

    private int id_cita;
    private String nombre_visitante;
    private String nombre_asesor;
    private LocalDate fecha_visita;
    private String id_propiedad;

    public CitaVisitaPropiedadDTO() {
    }

    public CitaVisitaPropiedadDTO(int id_cita, String nombre_visitante, String nombre_asesor, LocalDate fecha_visita, String id_propiedad) {
        this.id_cita = id_cita;
        this.nombre_visitante = nombre_visitante;
        this.nombre_asesor = nombre_asesor;
        this.fecha_visita = fecha_visita;
        this.id_propiedad = id_propiedad;
    }
}
