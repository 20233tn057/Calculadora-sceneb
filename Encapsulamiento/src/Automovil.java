public class Automovil{

    private String marca="Generico";
     private String modelo="Generico";
     private String  color="Gris";
   private  int Anos=0000;

    public int getAnos() {
        return this.Anos;
    }

    public void setAnos(int Anos) {
        this.Anos = Anos;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {

        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marcas) {
        this.marca = marca;


    }
    public  String devolverInfo(){
        String informacion="Marca"+getMarca()+ "Modelo"+getModelo()+"Color"+getColor()+"Años"+getAnos();
        return  informacion;
    }
}
