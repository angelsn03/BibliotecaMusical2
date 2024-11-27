
package models;

/**
 *
 * @author angelsn
 */
public class Cancion {
    private String id;
    private String titulo;
    private String duracion;

    public Cancion() {}

    public Cancion(String id, String titulo, String duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Cancion(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
