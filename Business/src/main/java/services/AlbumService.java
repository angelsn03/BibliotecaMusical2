package services;

import dao.AlbumDAO;
import interfaces.IAlbumService;
import java.util.List;
import models.Album;

/**
 *
 * @author angelsn
 */
public class AlbumService implements IAlbumService {

    private final AlbumDAO albumDAO;

    public AlbumService() {
        this.albumDAO = new AlbumDAO();
    }

    @Override
    public void insertarAlbum(Album album) {
        albumDAO.insertar(album);
    }

    @Override
    public List<Album> obtenerTodosLosAlbumes() {
        return albumDAO.obtenerTodos();
    }

    @Override
    public Album buscarAlbumPorId(String id) {
        return albumDAO.buscarPorId(id);
    }

    @Override
    public void actualizarAlbum(String id, Album albumActualizado) {
        albumDAO.actualizar(id, albumActualizado);
    }

    @Override
    public void eliminarAlbum(String id) {
        albumDAO.eliminar(id);
    }
}
