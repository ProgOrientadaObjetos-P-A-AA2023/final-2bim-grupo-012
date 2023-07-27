package paquete01;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int minutos;
    private double costoMinutos;
    private double megas;
    private double costoPorGigas;
    private double porcentajeDescuento;

    // Constructor
    public PlanPostPagoMinutosMegasEconomico(String nAp, String pP,
            String cP, String bP,
            String mC, String moC, String nC,
            int m, double cM,
            double me, double cG, double pD) {
        super(nAp, pP, cP, bP,
                mC, moC, nC);
        minutos = m;
        costoMinutos = cM;
        megas = me;
        costoPorGigas = cG;
        porcentajeDescuento = pD;
    }

    public void setMinutos(int m) {
        minutos = m;
    }

    public void setCostoMinutos(double cM) {
        costoMinutos = cM;
    }

    public void setMegas(double megas) {
        megas = megas;
    }

    public void setCostoPorGigas(double cG) {
        costoPorGigas = cG;
    }

    public void setPorcentajeDescuento(double pD) {
        porcentajeDescuento = pD;
    }

    public int getMinutos() {
        return minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public double getMegas() {
        return megas;
    }

    public double getCostoPorGigas() {
        return costoPorGigas;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    // Método para calcular el valor mensual a pagar, considerando el descuento
    @Override
    public double calcularPagoMensual() {
        double costoMinutosTotal = minutos * costoMinutos;
        double costoMegasTotal = megas * costoPorGigas;
        double costoTotal = costoMinutosTotal + costoMegasTotal;
        double descuento = costoTotal * (porcentajeDescuento / 100.0);
        return costoTotal - descuento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minutos: " + minutos + ", Megas: " + megas + " GB, Pago mensual: " + calcularPagoMensual();
    }
}
