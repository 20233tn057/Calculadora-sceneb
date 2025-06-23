public class Automovil extends Transporte {
    private int numeroPuertas;
    private int caballosDeFuerza;

    public Automovil(String marca, String modelo, String color, int numeroPuertas, int caballosDeFuerza) {
        super(marca, modelo, color);
        this.numeroPuertas = numeroPuertas;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public void viajeTransporte() {
        System.out.println("Estás viajando en un automóvil " + marca + " modelo " + modelo + " color " + color +
                " con " + numeroPuertas + " puertas y " + caballosDeFuerza + " caballos de fuerza.");
    }
}
