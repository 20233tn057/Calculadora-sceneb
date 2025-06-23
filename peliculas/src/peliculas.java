public class peliculas {

    String titulo;
    String director;
    String genero;
    int duracion;
    String clasificacion;

    // Constructores
    public peliculas() {
    }

    public peliculas(String titulo) {
        this.titulo = titulo;
    }

    public peliculas(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public peliculas(String titulo, String director, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
    }

    public peliculas(String titulo, String director, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    public peliculas(String titulo, String director, String genero, int duracion, String clasificacion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Director: " + this.director);
        System.out.println("Género: " + this.genero);
        System.out.println("Duración: " + this.duracion + " minutos");
        System.out.println("Clasificación: " + this.clasificacion);
    }
}
