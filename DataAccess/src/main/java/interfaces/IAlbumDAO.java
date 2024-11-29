package interfaces;

import models.Album;

import java.util.List;
/**
 *
 * @author Acer
 */
public interface IAlbumDAO {
    void insertar(Album album);
    List<Album> obtenerTodos();
    Album buscarPorId(String id);
    void actualizar(String id, Album albumActualizado);
    void eliminar(String id);
}
