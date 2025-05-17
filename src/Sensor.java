public class Sensor {    // Attributes
    private String tipo;
    private String unidadMedida;
    private double valorActual;
    private String estado;

    // Constructor
    public Sensor(String tipo, String unidadMedida, double valorActual, String estado) {
        this.tipo = tipo;
        this.unidadMedida = unidadMedida;
        this.valorActual = valorActual;
        this.estado = estado;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Sensor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Unidad de Medida: " + unidadMedida);
        System.out.println("Valor Actual: " + valorActual + " " + unidadMedida);
        System.out.println("Estado: " + estado);
    }
}
