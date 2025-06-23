public class Cancion {
    String artista;
    String titulo;
    String disquera;
    String album;

    public Cancion(String artista, String titulo, String disquera, String album) {
        this.artista = artista;
        this.titulo = titulo;
        this.disquera = disquera;
        this.album = album;
    }

    public void mostrarInfo() {
        System.out.println("Artista: " + artista);
        System.out.println("Título: " + titulo);
        System.out.println("Disquera: " + disquera);
        System.out.println("Álbum: " + album);

    }
}
