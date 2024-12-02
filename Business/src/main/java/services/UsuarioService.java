package services;

import dao.UsuarioDAO;
import interfaces.IUsuarioService;
import java.util.Date;
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
       // Asignar la fecha de registro automáticamente al insertar un usuario
        usuario.setFechaRegistro(new Date());
        
        // Llamar al DAO para insertar el usuario en la base de datos
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
    
    public boolean registrarUsuario(Usuario usuario) {
    try {
        // Verificar que los datos son válidos
        if (usuario.getNombre().isEmpty() || usuario.getApellido().isEmpty() || usuario.getCorreo().isEmpty() || usuario.getContrasenia().isEmpty()) {
            return false;
        }

        // Asignar la fecha de registro si es necesario
        if (usuario.getFechaRegistro() == null) {
            usuario.setFechaRegistro(new Date());
        }

        // Insertar el usuario en la base de datos
        usuarioDAO.insertar(usuario);

        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
}
