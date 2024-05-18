package co.edu.unbosque.modelo.dto;

import jakarta.persistence.Column;

public class PropiedadDTO {

    private int id_propiedad;
    private String nombre_propiedad;
    private String ciudad_propiedad;
    private String direccion_propiedad;
    private int area_propiedad;
    private double precio_propiedad;
    private int habitacion_propiedad;
    private int baños_propiedad;
    private String descripcion_propiedad;
    private String admnistrador_propiedad;
    private boolean habilitado_rentar;
    private boolean habilitado_comprar;

    public PropiedadDTO() {
    }

    public PropiedadDTO(int id_propiedad, String nombre_propiedad, String ciudad_propiedad, String direccion_propiedad, int area_propiedad, double precio_propiedad, int habitacion_propiedad, int baños_propiedad, String descripcion_propiedad, String admnistrador_propiedad, boolean habilitado_rentar, boolean habilitado_comprar) {
        this.id_propiedad = id_propiedad;
        this.nombre_propiedad = nombre_propiedad;
        this.ciudad_propiedad = ciudad_propiedad;
        this.direccion_propiedad = direccion_propiedad;
        this.area_propiedad = area_propiedad;
        this.precio_propiedad = precio_propiedad;
        this.habitacion_propiedad = habitacion_propiedad;
        this.baños_propiedad = baños_propiedad;
        this.descripcion_propiedad = descripcion_propiedad;
        this.admnistrador_propiedad = admnistrador_propiedad;
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

    public String getAdmnistrador_propiedad() {
        return admnistrador_propiedad;
    }

    public void setAdmnistrador_propiedad(String admnistrador_propiedad) {
        this.admnistrador_propiedad = admnistrador_propiedad;
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
        return "PropiedadDTO{" +
                "id_propiedad=" + id_propiedad +
                ", nombre_propiedad='" + nombre_propiedad + '\'' +
                ", ciudad_propiedad='" + ciudad_propiedad + '\'' +
                ", direccion_propiedad='" + direccion_propiedad + '\'' +
                ", area_propiedad=" + area_propiedad +
                ", precio_propiedad=" + precio_propiedad +
                ", habitacion_propiedad=" + habitacion_propiedad +
                ", baños_propiedad=" + baños_propiedad +
                ", descripcion_propiedad='" + descripcion_propiedad + '\'' +
                ", admnistrador_propiedad='" + admnistrador_propiedad + '\'' +
                ", habilitado_rentar=" + habilitado_rentar +
                ", habilitado_comprar=" + habilitado_comprar +
                '}';
    }
}
