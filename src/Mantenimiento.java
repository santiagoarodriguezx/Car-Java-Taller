
public class Mantenimiento {
    // Attributes
    private String fechaMantenimiento;
    private String tipoMantenimiento;
    private String descripcion;
    private String estado;

    // Constructor
    public Mantenimiento(String fechaMantenimiento, String tipoMantenimiento, String descripcion, String estado) {
        this.fechaMantenimiento = fechaMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Mantenimiento:");
        System.out.println("Fecha: " + fechaMantenimiento);
        System.out.println("Tipo: " + tipoMantenimiento);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + estado);
    }
}
