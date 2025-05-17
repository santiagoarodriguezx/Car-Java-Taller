public class Transmision {
    // Attributes
    private String tipo;
    private int marchas;
    private String traccion;

    // Constructor
    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información de la Transmisión:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
    }
}
