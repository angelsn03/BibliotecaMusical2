/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Usuario;

/**
 *
 * @author angelsn
 */
public interface IUsuarioDAO {
    void insertar(Usuario usuario);
    List<Usuario> obtenerTodos();
    Usuario buscarPorId(String id);
    void actualizar(String id, Usuario usuarioActualizado);
    void eliminar(String id);
}
