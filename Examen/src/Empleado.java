class Empleado {
    private String nombre;
    private int idEmpleado;
    private double sueldo;

    public Empleado(String nombre, int idEmpleado, double sueldo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarDatos() {
        System.out.print("Empleado: " + nombre + " | ID: " + idEmpleado + " | Sueldo: " + sueldo);
    }
}