package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PROPERTY_VISITOR_APPOINTMENT")
public class CitaVisitaPropiedad {

    @Id
    @Column(name = "APPOINTMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cita;
    @Column(name = "VISITOR_NAME")
    private String nombre_visitante;
    @Column(name = "ADVISOR_NAME")
    private String nombre_asesor;
    @Column(name = "APPOINTMENT_DATETIME")
    private LocalDate fecha_visita;
    @Column(name = "PROPERTY_ID")
    private String id_propiedad;

    public CitaVisitaPropiedad() {
    }

    public CitaVisitaPropiedad(int id_cita, String nombre_visitante, String nombre_asesor, LocalDate fecha_visita, String id_propiedad) {
        this.id_cita = id_cita;
        this.nombre_visitante = nombre_visitante;
        this.nombre_asesor = nombre_asesor;
        this.fecha_visita = fecha_visita;
        this.id_propiedad = id_propiedad;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getNombre_visitante() {
        return nombre_visitante;
    }

    public void setNombre_visitante(String nombre_visitante) {
        this.nombre_visitante = nombre_visitante;
    }

    public String getNombre_asesor() {
        return nombre_asesor;
    }

    public void setNombre_asesor(String nombre_asesor) {
        this.nombre_asesor = nombre_asesor;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public String getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(String id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    @Override
    public String toString() {
        return "CitaVisitaPropiedad{" +
                "id_cita=" + id_cita +
                ", nombre_visitante='" + nombre_visitante + '\'' +
                ", nombre_asesor='" + nombre_asesor + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", id_propiedad='" + id_propiedad + '\'' +
                '}';
    }
}
