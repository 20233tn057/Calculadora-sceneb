class Produccion extends Empleado {
    private String turno;

    public Produccion(String nombre, int idEmpleado, double sueldo, String turno) {
        super(nombre, idEmpleado, sueldo);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" | Área: Producción | Turno: " + turno);
    }
}