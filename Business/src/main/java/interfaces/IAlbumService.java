package interfaces;

import java.util.List;
import models.Album;

/**
 *
 * @author angelsn
 */
public interface IAlbumService {
    void insertarAlbum(Album album);
    List<Album> obtenerTodosLosAlbumes();
    Album buscarAlbumPorId(String id);
    void actualizarAlbum(String id, Album albumActualizado);
    void eliminarAlbum(String id);
}

