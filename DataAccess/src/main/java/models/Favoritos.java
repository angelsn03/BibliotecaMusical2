package models;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class Favoritos {
    private List<Cancion> canciones;
//    private List<Album> albumes;
//    private List<Artista> artistas;

    
    // Constructor
//    public Favoritos(List<Cancion> canciones, List<Album> albumes, List<Artista> artistas) {
//        this.canciones = canciones;
//        this.albumes = albumes;
//        this.artistas = artistas;
//    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

//    public List<Album> getAlbumes() {
//        return albumes;
//    }
//
//    public void setAlbumes(List<Album> albumes) {
//        this.albumes = albumes;
//    }
//
//    public List<Artista> getArtistas() {
//        return artistas;
//    }
//
//    public void setArtistas(List<Artista> artistas) {
//        this.artistas = artistas;
//    }

    @Override
    public String toString() {
        return "Favoritos{" + "canciones=" + canciones + '}';//", albumes=" + albumes + ", artistas=" + artistas + '}';
    }

    
}
