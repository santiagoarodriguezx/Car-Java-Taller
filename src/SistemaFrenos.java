public class SistemaFrenos {
    // Attributes
    private String tipo;
    private String tipoDiscos;
    private String tieneABS;
    private String estado;

    // Constructor
    public SistemaFrenos(String tipo, String tipoDiscos, String tieneABS, String estado) {
        this.tipo = tipo;
        this.tipoDiscos = tipoDiscos;
        this.tieneABS = tieneABS;
        this.estado = estado;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Sistema de Frenos:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Tipo de Discos: " + tipoDiscos);
        System.out.println("ABS: " + tieneABS);
        System.out.println("Estado: " + estado);
    }
}
