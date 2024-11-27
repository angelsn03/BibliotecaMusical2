package models;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import models.Album;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Acer
 */
public class Albumes {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public Albumes() {
        mongoClient = MongoClients.create();
        database = mongoClient.getDatabase("beatree");
        collection = database.getCollection("beatree");
    }
    /**
     * convierte el objeto album a documento
     * @param a objeto album
     * @return documento de un album
     */
    private Document objectToDocument(Album a){
        Document album = new Document()
                .append("id", a.getId())
                .append("nombre", a.getNombre())
                .append("fechaLanzamiento", a.getFechaLanzamiento())
                .append("genero", a.getGenero())
                .append("portadaPath", a.getPortadaPath())
                .append("canciones", a.getCanciones());
        return album;
    }
    /**
     * inserta un album a la coleccion
     * @param a album a insertar
     * @return id el album a insertar
     */
    public ObjectId insertAlbum(Album a){
        ObjectId id = new ObjectId();
        Document album = objectToDocument(a).append("id", id);
        collection.insertOne(album);
        return id;
    }
    /**
     * Actualiza todos los datos del album de acuerdo al id del album
     * @param a album a actualizar
     * @return modificacion del album
     */
    public boolean updateAlbum(Album a){
        try{
            Bson idQuery = Filters.eq("id", a.getId());
            Bson updates = Updates.combine(Updates.set("nombre", a.getNombre()), Updates.set("fechaLanzamiento", a.getFechaLanzamiento()), Updates.set("genero", a.getGenero()), Updates.set("portadaPath", a.getPortadaPath()), Updates.set("canciones", a.getCanciones()));
            UpdateResult result = collection.updateMany(idQuery, updates);
                System.out.println(result.getModifiedCount());
            return result.getModifiedCount() == 1;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Elimina un album en base al id
     * @param id id del album
     * @return elimina el album
     */
    public boolean deleteAlbumById(ObjectId id){
        try{
            Bson idQuery = Filters.eq("id", id);
            DeleteResult result = collection.deleteOne(idQuery);
                System.out.println(result.getDeletedCount());
            return result.getDeletedCount() == 1;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Album> getAlAlbumes(){
        ArrayList<Album> albumes = new ArrayList();
        
        MongoCursor<Document> cursor = collection.find().iterator();
        try{
            while(cursor.hasNext()){
                Document d = cursor.next();
                
                Album a = new Album(d.getString("id"), d.getDate("fehcaLanzamiento"), d.getString("genero"), d.getString("portadaPath"), d.getList(d, "canciones"));
                System.out.println(a.toString());
                albumes.add(a);
            }
            return albumes;
        }finally{
            cursor.close();
        }
    }
    
}
