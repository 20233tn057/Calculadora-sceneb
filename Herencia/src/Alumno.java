public class Alumno extends Persona {
    protected String matricula;
    protected String carrera;
    protected String gradoGrupo;

    public Alumno(String nombre, String apellidopaterno, String apellidomaterno, String curp, int edad,
                  String matricula, String carrera, String gradoGrupo) {
        super(nombre, apellidopaterno, apellidomaterno, curp, edad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.gradoGrupo = gradoGrupo;
    }

    // Getters y setters si los necesitas
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getGradoGrupo() { return gradoGrupo; }
    public void setGradoGrupo(String gradoGrupo) { this.gradoGrupo = gradoGrupo; }

    // 🔁 Sobrescritura del método saludar
    @Override
    public void saludar() {
        System.out.println("Hola, soy el alumno " + nombre + " " + apellidopaterno + " " + apellidomaterno +
                ", de la carrera " + carrera + ", grupo " + gradoGrupo + ".");
    }
}

