package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "SERVICE_RFQ")
public class CotizacionSolicitudServicio {

    @Id
    @Column(name = "RFQ_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cotizacion;
    @Column(name = "RFQ_DATETIME")
    private LocalDate fecha_cotizacion;
    @Column(name = "USER_NAME")
    private String nombre_usuario;
    @Column(name = "PROPERTY_ID")
    private int id_propiedad;
    @Column(name = "SVC_PROVIDER_ID")
    private int id_proveedor_servicio;
    @Column(name = "REQUEST_DESCRIPTION")
    private String descripcion_solictud;

    public CotizacionSolicitudServicio() {
    }

    public CotizacionSolicitudServicio(int id_cotizacion, LocalDate fecha_cotizacion, String nombre_usuario, int id_propiedad, int id_proveedor_servicio, String descripcion_solictud) {
        this.id_cotizacion = id_cotizacion;
        this.fecha_cotizacion = fecha_cotizacion;
        this.nombre_usuario = nombre_usuario;
        this.id_propiedad = id_propiedad;
        this.id_proveedor_servicio = id_proveedor_servicio;
        this.descripcion_solictud = descripcion_solictud;
    }

    public int getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(int id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public LocalDate getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(LocalDate fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
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

    public String getDescripcion_solictud() {
        return descripcion_solictud;
    }

    public void setDescripcion_solictud(String descripcion_solictud) {
        this.descripcion_solictud = descripcion_solictud;
    }

    @Override
    public String toString() {
        return "CotizacionSolicitudServicio{" +
                "id_cotizacion=" + id_cotizacion +
                ", fecha_cotizacion=" + fecha_cotizacion +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", id_propiedad=" + id_propiedad +
                ", id_proveedor_servicio=" + id_proveedor_servicio +
                ", descripcion_solictud='" + descripcion_solictud + '\'' +
                '}';
    }
}
