/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author programadoryes
 */
public class ConexionDB {
    public static Connection conexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/upclicoreria","adminZSFduhG","75jwmp-X_ggV");
        } catch (Exception ex) {
            conexion = null;
            System.out.println("Excepcion Interna : " + ex.getMessage());
        }
        return conexion;
    }
    
}
