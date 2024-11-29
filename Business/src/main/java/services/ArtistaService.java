package services;

import dao.ArtistaDAO;
import interfaces.IArtistaService;
import java.util.List;
import models.Artista;

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
}
