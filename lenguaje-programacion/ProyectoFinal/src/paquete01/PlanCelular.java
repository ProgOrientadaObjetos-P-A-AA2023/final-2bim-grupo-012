package paquete01;

// Clase base PlanCelular
public class PlanCelular {

    private String nombreApellidoPropietario;
    private String pasaportePropietario;
    private String ciudadPropietario;
    private String barrioPropietario;
    private String marcaCelular;
    private String modeloCelular;
    private String numeroCelular;
    private double pagoMensual;

    // Constructor
    public PlanCelular(String nAP, String pP,
            String cP, String bP,
            String mC, String moC, String nC
           ) {
        nombreApellidoPropietario = nAP;
        pasaportePropietario = pP;
        ciudadPropietario = cP;
        barrioPropietario = bP;
        marcaCelular = mC;
        modeloCelular = moC;
        numeroCelular = nC;
        
    }
    public PlanCelular(){
    
    }

    public void setNombreApellidoPropietario(String nAP) {
        nombreApellidoPropietario = nAP;
    }

    public void setPasaportePropietario(String pP) {
        pasaportePropietario = pP;
    }

    public void setCiudadPropietario(String cP) {
        ciudadPropietario = cP;
    }

    public void setBarrioPropietario(String bP) {
        barrioPropietario = bP;
    }

    public void setMarcaCelular(String mC) {
        marcaCelular = mC;
    }

    public void setModeloCelular(String moC) {
        modeloCelular = moC;
    }

    public void setNumeroCelular(String nC) {
        numeroCelular = nC;
    }
    public void setPagoMensual(double pM) {
        pagoMensual = pM;
    }
    public String getNombreApellidoPropietario() {
        return nombreApellidoPropietario;
    }

    public String getPasaportePropietario() {
        return pasaportePropietario;
    }

    public String getCiudadPropietario() {
        return ciudadPropietario;
    }

    public String getBarrioPropietario() {
        return barrioPropietario;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public String getModeloCelular() {
        return modeloCelular;
    }

    public double pagoMensual() {
        return pagoMensual;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }
 public double getPagoMensual() {
        return pagoMensual;
    }
    // Método para calcular el valor mensual a pagar
   
public double calcularPagoMensual(){
        return pagoMensual;
}
    @Override
    public String toString() {

        return "Información del Plan: \n"
                + "Nombre:" + nombreApellidoPropietario + "\n "
                + "Pasaporte: " + pasaportePropietario + "\n "
                + "Barrio: " + barrioPropietario + "\n "
                + "Marca Celular: " + marcaCelular + "\n "
                + "Modelo Celular: " + modeloCelular + "\n "
                + "Numero Celular: " + numeroCelular + "\n "
                + "Pago Mensual: " + pagoMensual + ", ";
    }
}
