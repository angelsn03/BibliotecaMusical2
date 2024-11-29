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
import interfaces.IArtistaDAO;
import java.util.ArrayList;
import java.util.List;
import models.Artista;
import org.bson.types.ObjectId;

/**
 *
 * @author angelsn
 */
public class ArtistaDAO implements IArtistaDAO{
    private MongoCollection getCollection() {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection collection = database.getCollection("artistas", Artista.class);
        return collection;
    }
    
    @Override
    public void insertar(Artista artista) {
        MongoCollection<Artista> collection = getCollection();
        collection.insertOne(artista);
        System.out.println("Artista insertado correctamente.");
    }

    @Override
    public List<Artista> obtenerTodos() {
        List<Artista> albumes = new ArrayList<>();
        MongoCollection<Artista> collection = getCollection();
        try (MongoCursor<Artista> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                albumes.add(cursor.next());
            }
        }
        return albumes;
    }

    @Override
    public Artista buscarPorId(String id) {
        MongoCollection<Artista> collection = getCollection();
        return collection.find(eq("_id", new ObjectId(id))).first();
    }

    @Override
    public void actualizar(String id, Artista albumActualizado) {
        MongoCollection<Artista> collection = getCollection();
        collection.replaceOne(eq("_id", new ObjectId(id)), albumActualizado);
        System.out.println("Artista actualizado correctamente.");
    }

    @Override
    public void eliminar(String id) {
        MongoCollection<Artista> collection = getCollection();
        collection.deleteOne(eq("_id", new ObjectId(id)));
        System.out.println("Artista eliminado correctamente.");
    }
}
