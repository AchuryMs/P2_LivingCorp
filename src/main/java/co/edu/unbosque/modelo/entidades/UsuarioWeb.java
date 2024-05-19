package co.edu.unbosque.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "WEB_USERS")
public class UsuarioWeb {

    @Id
    @Column(name = "USER_NAME", length = 25, nullable = false)
    private String nombre_usuario;
    @Column(name = "USER_EMAIL", length = 25, nullable = false)
    private String email_usuario;
    @Column(name = "USER_PASSWORD", length = 25, nullable = false)
    private String contrasenia_usuario;
    @Column(name = "LAST_LOGIN")
    private LocalDateTime ultimo_inicio_sesion;
    @Column(name = "IS_BLOCKED")
    private boolean bloqueado;
    @OneToMany(mappedBy = "id_propiedad")
    private Set<Propiedad> propiedadesAdministradas;
    @Column(name = "IS_RESIDENT_PPRTY_OWNER")
    private boolean residente_propietario;

    public UsuarioWeb() {
    }

    public UsuarioWeb(String nombre_usuario, String email_usuario, String contrasenia_usuario, LocalDateTime ultimo_inicio_sesion, boolean bloqueado, Set<Propiedad> propiedadesAdministradas, boolean residente_propietario) {
        this.nombre_usuario = nombre_usuario;
        this.email_usuario = email_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.ultimo_inicio_sesion = ultimo_inicio_sesion;
        this.bloqueado = bloqueado;
        this.propiedadesAdministradas = propiedadesAdministradas;
        this.residente_propietario = residente_propietario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }

    public LocalDateTime getUltimo_inicio_sesion() {
        return ultimo_inicio_sesion;
    }

    public void setUltimo_inicio_sesion(LocalDateTime ultimo_inicio_sesion) {
        this.ultimo_inicio_sesion = ultimo_inicio_sesion;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Set<Propiedad> getPropiedadesAdministradas() {
        return propiedadesAdministradas;
    }

    public void setPropiedadesAdministradas(Set<Propiedad> propiedadesAdministradas) {
        this.propiedadesAdministradas = propiedadesAdministradas;
    }

    public boolean isResidente_propietario() {
        return residente_propietario;
    }

    public void setResidente_propietario(boolean residente_propietario) {
        this.residente_propietario = residente_propietario;
    }

    @Override
    public String toString() {
        return "UsuarioWeb{" +
                "nombre_usuario='" + nombre_usuario + '\'' +
                ", email_usuario='" + email_usuario + '\'' +
                ", contrasenia_usuario='" + contrasenia_usuario + '\'' +
                ", ultimo_inicio_sesion=" + ultimo_inicio_sesion +
                ", bloqueado=" + bloqueado +
                ", propiedadesAdministradas=" + propiedadesAdministradas +
                ", residente_propietario=" + residente_propietario +
                '}';
    }
}
