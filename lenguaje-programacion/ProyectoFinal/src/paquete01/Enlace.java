/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jeanca
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {
        try {
            // db parameters  
            String url = "jdbc:sqlite:db/clientes.bd";
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

    public void insertarCliente(PlanCelular pC) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO clientes (nombre,Pasaporte, ciudad,barrio, marcaC, modeloC, numeroC, pagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%f', '%d', '%s')",
                    pC.getNombreApellidoPropietario(),
                    pC.getPasaportePropietario(),
                    pC.getCiudadPropietario(),
                    pC.getBarrioPropietario(),
                    pC.getMarcaCelular(),
                    pC.getModeloCelular(),
                    pC.getNumeroCelular(),
                    pC.getPagoMensual());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanCelular> obtenerDataClientes() {
        ArrayList<PlanCelular> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from clientes;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanCelular pL = new PlanCelular();
                pL.setNombreApellidoPropietario(rs.getString("nombre"));
                pL.setPasaportePropietario(rs.getString("pasaporte"));
                pL.setCiudadPropietario(rs.getString("ciudad"));
                pL.setBarrioPropietario(rs.getString("barrio"));
                pL.setMarcaCelular(rs.getString("marcaCe"));
                pL.setModeloCelular(rs.getString("modeloC"));
                pL.setNumeroCelular(rs.getString("numeroCelular"));
                pL.setPagoMensual(rs.getDouble("pagoMensua"));
               
                lista.add(pL);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());
        }
        return lista;
    }
    

}
