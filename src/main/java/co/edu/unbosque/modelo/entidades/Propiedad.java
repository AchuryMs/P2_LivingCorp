package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPERTIES")
public class Propiedad {

    @Id
    @Column(name = "PROPERTY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_propiedad;
    @Column(name = "PROPERTY_NAME")
    private String nombre_propiedad;
    @Column(name = "PROPERTY_CITY")
    private String ciudad_propiedad;
    @Column(name = "PROPERTY_ADDRESS")
    private String direccion_propiedad;
    @Column(name = "PROPERTY_AREA")
    private int area_propiedad;
    @Column(name = "PROPERTY_PRICE")
    private double precio_propiedad;
    @Column(name = "PROPERTY_ROOMS")
    private int habitacion_propiedad;
    @Column(name = "PROPERTY_BATHROOMS")
    private int baños_propiedad;
    @Column(name = "PROPERTY_DESCRIPCION")
    private String descripcion_propiedad;
    @ManyToOne
    @JoinColumn(name = "PROPERTY_ADMIN", referencedColumnName = "USER_NAME")
    private UsuarioWeb administrador_propiedad;
    @Column(name = "IS_AVAILABLE_FOR_RENT")
    private boolean habilitado_rentar;
    @Column(name = "IS_AVAILABLE_FOR_SALE")
    private boolean habilitado_comprar;

    public Propiedad() {
    }

    public Propiedad(int id_propiedad, String nombre_propiedad, String ciudad_propiedad, String direccion_propiedad, int area_propiedad, double precio_propiedad, int habitacion_propiedad, int baños_propiedad, String descripcion_propiedad, UsuarioWeb administrador_propiedad, boolean habilitado_rentar, boolean habilitado_comprar) {
        this.id_propiedad = id_propiedad;
        this.nombre_propiedad = nombre_propiedad;
        this.ciudad_propiedad = ciudad_propiedad;
        this.direccion_propiedad = direccion_propiedad;
        this.area_propiedad = area_propiedad;
        this.precio_propiedad = precio_propiedad;
        this.habitacion_propiedad = habitacion_propiedad;
        this.baños_propiedad = baños_propiedad;
        this.descripcion_propiedad = descripcion_propiedad;
        this.administrador_propiedad = administrador_propiedad;
        this.habilitado_rentar = habilitado_rentar;
        this.habilitado_comprar = habilitado_comprar;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getNombre_propiedad() {
        return nombre_propiedad;
    }

    public void setNombre_propiedad(String nombre_propiedad) {
        this.nombre_propiedad = nombre_propiedad;
    }

    public String getCiudad_propiedad() {
        return ciudad_propiedad;
    }

    public void setCiudad_propiedad(String ciudad_propiedad) {
        this.ciudad_propiedad = ciudad_propiedad;
    }

    public String getDireccion_propiedad() {
        return direccion_propiedad;
    }

    public void setDireccion_propiedad(String direccion_propiedad) {
        this.direccion_propiedad = direccion_propiedad;
    }

    public int getArea_propiedad() {
        return area_propiedad;
    }

    public void setArea_propiedad(int area_propiedad) {
        this.area_propiedad = area_propiedad;
    }

    public double getPrecio_propiedad() {
        return precio_propiedad;
    }

    public void setPrecio_propiedad(double precio_propiedad) {
        this.precio_propiedad = precio_propiedad;
    }

    public int getHabitacion_propiedad() {
        return habitacion_propiedad;
    }

    public void setHabitacion_propiedad(int habitacion_propiedad) {
        this.habitacion_propiedad = habitacion_propiedad;
    }

    public int getBaños_propiedad() {
        return baños_propiedad;
    }

    public void setBaños_propiedad(int baños_propiedad) {
        this.baños_propiedad = baños_propiedad;
    }

    public String getDescripcion_propiedad() {
        return descripcion_propiedad;
    }

    public void setDescripcion_propiedad(String descripcion_propiedad) {
        this.descripcion_propiedad = descripcion_propiedad;
    }

    public UsuarioWeb getAdministrador_propiedad() {
        return administrador_propiedad;
    }

    public void setAdministrador_propiedad(UsuarioWeb administrador_propiedad) {
        this.administrador_propiedad = administrador_propiedad;
    }

    public boolean isHabilitado_rentar() {
        return habilitado_rentar;
    }

    public void setHabilitado_rentar(boolean habilitado_rentar) {
        this.habilitado_rentar = habilitado_rentar;
    }

    public boolean isHabilitado_comprar() {
        return habilitado_comprar;
    }

    public void setHabilitado_comprar(boolean habilitado_comprar) {
        this.habilitado_comprar = habilitado_comprar;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "id_propiedad=" + id_propiedad +
                ", nombre_propiedad='" + nombre_propiedad + '\'' +
                ", ciudad_propiedad='" + ciudad_propiedad + '\'' +
                ", direccion_propiedad='" + direccion_propiedad + '\'' +
                ", area_propiedad=" + area_propiedad +
                ", precio_propiedad=" + precio_propiedad +
                ", habitacion_propiedad=" + habitacion_propiedad +
                ", baños_propiedad=" + baños_propiedad +
                ", descripcion_propiedad='" + descripcion_propiedad + '\'' +
                ", administrador_propiedad=" + administrador_propiedad +
                ", habilitado_rentar=" + habilitado_rentar +
                ", habilitado_comprar=" + habilitado_comprar +
                '}';
    }
}
