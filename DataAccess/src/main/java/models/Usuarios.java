package models;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class Usuarios {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String imagenPath;
    private Date fechaRegistro;
    private Favoritos favoritos;

    public Usuarios() {
    }

    public Usuarios(String id) {
        this.id = id;
    }

    public Usuarios(String nombre, String apellido, String correo, String imagenPath, Date fechaRegistro, Favoritos favoritos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagenPath = imagenPath;
        this.fechaRegistro = fechaRegistro;
        this.favoritos = favoritos;
    }

    public Usuarios(String id, String nombre, String apellido, String correo, String imagenPath, Date fechaRegistro, Favoritos favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagenPath = imagenPath;
        this.fechaRegistro = fechaRegistro;
        this.favoritos = favoritos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", imagenPath=" + imagenPath + ", fechaRegistro=" + fechaRegistro + ", favoritos=" + favoritos + '}';
    }
    
    
}
