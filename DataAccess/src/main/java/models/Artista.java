
package models;

import java.awt.Image;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.bson.types.ObjectId;
/**
 *
 * @author angelsn
 */

public class Artista {
    private ObjectId id;
    private String nombre;
    private String tipo;  // Puede ser "banda" o "solista"
    private String imagenPath;
    private String genero;
    private List<Integrante> integrantes;
    

    // Constructores
    public Artista() {
    }

    public Artista(String nombre, String tipo, String genero, List<Integrante> integrantes) {
        this.id = new ObjectId();
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenPath = "/artistas/"+nombre+".png";
//        this.imagenPath = System.getProperty("user.dir")
//                .replace("Presentacion", "DataAccess") + "/src/main/resources/artistas/" + nombre + ".png";
        this.genero = genero;
        this.integrantes = integrantes;
    }

    

    // Getters y Setters
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    
    

    // Espero que este método funcione
    // Funcionó pero dejó de hacerlo XDDDDDDD
    public ImageIcon getImageIcon() {
        try {
            InputStream is = getClass().getResourceAsStream(imagenPath);
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
    
    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", imagenPath='" + imagenPath + '\'' +
                ", genero='" + genero + '\'' +
                ", integrantes=" + integrantes +
                '}';
    }
}

