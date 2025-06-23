//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Recursoshumanos rh = new Recursoshumanos("Ana", 202, 18000.0, "Alto");
        Produccion prod = new Produccion("Pedro", 303, 20000.0, "Noche");
        Contabilidad cont = new Contabilidad("Paola", 505, 12000.0, "Permanente");
        SoporteTecnico soporte = new SoporteTecnico("Diego", 606, 13000.0, "Nivel 2");

        rh.mostrarDatos();
        prod.mostrarDatos();
        cont.mostrarDatos();
        soporte.mostrarDatos();
    }
}
