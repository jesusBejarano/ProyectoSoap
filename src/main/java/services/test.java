/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Dao.ConexionDB;
import Entidad.Cliente;
import Servicio.SrvCliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author programadoryes
 */
public class test {
      public static void main(String[] args) throws SQLException {
        Connection conexion;
        conexion = ConexionDB.conexion();
                if(conexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }                
          SrvCliente vclie= new SrvCliente();
          vclie.LoginCliente(new Cliente("jesus","jesus"));
          vclie.registarCliente(new Cliente("JESUS","BEJARANO","95413911",1,"ALEX","ALEX","AV ALCAZAR"));
          
         //JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        
    }
    
}
