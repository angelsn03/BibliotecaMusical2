package services;

import dao.ArtistaDAO;
import interfaces.IArtistaService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import models.Artista;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author angelsn
 */
public class ArtistaService implements IArtistaService {

    private final ArtistaDAO artistaDAO;

    public ArtistaService() {
        this.artistaDAO = new ArtistaDAO();
    }

    @Override
    public void insertarArtista(Artista artista) {
        artistaDAO.insertar(artista);
    }

    @Override
    public List<Artista> obtenerTodosLosArtistas() {
        return artistaDAO.obtenerTodos();
    }

    @Override
    public Artista buscarArtistaPorId(String id) {
        return artistaDAO.buscarPorId(id);
    }

    @Override
    public void actualizarArtista(String id, Artista artistaActualizado) {
        artistaDAO.actualizar(id, artistaActualizado);
    }

    @Override
    public void eliminarArtista(String id) {
        artistaDAO.eliminar(id);
    }
    
    public void insertarDatosMasivos() {
        List<Document> artistas = Arrays.asList(
            new Document("_id", new ObjectId()).append("nombre", "Caifanes").append("tipo", "banda")
                .append("imagenPath", "url_imagen_banda").append("genero", "Rock Progresivo")
                .append("integrantes", Arrays.asList(
                    new Document("_id", new ObjectId()).append("nombre", "Saul").append("apellido", "Hernandez")
                        .append("rol", "Vocalista").append("fechaIngreso", new Date()).append("estadoActivo", true)
                )),
            new Document("_id", new ObjectId()).append("nombre", "Jaguares").append("tipo", "banda")
                .append("imagenPath", "url_imagen_banda").append("genero", "Rock Progresivo")
                .append("integrantes", Arrays.asList(
                    new Document("_id", new ObjectId()).append("nombre", "Alfonso").append("apellido", "André")
                        .append("rol", "Baterista").append("fechaIngreso", new Date()).append("estadoActivo", true)
                ))
        );

        List<Document> albumes = Arrays.asList(
            new Document("_id", new ObjectId()).append("nombre", "El silencio").append("fechaLanzamiento", new Date())
                .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(0).getObjectId("_id"))
                .append("canciones", Arrays.asList(
                    new Document("_id", new ObjectId()).append("titulo", "Debajo de tu piel").append("duracion", "4:20"),
                    new Document("_id", new ObjectId()).append("titulo", "Nos vamos juntos").append("duracion", "3:45")
                )),
            new Document("_id", new ObjectId()).append("nombre", "Mátenme porque me muero").append("fechaLanzamiento", new Date())
                .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(0).getObjectId("_id"))
                .append("canciones", Arrays.asList(
                    new Document("_id", new ObjectId()).append("titulo", "Mátenme porque me muero").append("duracion", "3:50"),
                    new Document("_id", new ObjectId()).append("titulo", "Viento").append("duracion", "4:00")
                )),
            new Document("_id", new ObjectId()).append("nombre", "Bajo el azul de tu misterio").append("fechaLanzamiento", new Date())
                .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(1).getObjectId("_id"))
                .append("canciones", Arrays.asList(
                    new Document("_id", new ObjectId()).append("titulo", "Fin").append("duracion", "4:30"),
                    new Document("_id", new ObjectId()).append("titulo", "Mantarraya").append("duracion", "4:50")
                ))
        );

        artistaDAO.insertArtistasYAlbumes(artistas, albumes);
    }
}
