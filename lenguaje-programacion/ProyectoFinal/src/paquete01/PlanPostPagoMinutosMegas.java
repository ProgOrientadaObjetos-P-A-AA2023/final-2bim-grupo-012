package paquete01;

public class PlanPostPagoMinutosMegas extends PlanCelular {

    // Atributos específicos para este tipo de plan
    private int minutos;
    private double costoMinuto;
    private double megas; // expresado en gigas
    private double costoPorGiga;

    // Constructor
    public PlanPostPagoMinutosMegas(String nAP, String pP,
            String cP, String bP,
            String mC, String moC, String nC,
            int m, double cM,
            double me, double cG) {
        super(nAP, pP, cP, bP,
                mC, moC, nC);
        minutos = m;
        costoMinuto = cM;
        megas = me;
        costoPorGiga = cG;
    }

    public void setMinutos(int m) {
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

    public int getMinutos() {
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
    public double calcularPagoMensual() {
        double costoMinutosTotal = minutos * costoMinuto;
        double costoMegasTotal = megas * costoPorGiga;
        return costoMinutosTotal + costoMegasTotal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minutos: " + minutos + ", Megas: " + megas + " GB, Pago mensual: " + calcularPagoMensual();
    }
}
