package paquete02;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private Cliente cliente;
    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoGiga;
    private double porcentDesc;

    public PlanPostPagoMinutosMegasEconomico(Cliente c,
            double minutosS, double costoMin,
            double gigasInternet, double costG,
            double porcent) {

        cliente = c;
        minutos = minutosS;
        costoMinutos = costoMin;
        megasGigas = gigasInternet;
        costoGiga = costG;
        porcentDesc = porcent;
    }

    public void setCliente(Cliente c) {
        cliente = c;
    }

    public void setMinutos(double m) {
        minutos = m;
    }

    public void setCostoMinutos(double cM) {
        costoMinutos = cM;
    }

    public void setMegasGigas(double mG) {
        megasGigas = mG;
    }

    public void setCostoGiga(double cG) {
        costoGiga = cG;
    }

    public void setPorcentDesc(double pD) {
        porcentDesc = pD;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMinutos() {
        return minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public double getMegasGigas() {
        return megasGigas;
    }

    public double getCostoGiga() {
        return costoGiga;
    }

    public double getPorcentDesc() {
        return porcentDesc;
    }

    // Método para calcular el valor mensual a pagar, considerando el descuento
    
   

    @Override
    
     public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (megasGigas * costoGiga)
                - ((minutos * costoMinutos) + (megasGigas * costoGiga) * (porcentDesc / 100.0));
    }
@Override
    public String toString() {
        return "\n------Costo de Plan Post Pago Minutos Megas Economico------"
                + "\nMinutos consumidos: " + minutos
                + "\nCosto por minuto consumido: " + costoMinutos
                + "\nMegas: " + megasGigas
                + "Gb\nCosto por Giga: " + costoGiga
                + "\nDescuento aplicado " + porcentDesc + "%"
                + "\nPrecio a pagar: " + pagoMensual;
    }
}
