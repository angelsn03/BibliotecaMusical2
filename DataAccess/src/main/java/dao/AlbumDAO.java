package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import connection.ConexionBD;
import interfaces.IAlbumDAO;
import java.util.ArrayList;
import java.util.List;
import models.Album;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class AlbumDAO implements IAlbumDAO{
    
    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("albumes", Album.class);
        return collection;
    }
    
    @Override
    public void insertar(Album album) {
        MongoCollection<Album> collection = getCollection();
        collection.insertOne(album);
        System.out.println("Álbum insertado correctamente.");
    }

    @Override
    public List<Album> obtenerTodos() {
        List<Album> albumes = new ArrayList<>();
        MongoCollection<Album> collection = getCollection();
        try (MongoCursor<Album> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                albumes.add(cursor.next());
            }
        }
        return albumes;
    }

    @Override
    public Album buscarPorId(String id) {
        MongoCollection<Album> collection = getCollection();
        return collection.find(eq("_id", new ObjectId(id))).first();
    }

    @Override
    public void actualizar(String id, Album albumActualizado) {
        MongoCollection<Album> collection = getCollection();
        collection.replaceOne(eq("_id", new ObjectId(id)), albumActualizado);
        System.out.println("Álbum actualizado correctamente.");
    }

    @Override
    public void eliminar(String id) {
        MongoCollection<Album> collection = getCollection();
        collection.deleteOne(eq("_id", new ObjectId(id)));
        System.out.println("Álbum eliminado correctamente.");
    }
}
