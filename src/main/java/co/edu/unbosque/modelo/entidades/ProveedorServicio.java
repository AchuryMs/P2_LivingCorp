package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "SVC_PROVIDERS")
public class ProveedorServicio {

    @Id
    @Column(name = "PROVIDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proveedor;
    @Column(name = "PROVIDER_EMAIL")
    private String correo_proveedor;
    @Column(name = "SERVICE_DESCRIPTION")
    private String descripcion_servicio;
    @Column(name = "SERVICE_TYPE")
    private String tipo_servicio;
    @Column(name = "SERVICE_PRICE")
    private double precio_servicio;

    public ProveedorServicio() {
    }

    public ProveedorServicio(int id_proveedor, String correo_proveedor, String descripcion_servicio, String tipo_servicio, double precio_servicio) {
        this.id_proveedor = id_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.descripcion_servicio = descripcion_servicio;
        this.tipo_servicio = tipo_servicio;
        this.precio_servicio = precio_servicio;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }

    public String getDescripcion_servicio() {
        return descripcion_servicio;
    }

    public void setDescripcion_servicio(String descripcion_servicio) {
        this.descripcion_servicio = descripcion_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public double getPrecio_servicio() {
        return precio_servicio;
    }

    public void setPrecio_servicio(double precio_servicio) {
        this.precio_servicio = precio_servicio;
    }

    @Override
    public String toString() {
        return "ProveedorServicio{" +
                "id_proveedor=" + id_proveedor +
                ", correo_proveedor='" + correo_proveedor + '\'' +
                ", descripcion_servicio='" + descripcion_servicio + '\'' +
                ", tipo_servicio='" + tipo_servicio + '\'' +
                ", precio_servicio=" + precio_servicio +
                '}';
    }
}
