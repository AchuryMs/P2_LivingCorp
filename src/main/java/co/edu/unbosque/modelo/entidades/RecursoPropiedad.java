package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPERTY_RESOURCES")
public class RecursoPropiedad {

    @Id
    @Column(name = "PROP_RES_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_recurso_propiedad;
    @Column(name = "RESOURCE_ID")
    private int id_recurso;
    @JoinColumn(name = "PROPERTY_ID", referencedColumnName = "PROPERTY_ID")
    private int id_propiedad;
    @Column(name = "RESOURCE_MIN_PRICE")
    private double precio_min_recurso;
    @Column(name = "RESOURCE_MIN_TIME_HRS")
    private double tiempo_min_recurso;
    @Column(name = "RESOURCE_AVAILABILITY")
    private String disponibilidad_recurso;
    @Column(name = "RESOURCE_CAPACITY")
    private int capacidad_recurso;
    @Column(name = "BOOKING_EMAIL")
    private String email_reserva;


    public RecursoPropiedad() {
    }

    public RecursoPropiedad(int id_recurso_propiedad, int id_recurso,int id_propiedad, double precio_min_recurso, double tiempo_min_recurso, String disponibilidad_recurso, int capacidad_recurso, String email_reserva) {
        this.id_recurso_propiedad = id_recurso_propiedad;
        this.id_recurso = id_recurso;
        this.id_propiedad = id_propiedad;
        this.precio_min_recurso = precio_min_recurso;
        this.tiempo_min_recurso = tiempo_min_recurso;
        this.disponibilidad_recurso = disponibilidad_recurso;
        this.capacidad_recurso = capacidad_recurso;
        this.email_reserva = email_reserva;
    }

    public int getId_recurso_propiedad() {
        return id_recurso_propiedad;
    }

    public void setId_recurso_propiedad(int id_recurso_propiedad) {
        this.id_recurso_propiedad = id_recurso_propiedad;
    }

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public double getPrecio_min_recurso() {
        return precio_min_recurso;
    }

    public void setPrecio_min_recurso(double precio_min_recurso) {
        this.precio_min_recurso = precio_min_recurso;
    }

    public double getTiempo_min_recurso() {
        return tiempo_min_recurso;
    }

    public void setTiempo_min_recurso(double tiempo_min_recurso) {
        this.tiempo_min_recurso = tiempo_min_recurso;
    }

    public String getDisponibilidad_recurso() {
        return disponibilidad_recurso;
    }

    public void setDisponibilidad_recurso(String disponibilidad_recurso) {
        this.disponibilidad_recurso = disponibilidad_recurso;
    }

    public int getCapacidad_recurso() {
        return capacidad_recurso;
    }

    public void setCapacidad_recurso(int capacidad_recurso) {
        this.capacidad_recurso = capacidad_recurso;
    }

    public String getEmail_reserva() {
        return email_reserva;
    }

    public void setEmail_reserva(String email_reserva) {
        this.email_reserva = email_reserva;
    }

    @Override
    public String toString() {
        return "RecursoPropiedad{" +
                "id_recurso_propiedad=" + id_recurso_propiedad +
                ", id_recurso=" + id_recurso +
                ", id_propiedad=" + id_propiedad +
                ", precio_min_recurso=" + precio_min_recurso +
                ", tiempo_min_recurso=" + tiempo_min_recurso +
                ", disponibilidad_recurso='" + disponibilidad_recurso + '\'' +
                ", capacidad_recurso=" + capacidad_recurso +
                ", email_reserva='" + email_reserva + '\'' +
                '}';
    }
}
