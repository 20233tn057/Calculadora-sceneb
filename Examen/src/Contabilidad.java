public class Contabilidad extends Empleado {
    private String tipoContrato;

    public Contabilidad(String nombre, int idEmpleado, double sueldo, String tipoContrato) {
        super(nombre, idEmpleado, sueldo);
        this.tipoContrato = tipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" | Área: Contabilidad | Contrato: " + tipoContrato);
    }
}