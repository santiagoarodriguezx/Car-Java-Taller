

public class App {
    public static void main(String[] args) throws Exception {
        // Crear instancias de cada clase
        Vehiculo vehiculo = new Vehiculo("VH001", "Toyota", "Corolla", 2023);
        vehiculo.displayInfo();
        Motor motor = new Motor("Gasolina", 2.0, 170);
        motor.displayInfo();
        Transmision transmision = new Transmision("Automática", 6, "Delantera");
        transmision.displayInfo();
        Chasis chasis = new Chasis("Monocasco", 4.6, 1.8, 1200);
        chasis.displayInfo();
        Neumatico neumatico = new Neumatico("Michelin", "100", 32);
         neumatico.displayInfo();
        SistemaElectrico sistemaElectrico = new SistemaElectrico("Litio", "LED", 12);
        sistemaElectrico.displayInfo();
        SistemaFrenos sistemaFrenos = new SistemaFrenos("Disco", "Ventilados", "Si", "Óptimo");
        sistemaFrenos.displayInfo();
        RegistroVehicular registro = new RegistroVehicular("ABC123", "Juan Pérez", "01/01/2023");
        registro.displayInfo();
        Mantenimiento mantenimiento = new Mantenimiento ("01/01/2024", "Preventivo", "Cambio de aceite", "Completado");
        mantenimiento.displayInfo();
        Sensor sensor = new Sensor("Temperatura", "°C", 90.5, "Activo");
        sensor.displayInfo();
    }
}
