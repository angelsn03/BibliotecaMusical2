/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import connection.ConexionBD;
import interfaces.IUsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import models.Usuario;
import org.bson.types.ObjectId;

/**
 *
 * @author angelsn
 */
public class UsuarioDAO implements IUsuarioDAO{
    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("artistas", Usuario.class);
        return collection;
    }
    
    @Override
    public void insertar(Usuario usuario) {
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
}
