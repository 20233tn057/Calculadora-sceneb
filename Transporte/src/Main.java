//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil Autovil = new Automovil("Dodge", "Challenger", "Negro", 2, 807);
        Motocicleta Motocicleta = new Motocicleta("BMW", "S1000RR", "Negro", 999);
        Autobus Autobus = new Autobus("Mercedes", "Sprinter", "Blanco", 40, "MCV9876", "19");

        Autovil.viajeTransporte();
        Motocicleta.viajeTransporte();
        Autobus.viajeTransporte();
    }
}
