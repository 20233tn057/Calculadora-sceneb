public class Persona {
    protected String nombre;
    protected String apellidopaterno;
    protected String apellidomaterno;
    protected String curp;
    protected int edad;

    public Persona(String nombre, String apellidopaterno, String apellidomaterno, String curp, int edad) {
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.curp = curp;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidopaterno() { return apellidopaterno; }
    public void setApellidopaterno(String apellidopaterno) { this.apellidopaterno = apellidopaterno; }

    public String getApellidomaterno() { return apellidomaterno; }
    public void setApellidomaterno(String apellidomaterno) { this.apellidomaterno = apellidomaterno; }

    public String getCurp() { return curp; }
    public void setCurp(String curp) { this.curp = curp; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellidopaterno + " " + apellidomaterno);
    }
}
