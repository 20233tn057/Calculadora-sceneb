public class Main {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // Crear usuarios
        dao.agregarUsuario(new Usuario(1, "superadmin", "1234", "Superadmin"));
        dao.agregarUsuario(new Usuario(2, "admin1", "adminpass", "Admin"));

        // Leer usuarios
        for (Usuario u : dao.listarUsuarios()) {
            System.out.println("Usuario: " + u.getNombreUsuario() + " | Tipo: " + u.getTipoUsuario());
        }

        // Actualizar usuario
        dao.actualizarUsuario(2, new Usuario(2, "admin1mod", "newpass", "Admin"));

        // Eliminar usuario
        dao.eliminarUsuario(1);
    }
}
