package models;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class Usuario {
    private ObjectId id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String imagenPath;
    private Date fechaRegistro;
    private List<Favorito> favoritos;

    public Usuario() {
    }

    public Usuario(ObjectId id) {
        this.id = id;
    }

    public Usuario(ObjectId id, String nombre, String apellido, String correo, String contrasenia, String imagenPath, Date fechaRegistro, List<Favorito> favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.imagenPath = imagenPath;
        this.fechaRegistro = fechaRegistro;
        this.favoritos = favoritos;
    }

    public Usuario(String nombre, String apellido, String correo, String contrasenia, String imagenPath, Date fechaRegistro, List<Favorito> favoritos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.imagenPath = imagenPath;
        this.fechaRegistro = fechaRegistro;
        this.favoritos = favoritos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", imagenPath=" + imagenPath + ", fechaRegistro=" + fechaRegistro + ", favoritos=" + favoritos + '}';
    }
    
    
}
