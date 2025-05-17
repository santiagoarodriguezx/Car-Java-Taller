public class Motor {
    // Attributes
    private String tipo;
    private double cilindrada;
    private int potencia;

    // Constructor
    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Motor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia + " HP");
    }
}
