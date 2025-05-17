public class SistemaElectrico {
    // Attributes
    private String tipoBateria;
    private String tipoLuces;
    private int numSensores;

    // Constructor
    public SistemaElectrico(String tipoBateria, String tipoLuces, int numSensores) {
        this.tipoBateria = tipoBateria;
        this.tipoLuces = tipoLuces;
        this.numSensores = numSensores;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Sistema Eléctrico:");
        System.out.println("Tipo de Batería: " + tipoBateria);
        System.out.println("Tipo de Luces: " + tipoLuces);
        System.out.println("Número de Sensores: " + numSensores);
    }
}
