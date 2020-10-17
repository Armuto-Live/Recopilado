package com.devel.babas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class Conexion {

    protected static Connection conexion;
    protected static PreparedStatement consulta;
    protected static ResultSet resultado;

    private static final String Driver = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://127.0.0.1:3306/babas_db";
    private static final String USER = "babas";
    private static final String PASSWORD = "eder";

    protected static boolean abrirConexion(){
        try {
            Class.forName(Driver);
            conexion = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
    protected static boolean cerrarConexion() {
        try {
            if (!conexion.isClosed()) {
                if (!resultado.isClosed()) {
                    resultado.close();
                }
                consulta.close();
                conexion.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
    protected static void restablecer(){
        try {
            if (!resultado.isClosed()) {
                resultado.close();
            }
            consulta.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
