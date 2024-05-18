package co.edu.unbosque.modelo.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class UsuarioWebDTO {
    private String nombre_usuario;
    private String email_usuario;
    private String contrasenia_usuario;
    private LocalDate ultimo_inicio_sesion;
    private boolean bloqueado;
    private boolean propiedad_administrador;
    private boolean residente_propietario;

    public UsuarioWebDTO() {
    }

    public UsuarioWebDTO(String nombre_usuario, String email_usuario, String contrasenia_usuario, LocalDate ultimo_inicio_sesion, boolean bloqueado, boolean propiedad_administrador, boolean residente_propietario) {
        this.nombre_usuario = nombre_usuario;
        this.email_usuario = email_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.ultimo_inicio_sesion = ultimo_inicio_sesion;
        this.bloqueado = bloqueado;
        this.propiedad_administrador = propiedad_administrador;
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

    public LocalDate getUltimo_inicio_sesion() {
        return ultimo_inicio_sesion;
    }

    public void setUltimo_inicio_sesion(LocalDate ultimo_inicio_sesion) {
        this.ultimo_inicio_sesion = ultimo_inicio_sesion;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean isPropiedad_administrador() {
        return propiedad_administrador;
    }

    public void setPropiedad_administrador(boolean propiedad_administrador) {
        this.propiedad_administrador = propiedad_administrador;
    }

    public boolean isResidente_propietario() {
        return residente_propietario;
    }

    public void setResidente_propietario(boolean residente_propietario) {
        this.residente_propietario = residente_propietario;
    }

    @Override
    public String toString() {
        return "UsuarioWebDTO{" +
                "nombre_usuario='" + nombre_usuario + '\'' +
                ", email_usuario='" + email_usuario + '\'' +
                ", contrasenia_usuario='" + contrasenia_usuario + '\'' +
                ", ultimo_inicio_sesion=" + ultimo_inicio_sesion +
                ", bloqueado=" + bloqueado +
                ", propiedad_administrador=" + propiedad_administrador +
                ", residente_propietario=" + residente_propietario +
                '}';
    }
}
