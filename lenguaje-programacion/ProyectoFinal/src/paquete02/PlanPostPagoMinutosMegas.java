package paquete02;

public class PlanPostPagoMinutosMegas extends PlanCelular {

    private Cliente cliente;
    private double minutos;
    private double costoMinuto;
    private double megas; // expresado en gigas
    private double costoPorGiga;

    public PlanPostPagoMinutosMegas(Cliente c, double min, double costoMin,
            double m, double costoGiga) {

        cliente = c;
        minutos = min;
        costoMinuto = costoMin;
        megas = m;
        costoPorGiga = costoGiga;
    }

    public void setCliente(Cliente c) {
        cliente = c;
    }

    public void setMinutos(double m) {
        minutos = m;
    }

    public void setCostoMinuto(double cM) {
        costoMinuto = cM;
    }

    public void setMegas(double me) {
        megas = me;
    }

    public void setCostoPorGiga(double cG) {
        costoPorGiga = cG;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMinutos() {
        return minutos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public double getMegas() {
        return megas;
    }

    public double getCostoPorGiga() {
        return costoPorGiga;
    }

    // Método para calcular el valor mensual a pagar
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMinuto) + (megas * costoPorGiga);

    }

    @Override
    public String toString() {
        return "\n------Costo de Plan Post Pago Minutos Megas------"
                + "\nMinutos consumidos: " + minutos
                + "\nCosto por minuto consumido: " + costoMinuto
                + "\nMegas: " + megas + "Mb a gigas ----> " + megas / 1000
                + "Gb\nCosto por Giga: " + costoPorGiga
                + "\nPrecio a pagar: " + pagoMensual;
    }
}
