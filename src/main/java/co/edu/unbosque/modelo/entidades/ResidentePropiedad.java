package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPERTY_RESIDENTS")
public class ResidentePropiedad {

    @Id
    @Column(name = "PROPERTY_RESIDENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_residente_propiedad;
    @Column(name = "PROPERTY_ID")
    private int id_propiedad;
    @Column(name = "USER_NAME")
    private String nombre_usuario;
    @Column(name = "IS_OWNER")
    private String es_propietario;

    public ResidentePropiedad() {
    }

    public ResidentePropiedad(int id_residente_propiedad, int id_propiedad, String nombre_usuario, String es_propietario) {
        this.id_residente_propiedad = id_residente_propiedad;
        this.id_propiedad = id_propiedad;
        this.nombre_usuario = nombre_usuario;
        this.es_propietario = es_propietario;
    }

    public int getId_residente_propiedad() {
        return id_residente_propiedad;
    }

    public void setId_residente_propiedad(int id_residente_propiedad) {
        this.id_residente_propiedad = id_residente_propiedad;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEs_propietario() {
        return es_propietario;
    }

    public void setEs_propietario(String es_propietario) {
        this.es_propietario = es_propietario;
    }

    @Override
    public String toString() {
        return "ResidentePropiedad{" +
                "id_residente_propiedad=" + id_residente_propiedad +
                ", id_propiedad=" + id_propiedad +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", es_propietario='" + es_propietario + '\'' +
                '}';
    }
}
