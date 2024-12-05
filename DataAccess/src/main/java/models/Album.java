package models;

import java.awt.Image;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class Album {
    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String genero;
    private String portadaPath;
    private List<Cancion> canciones;
    //private Artista artistaId;

    public Album() {
    }

    public Album(ObjectId id) {
        this.id = id;
    }

    public Album(String nombre, String fechaLanzamiento, String genero, List<Cancion> canciones) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.nombre = nombre;
        this.fechaLanzamiento = LocalDate.parse(fechaLanzamiento, formatter);
        this.genero = genero;
        this.portadaPath = "/albumes/"+nombre+".png";
        this.canciones = canciones;
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

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPortadaPath() {
        return portadaPath;
    }

    public void setPortadaPath(String portadaPath) {
        this.portadaPath = portadaPath;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    // Espero que este método funcione
    public ImageIcon getImageIcon() {
        try {
            InputStream is = getClass().getResourceAsStream(portadaPath);
            if (is != null) {
                Image image = ImageIO.read(is);
                Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            } else {
                // Devuelve una imagen por defecto desde el classpath
                is = getClass().getResourceAsStream("/artistas/default_image.png");
                Image image = ImageIO.read(is);
                Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

//    public Artista getArtistaId() {
//        return artistaId;
//    }
//
//    public void setArtistaId(Artista artistaId) {
//        this.artistaId = artistaId;
////    }

    @Override
    public String toString() {
        return "Albumes{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", genero=" + genero + ", portadaPath=" + portadaPath + ", canciones=" + canciones + ", artistaId="+ '}'; //+ artistaId + '}';
    }
    
    
}
