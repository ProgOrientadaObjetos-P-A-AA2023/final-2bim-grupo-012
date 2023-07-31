package paquete02;

public class PlanPostPagoMinutos extends PlanCelular {

    private Cliente cliente;
    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    // Constructor
    public PlanPostPagoMinutos(Cliente c,
            double minNacionales, double costoMinNacional,
            double minInternacional, double costoMinInternacional) {

        cliente = c;
        minutosNacionales = minNacionales;
        costoMinutoNacional = costoMinNacional;
        minutosInternacionales = minInternacional;
        costoMinutoInternacional = costoMinInternacional;

    }

    public void setCliente(Cliente c) {
        cliente = c;
    }

    public void setMinutosNacionales(double mN) {
        minutosNacionales = mN;
    }

    public void setCostoMinutoNacional(double cMN) {
        costoMinutoNacional = cMN;
    }

    public void setMinutosInternacionales(double mI) {
        minutosInternacionales = mI;
    }

    public void setCostoMinutoInternacional(double cMI) {
        costoMinutoInternacional = cMI;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getMinutosNacionales() {
        return minutosNacionales;
    }

    public double getCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public double getMinutosInternacionales() {
        return minutosInternacionales;
    }

    // Atributos específicos para este tipo de plan
    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    // Método para calcular el valor mensual a pagar
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacional);

    }

    @Override
    public String toString() {
        return "\n------Costo de Plan Post Pago Mimutos------"
                + "\nMinutos nacionales consumidos: " + minutosNacionales
                + "\nCosto por minuto nacional: " + costoMinutoNacional
                + "\nMinutos internacionales consumidos: " + minutosInternacionales
                + "\nCosto por minuto internacional: " + costoMinutoInternacional
                + "\nPrecio a pagar: " + pagoMensual;
    }
}
