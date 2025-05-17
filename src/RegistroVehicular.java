
public class RegistroVehicular {
    // Attributes
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Method
    public void displayInfo() {
        System.out.println("Información del Registro Vehicular:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de Registro: " + fechaRegistro);
    }
}
