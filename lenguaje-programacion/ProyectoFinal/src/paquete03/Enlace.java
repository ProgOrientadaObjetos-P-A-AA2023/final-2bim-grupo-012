/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.PlanPostPagoMegas;
import paquete02.PlanPostPagoMinutos;
import paquete02.PlanPostPagoMinutosMegas;
import paquete02.PlanPostPagoMinutosMegasEconomico;
import paquete02.Cliente;

public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/clientes.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    // Objeto PlanPostPagoMinutosMegasEconomico
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico "
                    + "(nombreCliente,apellidoCliente,pasaporteCliente,"
                    + "ciudadCliente,barrioCliente,marcaCelular,modeloCelular,numeroCelular,minutos,"
                    + "costoMinutos,gigas, costoGigas, porcentajeDescuento) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.getCliente().obtenerNombreCliente(),
                    p.getCliente().obtenerApellidoCliente(),
                    p.getCliente().obtenerPasaporteCliente(),
                    p.getCliente().obtenerCiudadCliente(),
                    p.getCliente().obtenerBarrioCliente(),
                    p.getCliente().obtenerMarcaCelular(),
                    p.getCliente().obtenerModeloCelular(),
                    p.getCliente().obtenerNumeroCelular(),
                    p.getMinutos(),
                    p.getCostoMinutos(),
                    p.getMegasGigas(),
                    p.getCostoGiga(),
                    p.getPorcentDesc());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    // Objeto PlanPostPagoMinutos
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutos"
                    + "(nombreCliente,apellidoCliente,pasaporteCliente,"
                    + "ciudadCliente,barrioCliente,marcaCelular,modeloCelular,numeroCelular,minutosNacional,"
                    + "costoMinutosNacional, minutosInternacional, costoMinutosInternacional) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.getCliente().obtenerNombreCliente(),
                    p.getCliente().obtenerApellidoCliente(),
                    p.getCliente().obtenerPasaporteCliente(),
                    p.getCliente().obtenerCiudadCliente(),
                    p.getCliente().obtenerBarrioCliente(),
                    p.getCliente().obtenerMarcaCelular(),
                    p.getCliente().obtenerModeloCelular(),
                    p.getCliente().obtenerNumeroCelular(),
                    p.getMinutosNacionales(),
                    p.getCostoMinutoNacional(),
                    p.getMinutosInternacionales(),
                    p.getCostoMinutoInternacional());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    // Objeto PlanPostPagoMegas
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas"
                    + "(nombreCliente,apellidoCliente,pasaporteCliente,"
                    + "ciudadCliente,barrioCliente,marcaCelular,modeloCelular,numeroCelular, gigas,"
                    + "costoGigas, tarifaBase) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f')",
                    p.getCliente().obtenerNombreCliente(),
                    p.getCliente().obtenerApellidoCliente(),
                    p.getCliente().obtenerPasaporteCliente(),
                    p.getCliente().obtenerCiudadCliente(),
                    p.getCliente().obtenerBarrioCliente(),
                    p.getCliente().obtenerMarcaCelular(),
                    p.getCliente().obtenerModeloCelular(),
                    p.getCliente().obtenerNumeroCelular(),
                    p.getMegas(),
                    p.getCostoPorGiga(),
                    p.getTarifaBase());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    // PlanPostPagoMinutosMegas
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegas"
                    + "(nombreCliente,apellidoCliente,pasaporteCliente,"
                    + "ciudadCliente,barrioCliente,marcaCelular,modeloCelular,numeroCelular,minutos,"
                    + "costoMinutos,gigas, costoGigas) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p.getCliente().obtenerNombreCliente(),
                    p.getCliente().obtenerApellidoCliente(),
                    p.getCliente().obtenerPasaporteCliente(),
                    p.getCliente().obtenerCiudadCliente(),
                    p.getCliente().obtenerBarrioCliente(),
                    p.getCliente().obtenerMarcaCelular(),
                    p.getCliente().obtenerModeloCelular(),
                    p.getCliente().obtenerNumeroCelular(),
                    p.getMinutos(),
                    p.getCostoMinuto(),
                    p.getMegas(),
                    p.getCostoPorGiga());

            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    // btener del primer Plan
    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {

        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                Cliente c = new Cliente(rs.getString("nombreCliente"),
                        rs.getString("apellidoCliente"),
                        rs.getString("pasaporteCliente"),
                        rs.getString("ciudadCliente"),
                        rs.getString("barrioCliente"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                PlanPostPagoMinutosMegasEconomico pm3 = new PlanPostPagoMinutosMegasEconomico(
                        c,
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getDouble("gigas"),
                        rs.getDouble("costoGigas"),
                        rs.getDouble("porcentajeDescuento"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegasEconomico");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    // obtener Segundo Plan
    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {

        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                Cliente c = new Cliente(rs.getString("nombreCliente"),
                        rs.getString("apellidoCliente"),
                        rs.getString("pasaporteCliente"),
                        rs.getString("ciudadCliente"),
                        rs.getString("barrioCliente"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                PlanPostPagoMinutos pm3 = new PlanPostPagoMinutos(
                        c,
                        rs.getDouble("minutosNacional"),
                        rs.getDouble("costoMinutosNacional"),
                        rs.getDouble("minutosInternacional"),
                        rs.getDouble("costoMinutosInternacional"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutos");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    // obtener Tercer Plan
    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {

        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                Cliente c = new Cliente(rs.getString("nombreCliente"),
                        rs.getString("apellidoCliente"),
                        rs.getString("pasaporteCliente"),
                        rs.getString("ciudadCliente"),
                        rs.getString("barrioCliente"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                PlanPostPagoMegas pm3 = new PlanPostPagoMegas(
                        c,
                        rs.getDouble("gigas"),
                        rs.getDouble("costoGigas"),
                        rs.getDouble("tarifaBase"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    // Obtener Cuarto Plan
    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {

        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                Cliente c = new Cliente(rs.getString("nombreCliente"),
                        rs.getString("apellidoCliente"),
                        rs.getString("pasaporteCliente"),
                        rs.getString("ciudadCliente"),
                        rs.getString("barrioCliente"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                PlanPostPagoMinutosMegas pm3 = new PlanPostPagoMinutosMegas(
                        c,
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getDouble("gigas"),
                        rs.getDouble("costoPorGigas"));

                pm3.calcularPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas"); 
            System.out.println(e.getMessage());

        }
        return lista;
    }
      public String obtenerNombreCliente(int clienteId) {
        String nombre = null;

        try {
            String query = "SELECT nombreCliente FROM Cliente WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, clienteId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                nombre = resultSet.getString("nombreCliente");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Exception: obtenerNombreClientePorId");
            System.out.println(e.getMessage());
        }

        return nombre;
    }

}
