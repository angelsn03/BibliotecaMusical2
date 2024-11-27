/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.ICancionDAO;
import models.Cancion;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author angelsn
 */
public class CancionDAO implements ICancionDAO{

    private final MongoCollection<Document> collection;

    public CancionDAO(MongoDatabase database) {
        this.collection = database.getCollection("canciones");
    }
    
    @Override
    public void insertar(Cancion cancion) {
        Document cancionDocument = new Document();
        try {
            cancionDocument.append("titulo", cancion.getTitulo())
                    .append("duracion", cancion.getDuracion());
            
            collection.insertOne(cancionDocument);
            
            ObjectId objectId = cancionDocument.getObjectId("_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
