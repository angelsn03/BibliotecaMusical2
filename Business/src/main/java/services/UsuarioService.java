package services;

import dao.UsuarioDAO;
import interfaces.IUsuarioService;
import java.util.List;
import models.Usuario;

/**
 *
 * @author angelsn
 */
public class UsuarioService implements IUsuarioService {

    private final UsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioDAO.obtenerTodos();
    }

    @Override
    public Usuario buscarUsuarioPorId(String id) {
        return usuarioDAO.buscarPorId(id);
    }

    @Override
    public void actualizarUsuario(String id, Usuario usuarioActualizado) {
        usuarioDAO.actualizar(id, usuarioActualizado);
    }

    @Override
    public void eliminarUsuario(String id) {
        usuarioDAO.eliminar(id);
    }
}
