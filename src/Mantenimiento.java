
public class Mantenimiento {
    // Attributes
    private String fechaMantenimiento;
    private String tipoMantenimiento;
    private String descripcion;
    private String estado;
     // Getters and Setters

    public String getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(String fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Mantenimiento() {}
    
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
