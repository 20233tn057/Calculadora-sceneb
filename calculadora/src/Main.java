//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double num1 = 0, num2 = 0;
            boolean operacionValida = false;

            // Leer el primer numero
            while (!operacionValida) {
                try {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = Double.parseDouble(scanner.nextLine());
                    operacionValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Por favor ingresa un numero valido.");
                }
            }

            operacionValida = false;

            // Leer el segundo numero
            while (!operacionValida) {
                try {
                    System.out.print("Ingresa el segundo numero: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    operacionValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Por favor ingresa un numero valido.");
                }
            }

            // Mostrar menu de operaciones
            System.out.println("Selecciona una operacion:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion = 0;
            operacionValida = false;

            // Leer la opcion del usuario
            while (!operacionValida) {
                try {
                    System.out.print("Opcion: ");
                    opcion = Integer.parseInt(scanner.nextLine());
                    operacionValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingresa un numero entre 1 y 4.");
                }
            }

            // Realizar la operacion
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            scanner.close();
        }
    }
