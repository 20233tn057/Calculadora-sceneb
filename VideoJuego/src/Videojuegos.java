public class Videojuegos {

    private String titulo = "desconocido";
    private String plataforma = "desconocida";
    private String genero = "desconocido";
    private String clasificacion = "desconocida";
    private int anioLanzamiento = 0;

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    // Método para devolver información
    public String devolverInfo() {
        return "Título: " + getTitulo() +
                ", Plataforma: " + getPlataforma() +
                ", Género: " + getGenero() +
                ", Clasificación: " + getClasificacion() +
                ", Año de Lanzamiento: " + getAnioLanzamiento();
    }
}
