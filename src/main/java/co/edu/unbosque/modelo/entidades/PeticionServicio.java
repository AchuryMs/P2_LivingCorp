package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "SERVICE_REQUESTS")
public class PeticionServicio {

    @Id
    @Column(name = "RQST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_peticion_servicio;
    @Column(name = "RQST_DATETIME")
    private LocalDate fecha_peticion;
    @Column(name = "USER_NAME")
    private String nombre_usuario;
    @Column(name = "PROPERTY_ID")
    private int id_propiedad;
    @Column(name = "SVC_PROVIDER_ID")
    private int id_proveedor_servicio;
    @Column(name = "REQUEST_DESCRIPTION")
    private String descripcion_peticion;
    @Column(name = "SVC_DATETIME")
    private LocalDate fecha_peticion_servicio;

    public PeticionServicio() {
    }

    public PeticionServicio(int id_peticion_servicio, LocalDate fecha_peticion, String nombre_usuario, int id_propiedad, int id_proveedor_servicio, String descripcion_peticion, LocalDate fecha_peticion_servicio) {
        this.id_peticion_servicio = id_peticion_servicio;
        this.fecha_peticion = fecha_peticion;
        this.nombre_usuario = nombre_usuario;
        this.id_propiedad = id_propiedad;
        this.id_proveedor_servicio = id_proveedor_servicio;
        this.descripcion_peticion = descripcion_peticion;
        this.fecha_peticion_servicio = fecha_peticion_servicio;
    }

    public int getId_peticion_servicio() {
        return id_peticion_servicio;
    }

    public void setId_peticion_servicio(int id_peticion_servicio) {
        this.id_peticion_servicio = id_peticion_servicio;
    }

    public LocalDate getFecha_peticion() {
        return fecha_peticion;
    }

    public void setFecha_peticion(LocalDate fecha_peticion) {
        this.fecha_peticion = fecha_peticion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public int getId_proveedor_servicio() {
        return id_proveedor_servicio;
    }

    public void setId_proveedor_servicio(int id_proveedor_servicio) {
        this.id_proveedor_servicio = id_proveedor_servicio;
    }

    public String getDescripcion_peticion() {
        return descripcion_peticion;
    }

    public void setDescripcion_peticion(String descripcion_peticion) {
        this.descripcion_peticion = descripcion_peticion;
    }

    public LocalDate getFecha_peticion_servicio() {
        return fecha_peticion_servicio;
    }

    public void setFecha_peticion_servicio(LocalDate fecha_peticion_servicio) {
        this.fecha_peticion_servicio = fecha_peticion_servicio;
    }

    @Override
    public String toString() {
        return "PeticionServicio{" +
                "id_peticion_servicio=" + id_peticion_servicio +
                ", fecha_peticion=" + fecha_peticion +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", id_propiedad=" + id_propiedad +
                ", id_proveedor_servicio=" + id_proveedor_servicio +
                ", descripcion_peticion='" + descripcion_peticion + '\'' +
                ", fecha_peticion_servicio=" + fecha_peticion_servicio +
                '}';
    }
}
