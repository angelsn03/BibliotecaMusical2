package interfaces;

import java.util.List;
import models.Usuario;

/**
 *
 * @author angelsn
 */
public interface IUsuarioService {
    void insertarUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario buscarUsuarioPorId(String id);
    void actualizarUsuario(String id, Usuario usuarioActualizado);
    void eliminarUsuario(String id);
}

