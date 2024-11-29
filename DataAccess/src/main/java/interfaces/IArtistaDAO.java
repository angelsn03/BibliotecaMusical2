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
public interface IArtistaDAO {
    void insertar(Artista artista);
    List<Artista> obtenerTodos();
    Artista buscarPorId(String id);
    void actualizar(String id, Artista artistaActualizado);
    void eliminar(String id);
}
