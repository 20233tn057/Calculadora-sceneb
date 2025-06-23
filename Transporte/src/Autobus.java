public class Autobus extends Transporte {
    private int capacidadPersonas;
    private String numeroAutobus;
    private String numeroEconomico;

    public Autobus(String marca, String modelo, String color, int capacidadPersonas,
                   String numeroAutobus, String numeroEconomico) {
        super(marca, modelo, color);
        this.capacidadPersonas = capacidadPersonas;
        this.numeroAutobus = numeroAutobus;
        this.numeroEconomico = numeroEconomico;
    }

    @Override
    public void viajeTransporte() {
        System.out.println("Estás viajando en el autobús número " + numeroAutobus +
                ", económico " + numeroEconomico + ", con capacidad para " + capacidadPersonas + " personas.");
    }
}
