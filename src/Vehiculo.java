public class Vehiculo {
    // Attributes
    private String identificacion;
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Vehiculo(String identificacion, String marca, String modelo, int año) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Vehículo:");
        System.out.println("Identificación: " + identificacion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
