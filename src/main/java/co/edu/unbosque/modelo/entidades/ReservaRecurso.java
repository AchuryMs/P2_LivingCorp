package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class ReservaRecurso {

    @Id
    @Column(name = "RESOURCE_BOOKINGS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id_reserva;
    @Column(name = "USER_NAME")
    private String nombre_usuario;
    @Column(name = "BOOKING_DATETIME")
    private LocalDate fecha_reserva;
    @Column(name = "BOOKING_START_DATE")
    private LocalDate fecha_inicio;
    @Column(name = "BOOKING_END_DATE")
    private LocalDate fecha_fin;
    @Column(name = "BOOKING_COST")
    private double precio_reserva;
    @Column(name = "PAYMENT_COMPLETE")
    private boolean pago_completado;

    public ReservaRecurso() {
    }

    public ReservaRecurso(int id_reserva, String nombre_usuario, LocalDate fecha_reserva, LocalDate fecha_inicio, LocalDate fecha_fin, double precio_reserva, boolean pago_completado) {
        this.id_reserva = id_reserva;
        this.nombre_usuario = nombre_usuario;
        this.fecha_reserva = fecha_reserva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.precio_reserva = precio_reserva;
        this.pago_completado = pago_completado;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public LocalDate getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDate fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getPrecio_reserva() {
        return precio_reserva;
    }

    public void setPrecio_reserva(double precio_reserva) {
        this.precio_reserva = precio_reserva;
    }

    public boolean isPago_completado() {
        return pago_completado;
    }

    public void setPago_completado(boolean pago_completado) {
        this.pago_completado = pago_completado;
    }

    @Override
    public String toString() {
        return "ReservaRecurso{" +
                "id_reserva=" + id_reserva +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", fecha_reserva=" + fecha_reserva +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", precio_reserva=" + precio_reserva +
                ", pago_completado=" + pago_completado +
                '}';
    }
}
