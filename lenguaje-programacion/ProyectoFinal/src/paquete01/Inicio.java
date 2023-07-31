package paquete01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import paquete02.PlanCelular;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;
import paquete02.Cliente;

import paquete03.Enlace;

public class Inicio {

    public static void main(String[] args) {
        Enlace c = new Enlace();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion = 1, opcion2;
        String nombre, apellido, pasaporte, barrio, ciudad, marca, modelo, numeroCelular;
        do {
            System.out.printf("----------------Menú----------------------+\n"
                    + "1---------- Ingresar un Plan Celular                         \n"
                    + "2---------- Presentar los Planes Registrados                       \n"
                    + "0----------  Salir                                         \n"
                    + "Seleccione Una Opción+\n");
            opcion = sc.nextInt();

            System.out.println("--------------------------------------------------");

            if (opcion == 1) {
                do {

                    opcion2 = interfaz1();
                    sc.nextLine();
                    System.out.println("Datos del Cliente");
                    System.out.print("\tIngrese el nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("\tIngrese el apellido: ");
                    apellido = sc.nextLine();
                    System.out.print("\tIngrese el pasaporte: ");
                    pasaporte = sc.nextLine();
                    System.out.print("\tIngrese la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("\tIngrese el barrio: ");
                    barrio = sc.nextLine();
                    System.out.print("\tIngrese la marca del celular: ");
                    marca = sc.next();
                    sc.nextLine();
                    System.out.print("\tIngrese el modelo del celular: ");
                    modelo = sc.nextLine();
                    System.out.print("\tIngrese el número del celular: ");
                    numeroCelular = sc.nextLine();

                    Cliente p = new Cliente(nombre, apellido,
                            pasaporte, ciudad,
                            barrio, marca,
                            modelo, numeroCelular);

                    switch (opcion2) {

                        case 1:
                            System.out.print("Ingrese el  numero de minutos: ");
                            double minutosSaldo2 = sc.nextDouble();
                            System.out.print("Ingrese el costo de minutos: ");
                            double costoMinutoSaldo2 = sc.nextDouble();
                            System.out.print("Ingrese el número de Gigas: ");
                            double gigaInternet3 = sc.nextDouble();
                            System.out.print("Ingrese el costo de las gigas: ");
                            double costoGiga3 = sc.nextDouble();
                            System.out.print("Ingrese el porcentaje de descuento: ");
                            double porcentaje = sc.nextDouble();

                            PlanPostPagoMinutosMegasEconomico pPPMM = new PlanPostPagoMinutosMegasEconomico(
                                    p,
                                    minutosSaldo2, costoMinutoSaldo2,
                                    gigaInternet3, costoGiga3,
                                    porcentaje);

                            c.insertarPlanPostPagoMinutosMegasEconomico(pPPMM);
                            break;

                        case 2:
                            System.out.print("Ingrese el número de minutos Nacionales: ");
                            double minutosNacionales = sc.nextDouble();
                            System.out.print("Ingrese el costo de minuto Nacional: ");
                            double costoMinutoNacional = sc.nextDouble();
                            System.out.print("Ingrese el número de minutos Internacionales: ");
                            double minutosInternacionales = sc.nextDouble();
                            System.out.print("Ingrese el costo de minuto Internacional: ");
                            double costoMinutoInternacional = sc.nextDouble();

                            PlanPostPagoMinutos pPPMin = new PlanPostPagoMinutos(
                                    p,
                                    minutosNacionales, costoMinutoNacional,
                                    minutosInternacionales, costoMinutoInternacional);

                            c.insertarPlanPostPagoMinutos(pPPMin);
                            break;
                        case 3:

                            System.out.print("Ingrese el número de Megas: ");
                            double gigaInternet = sc.nextDouble();
                            System.out.print("Ingrese el costo de las Gigas: ");
                            double costoGiga = sc.nextDouble();
                            System.out.print("Ingrese el valor de la tarifa base: ");
                            double tarifaBase = sc.nextDouble();
                            PlanPostPagoMegas pPPMe = new PlanPostPagoMegas(
                                    p, gigaInternet,
                                    costoGiga, tarifaBase);

                            c.insertarPlanPostPagoMegas(pPPMe);
                            break;

                        case 4:
                            System.out.print("Ingrese el numero de minutos: ");
                            double minutosSaldo = sc.nextDouble();
                            System.out.print("Ingrese el costo de minutos: ");
                            double costoMinutoSaldo = sc.nextDouble();
                            System.out.print("Ingrese el número de Gigas: ");
                            double gigaInternet2 = sc.nextDouble();
                            System.out.print("Ingrese el costo de las Gigas: ");
                            double costoGiga2 = sc.nextDouble();
                            PlanPostPagoMinutosMegas pPPMG = new PlanPostPagoMinutosMegas(
                                    p,
                                    minutosSaldo, costoMinutoSaldo,
                                    gigaInternet2, costoGiga2);

                            c.insertarPlanPostPagoMinutosMegas(pPPMG);
                            break;

                        default:
                            break;
                    }

                    System.out.printf("--------------------------------------------------\n"
                            + "¿Desea agregar otro plan?\n"
                            + "1--------    Si     \n"
                            + "0-------    No     \n"
                            + "--------------------------------------------------\n");
                    opcion2 = sc.nextInt();
                    System.out.println("--------------------------------------------------");

                } while (opcion2 != 0);

            }
            if (opcion == 2) {
                int op3 = interfaz2();
                switch (op3) {
                    case 1:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutos().get(i));
                        }
                        break;
                    case 3:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        break;

                    case 5:
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutos().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegas().get(i));
                        }
                        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
                            System.out.printf("%s\n", c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
                        }
                        break;
                    default:
                        break;
                }
            }

            if (opcion == 0) {
                System.out.println("Fin Del Programa --------");
            }

        } while (opcion != 0);
    }

    public static int interfaz1() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("SELECIONE EL TIPO DE PLAN QUE DESEE INGRESAR\n"
                + "--------------------------------------------------+\n"
                + "1------- Plan post pago minutos megas economico        \n"
                + "2------- Plan post pago minutos                        \n"
                + "3------- Plan post pago megas                          \n"
                + "4------- Plan post pago minutos megas                  \n"
                + "--------------------------------------------------+\n");
        int opcion = sc.nextInt();
        System.out.println("--------------------------------------------------");
        return opcion;
    }

    public static int interfaz2() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("SELECIONE EL TIPO DE PLAN que desea PRESENTAR\n"
                + "--------------------------------------------------+\n"
                + "1------- Plan post pago minutos megas economico        \n"
                + "2------- Plan post pago minutos                        \n"
                + "3------- Plan post pago megas                          \n"
                + "4------- Plan post pago minutos megas                  \n"
                + "5------- PRESENTAR TODOS LOS PLANES            \n"
                + "--------------------------------------------------+\n");
        int opcion = sc.nextInt();
        System.out.println("--------------------------------------------------");
        return opcion;
    }
}
