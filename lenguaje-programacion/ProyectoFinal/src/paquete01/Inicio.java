package paquete01;

import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Enlace enlace = new Enlace();
            enlace.establecerConexion();

            // Ciclo repetitivo para crear objetos de Planes de celular
            while (true) {
                System.out.println("Ingrese el tipo de plan (1, 2, 3, 4):");
                System.out.println("1. PlanPostPagoMinutos");
                System.out.println("2. PlanPostPagoMegas");
                System.out.println("3. PlanPostPagoMinutosMegas");
                System.out.println("4. PlanPostPagoMinutosMegasEconomico");
                System.out.println("0. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 0) {
                    break;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese su nombre:");
                        String n = scanner.nextLine();

                        System.out.println("Ingrese su Pasaporte:");
                        String p = scanner.nextLine();
                        System.out.println("Ingrese su Ciudad: ");
                        String c = scanner.nextLine();
                        System.out.println("Ingrese su Barrio: :");
                        String b = scanner.nextLine();
                        System.out.println("Ingrese su marca de Celular:");
                        String mC = scanner.nextLine();
                        System.out.println("Ingrese su modelo de Celular:");
                        String moC = scanner.nextLine();
                        System.out.println("Ingrese su numero de Celular: :");
                        String numC = scanner.nextLine();

                        System.out.println("Ingrese los minutos Nacionales:");
                        int minutos = scanner.nextInt();
                        System.out.println("Ingrese el costo de los minutos nacional:");
                        double costoMi = scanner.nextDouble();
                        System.out.println("Ingrese los minutos Internacionales: ");
                        int minInter = scanner.nextInt();
                        System.out.println("Ingrese el costo de los minutos Internacionales:");
                        double cMI = scanner.nextDouble();

                        // Crear objeto del tipo PlanPostPagoMinutos
                        PlanPostPagoMinutos planMinutos
                                = new PlanPostPagoMinutos(n, p, c, b, mC, moC, numC,
                                        minutos, costoMi, minInter, cMI);
                        // planMinutos.calcularPagoMensual();
                        // Guardar el objeto en la base de datos
                        enlace.insertarCliente(planMinutos);

                        break;

                    case 2:
                        System.out.println("Ingrese su nombre:");
                        String n1 = scanner.nextLine();
                        System.out.println("Ingrese su Pasaporte:");
                        String p1 = scanner.nextLine();
                        System.out.println("Ingrese su Ciudad: ");
                        String c1 = scanner.nextLine();
                        System.out.println("Ingrese su Barrio: :");
                        String b1 = scanner.nextLine();
                        System.out.println("Ingrese su marca de Celular:");
                        String mC1 = scanner.nextLine();
                        System.out.println("Ingrese su modelo de Celular:");
                        String moC1 = scanner.nextLine();
                        System.out.println("Ingrese su numero de Celular: :");
                        String numC1 = scanner.nextLine();

                        System.out.println("Ingrese las megas: ");
                        double megas1 = scanner.nextDouble();
                        System.out.println("Ingrese el costo por gigas:");
                        double cG1 = scanner.nextDouble();
                        System.out.println("Ingrese la tarifa Base:");
                        double pD1 = scanner.nextDouble();
                        // Crear objeto del tipo PlanPostPagoMegas
                        PlanPostPagoMegas planMegas
                                = new PlanPostPagoMegas(n1, p1, c1, b1, mC1,
                                        moC1, numC1, megas1, cG1, pD1);
                        planMegas.calcularPagoMensual();
                        // Guardar el objeto en la base de datos
                        enlace.insertarCliente(planMegas);

                        break;

                    case 3:
                        System.out.println("Ingrese su nombre:");
                        String n2 = scanner.nextLine();
                        System.out.println("Ingrese su Pasaporte:");
                        String p2 = scanner.nextLine();
                        System.out.println("Ingrese su Ciudad: ");
                        String c2 = scanner.nextLine();
                        System.out.println("Ingrese su Barrio: :");
                        String b2 = scanner.nextLine();
                        System.out.println("Ingrese su marca de Celular:");
                        String mC2 = scanner.nextLine();
                        System.out.println("Ingrese su modelo de Celular:");
                        String moC2 = scanner.nextLine();
                        System.out.println("Ingrese su numero de Celular: :");
                        String numC2 = scanner.nextLine();

                        System.out.println("Ingrese los minutos :");
                        int minutos1 = scanner.nextInt();
                        System.out.println("Ingrese el costo de los minutos: ");
                        double costoMi2 = scanner.nextDouble();
                        System.out.println("Ingrese las megas: ");
                        double megas2 = scanner.nextDouble();
                        System.out.println("Ingrese el costo por gigas:");
                        double cG2 = scanner.nextDouble();
                        // Crear objeto del tipo PlanPostPagoMinutosMegas
                        PlanPostPagoMinutosMegas planMinutosMegas
                                = new PlanPostPagoMinutosMegas(n2, p2, c2, b2, mC2,
                                        moC2, numC2, minutos1, costoMi2, megas2, cG2);
                        planMinutosMegas.calcularPagoMensual();
                        // Guardar el objeto en la base de datos
                        enlace.insertarCliente(planMinutosMegas);

                        break;

                    case 4:
                        System.out.println("Ingrese su nombre:");
                        String n3 = scanner.nextLine();
                        System.out.println("Ingrese su Pasaporte:");
                        String p3 = scanner.nextLine();
                        System.out.println("Ingrese su Ciudad: ");
                        String c3 = scanner.nextLine();
                        System.out.println("Ingrese su Barrio: :");
                        String b3 = scanner.nextLine();
                        System.out.println("Ingrese su marca de Celular:");
                        String mC3 = scanner.nextLine();
                        System.out.println("Ingrese su modelo de Celular:");
                        String moC3 = scanner.nextLine();
                        System.out.println("Ingrese su numero de Celular: :");
                        String numC3 = scanner.nextLine();

                        System.out.println("Ingrese los minutos :");
                        int minutos3 = scanner.nextInt();
                        System.out.println("Ingrese el costo de los minutos: ");
                        double costoMi3 = scanner.nextDouble();
                        System.out.println("Ingrese las megas: ");
                        double megas3 = scanner.nextDouble();
                        System.out.println("Ingrese el costo por gigas:");
                        double cG3 = scanner.nextDouble();
                        System.out.println("Ingrese el porcentaje de Descuento:");
                        double pD = scanner.nextDouble();
                        // Crear objeto del tipo PlanPostPagoMinutosMegasEconomico
                        PlanPostPagoMinutosMegasEconomico planEconomico
                                = new PlanPostPagoMinutosMegasEconomico(n3, p3, c3, b3, mC3,
                                        moC3, numC3, minutos3, costoMi3, megas3, cG3, pD);
                        planEconomico.calcularPagoMensual();
                        // Guardar el objeto en la base de datos
                        enlace.insertarCliente(planEconomico);

                        break;
                    case 0:

                        System.out.println("Fin del Programa....");
                    default:
                        System.out.println("Opción inválida, intente nuevamente.");

                }

            }
            // Obtener la información de los registros de la base de datos y presentarla
            ArrayList<PlanCelular> listaPlanes = enlace.obtenerDataClientes();
            for (PlanCelular plan : listaPlanes) {
                System.out.println(plan.toString());
            }

            enlace.obtenerConexion().close(); // Cerrar la conexión con la base de datos
        } catch (Exception e) {
        }
    }
}
