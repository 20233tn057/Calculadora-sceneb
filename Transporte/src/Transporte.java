public class Transporte {
    protected String marca;
    protected String modelo;
    protected String color;

    public Transporte(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void viajeTransporte() {
        System.out.println("Viajas en el siguiente transporte: ");
    }
}
