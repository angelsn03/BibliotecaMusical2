/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Artista;

/**
 *
 * @author angelsn
 */
public interface IArtistaService {
    void insertarArtista(Artista artista);
    List<Artista> obtenerTodosLosArtistas();
    Artista buscarArtistaPorId(String id);
    void actualizarArtista(String id, Artista artistaActualizado);
    void eliminarArtista(String id);
    public void insertarDatosMasivos();
}

