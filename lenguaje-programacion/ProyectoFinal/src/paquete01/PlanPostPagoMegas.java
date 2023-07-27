package paquete01;

public class PlanPostPagoMegas extends PlanCelular {
    // Atributos específicos para este tipo de plan

    private double megas; // expresado en gigas
    private double costoPorGiga;
    private double tarifaBase;
        // Constructor
    public PlanPostPagoMegas(String nAp, String pP,
            String cP, String bP,
            String mC, String moC, String nC,
             double me, double cG, double tB) {
        super(nAp, pP, cP, bP,
                mC, moC, nC);
        megas = me;
        costoPorGiga = cG;
        tarifaBase = tB;
    }

    public void setMegas(double me) {
        megas = me;
    }

    public void setCostoPorGiga(double cG) {
        costoPorGiga = cG;
    }

    public void setTarifaBase(double tB) {
        tarifaBase = tB;
    }

    public double getMegas() {
        return megas;
    }

    public double getCostoPorGiga() {
        return costoPorGiga;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }



    // Método para calcular el valor mensual a pagar
    @Override
    public double calcularPagoMensual() {
        double costoMegasTotal = megas * costoPorGiga;
        return tarifaBase + costoMegasTotal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Megas: " + megas + " GB, Pago mensual: " + calcularPagoMensual();
    }
}
