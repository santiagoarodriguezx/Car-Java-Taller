public class SistemaElectrico {
    // Attributes
    private String tipoBateria;
    private String tipoLuces;
    private int numSensores;


    // Getters and Setters
    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getTipoLuces() {
        return tipoLuces;
    }

    public void setTipoLuces(String tipoLuces) {
        this.tipoLuces = tipoLuces;
    }

    public int getNumSensores() {
        return numSensores;
    }

    public void setNumSensores(int numSensores) {
        this.numSensores = numSensores;
    }
    public SistemaElectrico() {}
    
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
