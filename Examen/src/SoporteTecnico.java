class SoporteTecnico extends Empleado {
    private String nivelSoporte;

    public SoporteTecnico(String nombre, int idEmpleado, double sueldo, String nivelSoporte) {
        super(nombre, idEmpleado, sueldo);
        this.nivelSoporte = nivelSoporte;
    }

    public String getNivelSoporte() {
        return nivelSoporte;
    }

    public void setNivelSoporte(String nivelSoporte) {
        this.nivelSoporte = nivelSoporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" | Área: Soporte Técnico | Nivel: " + nivelSoporte);
    }
}
