public class Vehiculo {
    // Attributes
    private String identificacion;
    private String marca;
    private String modelo;
    private int año;
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Vehiculo() {} // Default constructor

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
