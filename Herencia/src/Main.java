//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(
                "Alex", "Fernández", "Reyes",
                "FERA010101HDFRNL09", 23,
                "A12345", "Ingeniería en Sistemas", "3B"
        );

        alumno.saludar(); // Llama al método sobrescrito
    }
}
