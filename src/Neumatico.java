public class Neumatico {
    // Attributes
    private String marca;
    private String tamaño;
    private double presion;

    // Constructor
    public Neumatico(String marca, String tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presión: " + presion + " PSI");
    }
}
