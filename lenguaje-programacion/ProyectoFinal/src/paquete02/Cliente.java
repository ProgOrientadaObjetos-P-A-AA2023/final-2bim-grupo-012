package paquete02;


public class Cliente {
    
    private String nombreCliente;
    private String apellidoCliente;
    private String pasaporteCliente;
    private String ciudadCliente;
    private String barrioCliente;
    private String marcaCelular;
    private String modeloCelular;
    private String numeroCelular;
    
    public Cliente(String nombre, String apellido, 
            String pasaporte, String ciudad, 
            String barrio, String marcaC, 
            String modeloC, String numCelular) {
        nombreCliente = nombre;
        apellidoCliente = apellido;
        pasaporteCliente = pasaporte;
        ciudadCliente = ciudad;
        barrioCliente = barrio;
        marcaCelular = marcaC;
        modeloCelular = modeloC;
        numeroCelular = numCelular;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerApellidoCliente(String a) {
        apellidoCliente = a;
    }

    public void establecerPasaporteCliente(String c) {
        pasaporteCliente = c;
    }

    public void establecerCiudadCliente(String cd) {
        ciudadCliente = cd;
    }

    public void establecerBarrioCliente(String b) {
        barrioCliente = b;
    }

    public void establecerMarcaCelular(String m) {
        marcaCelular = m;
    }

    public void establecerModeloCelular(String mc) {
        modeloCelular = mc;
    }

    public void establecerNumeroCelular(String n) {
        numeroCelular = n;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerApellidoCliente() {
        return apellidoCliente;
    }

    public String obtenerPasaporteCliente() {
        return pasaporteCliente;
    }

    public String obtenerCiudadCliente() {
        return ciudadCliente;
    }

    public String obtenerBarrioCliente() {
        return barrioCliente;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }
    
    
    @Override
    public String toString() {
        String reporte = String.format("Nombre del Cliente: %s\n"
                + "Apellido del Cliente%s\n"
                + "Pasaporte del Cliente: %s\n"
                + "Ciudad del Cliente: %s\n"
                + "Barrio del Cliente: %s\n"
                + "Marca celular: %s\n"
                + "Modelo celular: %s\n"
                + "Número de celular: %s\n",
                nombreCliente,
                apellidoCliente,
                pasaporteCliente,
                ciudadCliente,
                barrioCliente,
                marcaCelular,
                modeloCelular,
                numeroCelular);

        return reporte;
    }
    
}