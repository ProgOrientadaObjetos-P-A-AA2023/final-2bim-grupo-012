package paquete01;

import java.util.Scanner;

public class PlanPostPagoMinutos extends PlanCelular {

    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;

 // Constructor
    public PlanPostPagoMinutos(String nAP, String pP,
            String cP, String bP,
            String mC, String moC, String nC,
             int mN, double cMN,
            int mI, double cMI) {
        super(nAP, pP, cP, bP,
                mC, moC, nC);
        minutosNacionales = mN;
        costoMinutoNacional = cMN;
        minutosInternacionales = mI;
        costoMinutoInternacional = cMI;
    }

    public void setMinutosNacionales(int mN) {
        minutosNacionales = mN;
    }

    public void setCostoMinutoNacional(double cMN) {
        costoMinutoNacional = cMN;
    }

    public void setMinutosInternacionales(int mI) {
        minutosInternacionales = mI;
    }

    public void setCostoMinutoInternacional(double cMI) {
        costoMinutoInternacional = cMI;
    }

    public int getMinutosNacionales() {
        return minutosNacionales;
    }

    public double getCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public int getMinutosInternacionales() {
        return minutosInternacionales;
    }

    // Atributos específicos para este tipo de plan
    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

   

    
    // Método para calcular el valor mensual a pagar
    @Override
    public double calcularPagoMensual() {
        double costoMinutosNacionalesTotal = minutosNacionales * costoMinutoNacional;
        double costoMinutosInternacionalesTotal = minutosInternacionales * costoMinutoInternacional;
        return costoMinutosNacionalesTotal + costoMinutosInternacionalesTotal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minutos Nacionales: " + minutosNacionales
                + ", Minutos Internacionales: " + minutosInternacionales
                + ", Pago mensual: " + calcularPagoMensual();
    }
}
