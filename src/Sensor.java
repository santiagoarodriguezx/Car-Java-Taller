public class Sensor {    // Attributes
    private String tipo;
    private String unidadMedida;
    private double valorActual;
    private String estado;


    // Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Sensor() {} 

    
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
