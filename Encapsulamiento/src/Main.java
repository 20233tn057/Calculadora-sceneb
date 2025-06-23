//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Automovil nissan = new Automovil();
   nissan.setMarca("Nissan");
   nissan.setModelo("Tsuru") ;
   nissan.setAnos(2024);
   nissan.setColor("Gris");
   System.out.println(nissan);



        System.out.println("nissan.marca" + nissan.devolverInfo());
    }
}