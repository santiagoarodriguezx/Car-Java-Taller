public class App {
    public static void main(String[] args) throws Exception {
        // Crear instancias
        SistemaElectrico sistemaElectrico1 = new SistemaElectrico();
        Chasis chasis1 = new Chasis();
        Mantenimiento mantenimiento1 = new Mantenimiento();
        RegistroVehicular registroVehicular1 = new RegistroVehicular();
        Neumatico neumatico1 = new Neumatico();
        SistemaFrenos sistemaFrenos1 = new SistemaFrenos();
        Transmision transmision1 = new Transmision();
        Motor motor1 = new Motor();
        Sensor sensor1 = new Sensor();
        Vehiculo vehiculo1 = new Vehiculo();

        // Configurar vehículo 1
        vehiculo1.setIdentificacion("VH001");
        vehiculo1.setMarca("Toyota");
        vehiculo1.setModelo("Corolla");
        vehiculo1.setAño(2023);
        sistemaElectrico1.setTipoBateria("Litio");
        sistemaElectrico1.setTipoLuces("LED");
        sistemaElectrico1.setNumSensores(6);
        chasis1.setTipo("Monocasco");
        chasis1.setLargo(4.63);
        chasis1.setAncho(1.78);
        chasis1.setPeso(1200);
        mantenimiento1.setFechaMantenimiento("15/03/2025");
        mantenimiento1.setTipoMantenimiento("Preventivo");
        mantenimiento1.setDescripcion("Cambio de aceite y filtros");
        mantenimiento1.setEstado("Programado");
        registroVehicular1.setMatricula("ABC-123");
        registroVehicular1.setPropietario("Juan Pérez");
        registroVehicular1.setFechaRegistro("10/01/2023");
        neumatico1.setMarca("Michelin");
        neumatico1.setTamaño("205/55R16");
        neumatico1.setPresion(32.5);
        sistemaFrenos1.setTipo("Disco/Tambor");
        sistemaFrenos1.setTipoDiscos("Ventilados delanteros");
        sistemaFrenos1.setTieneABS("Sí");
        sistemaFrenos1.setEstado("Óptimo");
        transmision1.setTipo("CVT");
        transmision1.setMarchas(7);
        transmision1.setTraccion("Delantera");
        motor1.setTipo("Gasolina");
        motor1.setCilindrada(1.8);
        motor1.setPotencia(140);
        sensor1.setTipo("Temperatura");
        sensor1.setUnidadMedida("°C");
        sensor1.setValorActual(90.0);
        sensor1.setEstado("Activo");

        // Mostrar información vehículo 1
        System.out.println("\n=== VEHÍCULO 1 TOYOTA COROLLA ===");
        System.out.println("Identificación: " + vehiculo1.getIdentificacion());
        System.out.println("Marca: " + vehiculo1.getMarca());
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Año: " + vehiculo1.getAño());
        
        System.out.println("\nSistema Eléctrico:");
        System.out.println("Tipo de Batería: " + sistemaElectrico1.getTipoBateria());
        System.out.println("Tipo de Luces: " + sistemaElectrico1.getTipoLuces());
        System.out.println("Número de Sensores: " + sistemaElectrico1.getNumSensores());
        
        System.out.println("\nChasis:");
        System.out.println("Tipo: " + chasis1.getTipo());
        System.out.println("Largo: " + chasis1.getLargo() + " m");
        System.out.println("Ancho: " + chasis1.getAncho() + " m");
        System.out.println("Peso: " + chasis1.getPeso() + " kg");
        
        System.out.println("\nMantenimiento:");
        System.out.println("Fecha: " + mantenimiento1.getFechaMantenimiento());
        System.out.println("Tipo: " + mantenimiento1.getTipoMantenimiento());
        System.out.println("Descripción: " + mantenimiento1.getDescripcion());
        System.out.println("Estado: " + mantenimiento1.getEstado());
        
        System.out.println("\nRegistro Vehicular:");
        System.out.println("Matrícula: " + registroVehicular1.getMatricula());
        System.out.println("Propietario: " + registroVehicular1.getPropietario());
        System.out.println("Fecha de Registro: " + registroVehicular1.getFechaRegistro());
        
        System.out.println("\nNeumático:");
        System.out.println("Marca: " + neumatico1.getMarca());
        System.out.println("Tamaño: " + neumatico1.getTamaño());
        System.out.println("Presión: " + neumatico1.getPresion() + " PSI");
        
        System.out.println("\nSistema de Frenos:");
        System.out.println("Tipo: " + sistemaFrenos1.getTipo());
        System.out.println("Tipo de Discos: " + sistemaFrenos1.getTipoDiscos());
        System.out.println("ABS: " + sistemaFrenos1.getTieneABS());
        System.out.println("Estado: " + sistemaFrenos1.getEstado());
        
        System.out.println("\nTransmisión:");
        System.out.println("Tipo: " + transmision1.getTipo());
        System.out.println("Marchas: " + transmision1.getMarchas());
        System.out.println("Tracción: " + transmision1.getTraccion());
        
        System.out.println("\nMotor:");
        System.out.println("Tipo: " + motor1.getTipo());
        System.out.println("Cilindrada: " + motor1.getCilindrada() + " L");
        System.out.println("Potencia: " + motor1.getPotencia() + " HP");
        
        System.out.println("\nSensor:");
        System.out.println("Tipo: " + sensor1.getTipo());
        System.out.println("Unidad de Medida: " + sensor1.getUnidadMedida());
        System.out.println("Valor Actual: " + sensor1.getValorActual());
        System.out.println("Estado: " + sensor1.getEstado());

        // VEHÍCULO 2 - Ford Mustang (Deportivo)
        SistemaElectrico sistemaElectrico2 = new SistemaElectrico();
        Chasis chasis2 = new Chasis();
        Mantenimiento mantenimiento2 = new Mantenimiento();
        RegistroVehicular registroVehicular2 = new RegistroVehicular();
        Neumatico neumatico2 = new Neumatico();
        SistemaFrenos sistemaFrenos2 = new SistemaFrenos();
        Transmision transmision2 = new Transmision();
        Motor motor2 = new Motor();
        Sensor sensor2 = new Sensor();
        Vehiculo vehiculo2 = new Vehiculo();

        // Configurar vehículo 2
        vehiculo2.setIdentificacion("VH002");
        vehiculo2.setMarca("Ford");
        vehiculo2.setModelo("Mustang");
        vehiculo2.setAño(2023);

        sistemaElectrico2.setTipoBateria("AGM");
        sistemaElectrico2.setTipoLuces("Xenón");
        sistemaElectrico2.setNumSensores(10);

        chasis2.setTipo("Plataforma S550");
        chasis2.setLargo(4.78);
        chasis2.setAncho(1.92);
        chasis2.setPeso(1700);

        mantenimiento2.setFechaMantenimiento("05/05/2025");
        mantenimiento2.setTipoMantenimiento("Performance");
        mantenimiento2.setDescripcion("Afinación de motor y suspensión");
        mantenimiento2.setEstado("Programado");

        registroVehicular2.setMatricula("XYZ-789");
        registroVehicular2.setPropietario("Ana Gómez");
        registroVehicular2.setFechaRegistro("15/02/2023");

        neumatico2.setMarca("Pirelli");
        neumatico2.setTamaño("255/40R19");
        neumatico2.setPresion(36.0);

        sistemaFrenos2.setTipo("Disco en las 4 ruedas");
        sistemaFrenos2.setTipoDiscos("Performance Brembo");
        sistemaFrenos2.setTieneABS("Sí");
        sistemaFrenos2.setEstado("Nuevo");

        transmision2.setTipo("Automática deportiva");
        transmision2.setMarchas(10);
        transmision2.setTraccion("Trasera");

        motor2.setTipo("V8");
        motor2.setCilindrada(5.0);
        motor2.setPotencia(450);

        sensor2.setTipo("Presión de aceite");
        sensor2.setUnidadMedida("PSI");
        sensor2.setValorActual(65.0);
        sensor2.setEstado("Activo");

        // Mostrar información vehículo 2
        System.out.println("\n=== VEHÍCULO 2 FORD MUSTANG===");
        System.out.println("Identificación: " + vehiculo2.getIdentificacion());
        System.out.println("Marca: " + vehiculo2.getMarca());
        System.out.println("Modelo: " + vehiculo2.getModelo());
        System.out.println("Año: " + vehiculo2.getAño());
        
        System.out.println("\nSistema Eléctrico:");
        System.out.println("Tipo de Batería: " + sistemaElectrico2.getTipoBateria());
        System.out.println("Tipo de Luces: " + sistemaElectrico2.getTipoLuces());
        System.out.println("Número de Sensores: " + sistemaElectrico2.getNumSensores());
        
        System.out.println("\nChasis:");
        System.out.println("Tipo: " + chasis2.getTipo());
        System.out.println("Largo: " + chasis2.getLargo() + " m");
        System.out.println("Ancho: " + chasis2.getAncho() + " m");
        System.out.println("Peso: " + chasis2.getPeso() + " kg");
        
        System.out.println("\nMantenimiento:");
        System.out.println("Fecha: " + mantenimiento2.getFechaMantenimiento());
        System.out.println("Tipo: " + mantenimiento2.getTipoMantenimiento());
        System.out.println("Descripción: " + mantenimiento2.getDescripcion());
        System.out.println("Estado: " + mantenimiento2.getEstado());
        
        System.out.println("\nRegistro Vehicular:");
        System.out.println("Matrícula: " + registroVehicular2.getMatricula());
        System.out.println("Propietario: " + registroVehicular2.getPropietario());
        System.out.println("Fecha de Registro: " + registroVehicular2.getFechaRegistro());
        
        System.out.println("\nNeumático:");
        System.out.println("Marca: " + neumatico2.getMarca());
        System.out.println("Tamaño: " + neumatico2.getTamaño());
        System.out.println("Presión: " + neumatico2.getPresion() + " PSI");
        
        System.out.println("\nSistema de Frenos:");
        System.out.println("Tipo: " + sistemaFrenos2.getTipo());
        System.out.println("Tipo de Discos: " + sistemaFrenos2.getTipoDiscos());
        System.out.println("ABS: " + sistemaFrenos2.getTieneABS());
        System.out.println("Estado: " + sistemaFrenos2.getEstado());
        
        System.out.println("\nTransmisión:");
        System.out.println("Tipo: " + transmision2.getTipo());
        System.out.println("Marchas: " + transmision2.getMarchas());
        System.out.println("Tracción: " + transmision2.getTraccion());
        
        System.out.println("\nMotor:");
        System.out.println("Tipo: " + motor2.getTipo());
        System.out.println("Cilindrada: " + motor2.getCilindrada() + " L");
        System.out.println("Potencia: " + motor2.getPotencia() + " HP");
        
        System.out.println("\nSensor:");
        System.out.println("Tipo: " + sensor2.getTipo());
        System.out.println("Unidad de Medida: " + sensor2.getUnidadMedida());
        System.out.println("Valor Actual: " + sensor2.getValorActual());
        System.out.println("Estado: " + sensor2.getEstado());

        // VEHÍCULO 3 - BMW M3 (Sedan deportivo de lujo)
        SistemaElectrico sistemaElectrico3 = new SistemaElectrico();
        Chasis chasis3 = new Chasis();
        Mantenimiento mantenimiento3 = new Mantenimiento();
        RegistroVehicular registroVehicular3 = new RegistroVehicular();
        Neumatico neumatico3 = new Neumatico();
        SistemaFrenos sistemaFrenos3 = new SistemaFrenos();
        Transmision transmision3 = new Transmision();
        Motor motor3 = new Motor();
        Sensor sensor3 = new Sensor();
        Vehiculo vehiculo3 = new Vehiculo();

        // Configurar vehículo 3
        vehiculo3.setIdentificacion("VH003");
        vehiculo3.setMarca("BMW");
        vehiculo3.setModelo("M3");
        vehiculo3.setAño(2023);

        sistemaElectrico3.setTipoBateria("Litio de alta capacidad");
        sistemaElectrico3.setTipoLuces("Láser");
        sistemaElectrico3.setNumSensores(15);

        chasis3.setTipo("CLAR");
        chasis3.setLargo(4.79);
        chasis3.setAncho(1.90);
        chasis3.setPeso(1730);

        mantenimiento3.setFechaMantenimiento("20/06/2025");
        mantenimiento3.setTipoMantenimiento("Premium");
        mantenimiento3.setDescripcion("Revisión completa y actualización de software");
        mantenimiento3.setEstado("No iniciado");

        registroVehicular3.setMatricula("BMW-003");
        registroVehicular3.setPropietario("Carlos Ruiz");
        registroVehicular3.setFechaRegistro("28/02/2023");

        neumatico3.setMarca("Continental");
        neumatico3.setTamaño("275/35R20");
        neumatico3.setPresion(38.0);

        sistemaFrenos3.setTipo("Disco carbono-cerámica");
        sistemaFrenos3.setTipoDiscos("Performance");
        sistemaFrenos3.setTieneABS("Sí + Control dinámico");
        sistemaFrenos3.setEstado("Excelente");

        transmision3.setTipo("M DCT");
        transmision3.setMarchas(8);
        transmision3.setTraccion("Trasera");

        motor3.setTipo("S58 Twin-Turbo");
        motor3.setCilindrada(3.0);
        motor3.setPotencia(503);

        sensor3.setTipo("Oxígeno");
        sensor3.setUnidadMedida("V");
        sensor3.setValorActual(0.85);
        sensor3.setEstado("Óptimo");

        // Mostrar información vehículo 3
        System.out.println("\n=== VEHÍCULO 3 BMW ===");
        System.out.println("Identificación: " + vehiculo3.getIdentificacion());
        System.out.println("Marca: " + vehiculo3.getMarca());
        System.out.println("Modelo: " + vehiculo3.getModelo());
        System.out.println("Año: " + vehiculo3.getAño());
        
        System.out.println("\nSistema Eléctrico:");
        System.out.println("Tipo de Batería: " + sistemaElectrico3.getTipoBateria());
        System.out.println("Tipo de Luces: " + sistemaElectrico3.getTipoLuces());
        System.out.println("Número de Sensores: " + sistemaElectrico3.getNumSensores());
        
        System.out.println("\nChasis:");
        System.out.println("Tipo: " + chasis3.getTipo());
        System.out.println("Largo: " + chasis3.getLargo() + " m");
        System.out.println("Ancho: " + chasis3.getAncho() + " m");
        System.out.println("Peso: " + chasis3.getPeso() + " kg");
        
        System.out.println("\nMantenimiento:");
        System.out.println("Fecha: " + mantenimiento3.getFechaMantenimiento());
        System.out.println("Tipo: " + mantenimiento3.getTipoMantenimiento());
        System.out.println("Descripción: " + mantenimiento3.getDescripcion());
        System.out.println("Estado: " + mantenimiento3.getEstado());
        
        System.out.println("\nRegistro Vehicular:");
        System.out.println("Matrícula: " + registroVehicular3.getMatricula());
        System.out.println("Propietario: " + registroVehicular3.getPropietario());
        System.out.println("Fecha de Registro: " + registroVehicular3.getFechaRegistro());
        
        System.out.println("\nNeumático:");
        System.out.println("Marca: " + neumatico3.getMarca());
        System.out.println("Tamaño: " + neumatico3.getTamaño());
        System.out.println("Presión: " + neumatico3.getPresion() + " PSI");
        
        System.out.println("\nSistema de Frenos:");
        System.out.println("Tipo: " + sistemaFrenos3.getTipo());
        System.out.println("Tipo de Discos: " + sistemaFrenos3.getTipoDiscos());
        System.out.println("ABS: " + sistemaFrenos3.getTieneABS());
        System.out.println("Estado: " + sistemaFrenos3.getEstado());
        
        System.out.println("\nTransmisión:");
        System.out.println("Tipo: " + transmision3.getTipo());
        System.out.println("Marchas: " + transmision3.getMarchas());
        System.out.println("Tracción: " + transmision3.getTraccion());
        
        System.out.println("\nMotor:");
        System.out.println("Tipo: " + motor3.getTipo());
        System.out.println("Cilindrada: " + motor3.getCilindrada() + " L");
        System.out.println("Potencia: " + motor3.getPotencia() + " HP");
        
        System.out.println("\nSensor:");
        System.out.println("Tipo: " + sensor3.getTipo());
        System.out.println("Unidad de Medida: " + sensor3.getUnidadMedida());
        System.out.println("Valor Actual: " + sensor3.getValorActual());
        System.out.println("Estado: " + sensor3.getEstado());

        // VEHÍCULO 4 - Tesla Model 3 (Eléctrico)
        SistemaElectrico sistemaElectrico4 = new SistemaElectrico();
        Chasis chasis4 = new Chasis();
        Mantenimiento mantenimiento4 = new Mantenimiento();
        RegistroVehicular registroVehicular4 = new RegistroVehicular();
        Neumatico neumatico4 = new Neumatico();
        SistemaFrenos sistemaFrenos4 = new SistemaFrenos();
        Transmision transmision4 = new Transmision();
        Motor motor4 = new Motor();
        Sensor sensor4 = new Sensor();
        Vehiculo vehiculo4 = new Vehiculo();

        // Configurar vehículo 4
        vehiculo4.setIdentificacion("VH004");
        vehiculo4.setMarca("Tesla");
        vehiculo4.setModelo("Model 3");
        vehiculo4.setAño(2023);

        sistemaElectrico4.setTipoBateria("Ion-Litio de alta densidad");
        sistemaElectrico4.setTipoLuces("LED adaptativas");
        sistemaElectrico4.setNumSensores(24);

        chasis4.setTipo("Aluminio/Acero reforzado");
        chasis4.setLargo(4.69);
        chasis4.setAncho(1.85);
        chasis4.setPeso(1850);

        mantenimiento4.setFechaMantenimiento("10/04/2025");
        mantenimiento4.setTipoMantenimiento("Eléctrico");
        mantenimiento4.setDescripcion("Diagnóstico de batería y actualización OTA");
        mantenimiento4.setEstado("Pendiente");

        registroVehicular4.setMatricula("ELE-123");
        registroVehicular4.setPropietario("María Sánchez");
        registroVehicular4.setFechaRegistro("05/03/2023");

        neumatico4.setMarca("Michelin Energy");
        neumatico4.setTamaño("235/45R18");
        neumatico4.setPresion(42.0);

        sistemaFrenos4.setTipo("Disco + Regenerativos");
        sistemaFrenos4.setTipoDiscos("Ventilados");
        sistemaFrenos4.setTieneABS("Sí + Control electrónico");
        sistemaFrenos4.setEstado("Óptimo");

        transmision4.setTipo("Eléctrica directa");
        transmision4.setMarchas(1);
        transmision4.setTraccion("Trasera");

        motor4.setTipo("Eléctrico");
        motor4.setCilindrada(0.0);
        motor4.setPotencia(350);

        sensor4.setTipo("Temperatura de batería");
        sensor4.setUnidadMedida("°C");
        sensor4.setValorActual(30.5);
        sensor4.setEstado("Funcionando");

        // Mostrar información vehículo 4
        System.out.println("\n=== VEHÍCULO 4  TESLA MODEL 3 ===");
        System.out.println("Identificación: " + vehiculo4.getIdentificacion());
        System.out.println("Marca: " + vehiculo4.getMarca());
        System.out.println("Modelo: " + vehiculo4.getModelo());
        System.out.println("Año: " + vehiculo4.getAño());
        
        System.out.println("\nSistema Eléctrico:");
        System.out.println("Tipo de Batería: " + sistemaElectrico4.getTipoBateria());
        System.out.println("Tipo de Luces: " + sistemaElectrico4.getTipoLuces());
        System.out.println("Número de Sensores: " + sistemaElectrico4.getNumSensores());
        
        System.out.println("\nChasis:");
        System.out.println("Tipo: " + chasis4.getTipo());
        System.out.println("Largo: " + chasis4.getLargo() + " m");
        System.out.println("Ancho: " + chasis4.getAncho() + " m");
        System.out.println("Peso: " + chasis4.getPeso() + " kg");
        
        System.out.println("\nMantenimiento:");
        System.out.println("Fecha: " + mantenimiento4.getFechaMantenimiento());
        System.out.println("Tipo: " + mantenimiento4.getTipoMantenimiento());
        System.out.println("Descripción: " + mantenimiento4.getDescripcion());
        System.out.println("Estado: " + mantenimiento4.getEstado());
        
        System.out.println("\nRegistro Vehicular:");
        System.out.println("Matrícula: " + registroVehicular4.getMatricula());
        System.out.println("Propietario: " + registroVehicular4.getPropietario());
        System.out.println("Fecha de Registro: " + registroVehicular4.getFechaRegistro());
        
        System.out.println("\nNeumático:");
        System.out.println("Marca: " + neumatico4.getMarca());
        System.out.println("Tamaño: " + neumatico4.getTamaño());
        System.out.println("Presión: " + neumatico4.getPresion() + " PSI");
        
        System.out.println("\nSistema de Frenos:");
        System.out.println("Tipo: " + sistemaFrenos4.getTipo());
        System.out.println("Tipo de Discos: " + sistemaFrenos4.getTipoDiscos());
        System.out.println("ABS: " + sistemaFrenos4.getTieneABS());
        System.out.println("Estado: " + sistemaFrenos4.getEstado());
        
        System.out.println("\nTransmisión:");
        System.out.println("Tipo: " + transmision4.getTipo());
        System.out.println("Marchas: " + transmision4.getMarchas());
        System.out.println("Tracción: " + transmision4.getTraccion());
        
        System.out.println("\nMotor:");
        System.out.println("Tipo: " + motor4.getTipo());
        System.out.println("Cilindrada: " + motor4.getCilindrada() + " L");
        System.out.println("Potencia: " + motor4.getPotencia() + " HP");
        
        System.out.println("\nSensor:");
        System.out.println("Tipo: " + sensor4.getTipo());
        System.out.println("Unidad de Medida: " + sensor4.getUnidadMedida());
        System.out.println("Valor Actual: " + sensor4.getValorActual());
        System.out.println("Estado: " + sensor4.getEstado());
    }
}