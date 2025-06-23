import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

        System.out.println("=== Ingresa los datos del primer Pokémon ===");
        pikachu.ingresarDatos(sc);

        System.out.println("=== Ingresa los datos del segundo Pokémon ===");
        charizard.ingresarDatos(sc);

        // Mostrar la información y evolucionar
        pikachu.mostrarInformacion();
        pikachu.evolucionar();

        charizard.mostrarInformacion();
        charizard.evolucionar();

        sc.close();
    }
}
