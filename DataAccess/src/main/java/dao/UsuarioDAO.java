package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import connection.ConexionBD;
import interfaces.IUsuarioDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Usuario;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author angelsn
 */
public class UsuarioDAO implements IUsuarioDAO{
    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("usuarios", Usuario.class);
        return collection;
    }
    
    @Override
    public void insertar(Usuario usuario) {
        //Verifica que la fecha de registro no este asignada
        if (usuario.getFechaRegistro() == null) {
            //Asigna la fecha de registro
            usuario.setFechaRegistro(new Date());
        }
        MongoCollection<Usuario> collection = getCollection();
        collection.insertOne(usuario);
        System.out.println("Usuario insertado correctamente.");
    }

    @Override
    public List<Usuario> obtenerTodos() {
        List<Usuario> albumes = new ArrayList<>();
        MongoCollection<Usuario> collection = getCollection();
        try (MongoCursor<Usuario> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                albumes.add(cursor.next());
            }
        }
        return albumes;
    }

    @Override
    public Usuario buscarPorId(String id) {
        MongoCollection<Usuario> collection = getCollection();
        return collection.find(eq("_id", new ObjectId(id))).first();
    }
    
    public Usuario buscarPorCorreo(String correo){
        MongoCollection<Usuario> collection = getCollection();
        return collection.find(eq("correo", correo)).first();
    }

    @Override
    public void actualizar(String id, Usuario usuarioActualizado) {
        MongoCollection<Usuario> collection = getCollection();
        collection.replaceOne(eq("_id", new ObjectId(id)), usuarioActualizado);
        System.out.println("Usuario actualizado correctamente.");
    }

    @Override
    public void eliminar(String id) {
        MongoCollection<Usuario> collection = getCollection();
        collection.deleteOne(eq("_id", new ObjectId(id)));
        System.out.println("Usuario eliminado correctamente.");
    }
    
    public void agregarCancionAFavoritos(ObjectId usuarioId, String titulo, String duracion) {
        
        MongoCollection<Document> collection = getCollection();

        // Crear un identificador único basado en título y duración
        Document cancion = new Document("titulo", titulo).append("duracion", duracion);

        // Agregar la canción a la lista de favoritos del usuario
        collection.updateOne(
                Filters.eq("_id", usuarioId),
                Updates.addToSet("favoritos.canciones", cancion)
        );
    }
}
