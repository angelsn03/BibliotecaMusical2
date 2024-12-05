package services;

import dao.ArtistaDAO;
import insercionMasiva.InsercionMasiva;
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

    @Override
    public void insertarDatosMasivos() {
        List<Document> artistas = Arrays.asList(
    new Document("_id", new ObjectId()).append("nombre", "Gustavo Cerati").append("tipo", "solista")
        .append("imagenPath", "url_imagen_artista").append("genero", "Rock")
        .append("integrantes", Arrays.asList(
            new Document("_id", new ObjectId()).append("nombre", "Gustavo").append("apellido", "Cerati")
                .append("rol", "Vocalista").append("fechaIngreso", new Date()).append("estadoActivo", true)
        )),
    new Document("_id", new ObjectId()).append("nombre", "Soda Stereo").append("tipo", "banda")
        .append("imagenPath", "url_imagen_banda").append("genero", "Rock")
        .append("integrantes", Arrays.asList(
            new Document("_id", new ObjectId()).append("nombre", "Gustavo").append("apellido", "Cerati")
                .append("rol", "Vocalista").append("fechaIngreso", new Date()).append("estadoActivo", true),
            new Document("_id", new ObjectId()).append("nombre", "Zeta") .append("apellido", "Bosio")
                .append("rol", "Bajista").append("fechaIngreso", new Date()).append("estadoActivo", true),
            new Document("_id", new ObjectId()).append("nombre", "Charly") .append("apellido", "Almeida")
                .append("rol", "Baterista").append("fechaIngreso", new Date()).append("estadoActivo", true)
        ))
);

List<Document> albumes = Arrays.asList(
    new Document("_id", new ObjectId()).append("nombre", "Siempre es Hoy").append("fechaLanzamiento", new Date())
        .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(0).getObjectId("_id"))
        .append("canciones", Arrays.asList(
            new Document("_id", new ObjectId()).append("titulo", "Fantasma").append("duracion", "4:00"),
            new Document("_id", new ObjectId()).append("titulo", "Sudestada").append("duracion", "3:50"),
            new Document("_id", new ObjectId()).append("titulo", "Tu cicatriz en mí").append("duracion", "4:15")
        )),
    new Document("_id", new ObjectId()).append("nombre", "Bocanada").append("fechaLanzamiento", new Date())
        .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(0).getObjectId("_id"))
        .append("canciones", Arrays.asList(
            new Document("_id", new ObjectId()).append("titulo", "Bocanada").append("duracion", "4:30"),
            new Document("_id", new ObjectId()).append("titulo", "Puente").append("duracion", "4:00"),
            new Document("_id", new ObjectId()).append("titulo", "Beautiful").append("duracion", "3:45")
        )),
    new Document("_id", new ObjectId()).append("nombre", "Sueño Stereo").append("fechaLanzamiento", new Date())
        .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(1).getObjectId("_id"))
        .append("canciones", Arrays.asList(
            new Document("_id", new ObjectId()).append("titulo", "Ella usó mi cabeza como un revólver").append("duracion", "4:10"),
            new Document("_id", new ObjectId()).append("titulo", "Disco Eterno, Remasterizado 2007").append("duracion", "5:00"),
            new Document("_id", new ObjectId()).append("titulo", "Zoom, Remasterizado 2007").append("duracion", "4:25")
        )),
    new Document("_id", new ObjectId()).append("nombre", "Canción Animal").append("fechaLanzamiento", new Date())
        .append("genero", "Rock").append("portadaPath", "url_imagen_portada").append("artista", artistas.get(1).getObjectId("_id"))
        .append("canciones", Arrays.asList(
            new Document("_id", new ObjectId()).append("titulo", "Canción Animal").append("duracion", "4:35"),
            new Document("_id", new ObjectId()).append("titulo", "Hombre al agua").append("duracion", "4:25"),
            new Document("_id", new ObjectId()).append("titulo", "Entre Caníbales").append("duracion", "3:55")
        ))
);
        InsercionMasiva i = new InsercionMasiva();
        artistaDAO.insertArtistasYAlbumes(i.getArtistas(), i.getAlbumes());
    }
}
