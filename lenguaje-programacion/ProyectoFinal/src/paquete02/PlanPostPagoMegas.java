package paquete02;

public class PlanPostPagoMegas extends PlanCelular {
    // Atributos específicos para este tipo de plan

    private Cliente cliente;
    private double megas; // expresado en gigas
    private double costoPorGiga;
    private double tarifaBase;
    // Constructor

    public PlanPostPagoMegas(Cliente c, double m,
            double cG, double tarifaB) {

        cliente = c;
        megas = m;
        costoPorGiga = cG;
        tarifaBase = tarifaB;
    }

    public void setCliente(Cliente c) {
        cliente = c;
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

    public Cliente getCliente() {
        return cliente;
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
    public void calcularPagoMensual() {
        pagoMensual = (megas * costoPorGiga) + tarifaBase;

    }

    @Override
    public String toString() {
        return "\n------Costo de Plan Post Pago Megas------"
                + "\nMegas: " + megas + "Mb a gigas ----> " + megas / 1000
                + "Gb\nCosto por Giga: " + costoPorGiga + "\nTarifa base: " + tarifaBase
                + "\nPrecio a pagar: " + pagoMensual;
    }
}
