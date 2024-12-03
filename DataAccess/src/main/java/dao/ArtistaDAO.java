package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import connection.ConexionBD;
import interfaces.IArtistaDAO;
import java.util.ArrayList;
import java.util.List;
import models.Album;
import models.Artista;
import org.bson.Document;
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
    
//    public void insertArtistasYAlbumes(List<Document> artistas, List<Document> albumes) {
//        ConexionBD conexion = new ConexionBD();
//        MongoDatabase database = conexion.crearConexion();
//        MongoCollection<Document> artistasCollection = database.getCollection("artistas");
//        MongoCollection<Document> albumesCollection = database.getCollection("albumes");
//
//        artistasCollection.insertMany(artistas);
//        albumesCollection.insertMany(albumes);
//
//        conexion.cerrarConexion();
//    }
    
    public void insertArtistasYAlbumes(List<Artista> artistas, List<Album> albumes) {
        ConexionBD conexion = new ConexionBD();
        MongoDatabase database = conexion.crearConexion();
        MongoCollection<Document> artistasCollection = database.getCollection("artistas");
        MongoCollection<Document> albumesCollection = database.getCollection("albumes");

        // Convertir los artistas a Document
        List<Document> artistasDocs = artistas.stream().map(artista -> {
            Document doc = new Document("nombre", artista.getNombre())
                    .append("tipo", artista.getTipo())
                    .append("imagenPath", artista.getImagenPath())
                    .append("género", artista.getGenero())
                    .append("integrantes", artista.getIntegrantes().stream().map(integrante -> 
                        new Document("nombre", integrante.getNombre())
                            .append("apellido", integrante.getApellido())
                            .append("rol", integrante.getRol())
                            .append("fechaIngreso", integrante.getFechaIngreso())
                            .append("fechaSalida", integrante.getFechaSalida())
                            .append("estadoActivo", integrante.isEstadoActivo())
                    ).toList());
            return doc;
        }).toList();

        // Convertir los álbumes a Document
        List<Document> albumesDocs = albumes.stream().map(album -> {
            Document doc = new Document("nombre", album.getNombre())
                    .append("fechaLanzamiento", album.getFechaLanzamiento())
                    .append("género", album.getGenero())
                    .append("portadaPath", album.getPortadaPath())
                    .append("canciones", album.getCanciones().stream().map(cancion -> 
                        new Document("título", cancion.getTitulo())
                            .append("duración", cancion.getDuracion())
                    ).toList());
            return doc;
        }).toList();

        // Inserción masiva
        artistasCollection.insertMany(artistasDocs);
        albumesCollection.insertMany(albumesDocs);

        conexion.cerrarConexion();
    }
}
