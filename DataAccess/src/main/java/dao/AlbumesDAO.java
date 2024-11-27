package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import connection.ConexionBD;
import interfaces.IAlbumes;
import models.Album;

/**
 *
 * @author Acer
 */
public class AlbumesDAO implements IAlbumes{
    
    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("albumes", Album.class);
        return collection;
    }
    
    /**
     * Agrega un album a la coleccion
     * @param a album a a agregar
     * @return true si el album se agrego correctamente, false en caso contrario
     */
    public boolean agregar(Album a){
        try{
            this.getCollection().insertOne(a);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean actualizar(Album a){
        try{
            UpdateResult result = this.getCollection().updateOne(eq("id", a.getId()), combine(set("nombre", a.getNombre()), set("fechaLanzamiento", a.getFechaLanzamiento()), set("genero", a.getGenero()), set("portadaPath", a.getPortadaPath()), set("canciones", a.getCanciones())));
            return result.getModifiedCount() == 1;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
