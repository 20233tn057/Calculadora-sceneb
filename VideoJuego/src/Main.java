
public class Main {
    public static void main(String[] args) {
        // Videojuego 1: Minecraft
        Videojuegos juego1 = new Videojuegos();
        juego1.setTitulo("Minecraft");
        juego1.setPlataforma("Multiplataforma (PC, Consolas, Móviles)");
        juego1.setGenero("Sandbox, Supervivencia");
        juego1.setClasificacion("E10+");
        juego1.setAnioLanzamiento(2011);

        // Videojuego 2: Plantas vs. Zombies
        Videojuegos juego2 = new Videojuegos();
        juego2.setTitulo("Plantas vs. Zombies");
        juego2.setPlataforma("Multiplataforma (PC, Consolas, Móviles)");
        juego2.setGenero("Defensa de torres, Estrategia");
        juego2.setClasificacion("E10+");
        juego2.setAnioLanzamiento(2009);

        // Videojuego 3: GTA V
        Videojuegos juego3 = new Videojuegos();
        juego3.setTitulo("Grand Theft Auto V");
        juego3.setPlataforma("Multiplataforma (PC, Consolas)");
        juego3.setGenero("Acción-Aventura, Mundo Abierto");
        juego3.setClasificacion("M (Mature 17+)");
        juego3.setAnioLanzamiento(2013);

        // Mostrar información
        System.out.println(juego1.devolverInfo());
        System.out.println(juego2.devolverInfo());
        System.out.println(juego3.devolverInfo());
    }
}
