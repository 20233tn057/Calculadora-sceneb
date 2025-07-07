//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        int resultado;

        try {

            resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }catch (ArithmeticException e){
            System.out.println("El error es"+e.getMessage());

        }
        System.out.println("Hola");

        

    }
}