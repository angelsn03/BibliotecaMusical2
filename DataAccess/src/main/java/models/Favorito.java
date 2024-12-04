package models;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class Favorito {
    private List<ObjectId> canciones;
    private List<ObjectId> albumes;
    private List<ObjectId> artistas;

    
    public Favorito(List<ObjectId> canciones, List<ObjectId> albumes, List<ObjectId> artistas) {
        this.canciones = canciones;
        this.albumes = albumes;
        this.artistas = artistas;
    }

    public List<ObjectId> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<ObjectId> canciones) {
        this.canciones = canciones;
    }

    public List<ObjectId> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<ObjectId> albumes) {
        this.albumes = albumes;
    }

    public List<ObjectId> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<ObjectId> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Favoritos{" + "canciones=" + canciones + '}';//", albumes=" + albumes + ", artistas=" + artistas + '}';
    }

    
}
