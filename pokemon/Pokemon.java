import java.util.Scanner;

public class Pokemon {
    // Atributos
    String nombre;
    String tipo;
    boolean buenoMalo;
    int nivel;


    // Método para evolucionar
    void evolucionar() {
        nivel += 10;
        System.out.println(nombre + " ha evolucionado y su nivel ahora es: " + nivel);
    }

    // Método para leer datos del usuario
    void ingresarDatos(Scanner sc) {
        System.out.print("Ingresa el nombre del Pokémon: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa el tipo del Pokémon: ");
        tipo = sc.nextLine();

        System.out.print("Ingresa el nivel del Pokémon: ");
        nivel = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
    }

    // Método para mostrar información
    void mostrarInformacion() {
        System.out.println("\n--- Información del Pokémon ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
    }
}
