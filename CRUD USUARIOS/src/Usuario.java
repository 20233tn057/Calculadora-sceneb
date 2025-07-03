public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String tipoUsuario; // "Superadmin" o "Admin"

    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los atributos
    public Usuario(int idUsuario, String nombreUsuario, String contraseña, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // Método para mostrar la info del usuario (opcional)
    public void mostrarInfo() {
        System.out.println("ID: " + idUsuario);
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Tipo: " + tipoUsuario);
        System.out.println("----------------------");
    }
}
