import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    // READ
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    // UPDATE
    public void actualizarUsuario(int id, Usuario nuevo) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario() == id) {
                u.setNombreUsuario(nuevo.getNombreUsuario());
                u.setContraseña(nuevo.getContraseña());
                u.setTipoUsuario(nuevo.getTipoUsuario());
            }
        }
    }

    // DELETE
    public void eliminarUsuario(int id) {
        usuarios.removeIf(u -> u.getIdUsuario() == id);
    }
}
