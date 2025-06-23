public class Motocicleta extends Transporte {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, String color, int cilindrada) {
        super(marca, modelo, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public void viajeTransporte() {
        System.out.println("Estás viajando en una motocicleta " + marca + " modelo " + modelo + " de " + cilindrada + "cc.");
    }
}
