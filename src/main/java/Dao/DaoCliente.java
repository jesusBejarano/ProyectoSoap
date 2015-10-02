package Dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Dao.ConexionDB;
import Entidad.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author programadoryes
 */
public class DaoCliente {
    
     public Cliente  registarCliente(Cliente vaCliente) throws SQLException {
        Connection conexion = null;
         Cliente v_cliente = new Cliente();
        
        try {
            conexion =  ConexionDB.conexion();
            //conexion.setAutoCommit(false); 
//            ps = conexion.prepareStatement("CALL LOGIN_CLIENTE(?,?)");
            
            CallableStatement cStmt = conexion.prepareCall("CALL INSERTAR_CLIENTE(?,?,?,?,?,?,?)");                 
             cStmt.setString(1, vaCliente.getNombre());
            cStmt.setString(2, vaCliente.getApellidos());
            cStmt.setString(3, vaCliente.getTelefono());
            cStmt.setInt(4, vaCliente.getId_distrito());
            cStmt.setString(5, vaCliente.getUsuario());
            cStmt.setString(6, vaCliente.getContrasena());
            cStmt.setString(7, vaCliente.getDireccion());
             
             cStmt.execute();    
             final ResultSet rs = cStmt.getResultSet();  
               
             while (rs.next()) {  
                v_cliente.setId_cliente(rs.getInt("Id_cliente"));
                v_cliente.setNombre(rs.getString("Nombre"));  
                v_cliente.setApellidos(rs.getString("Apellidos"));
                v_cliente.setTelefono(rs.getString("Telefono"));
                v_cliente.setId_distrito(rs.getInt("Id_distrito"));
                v_cliente.setUsuario(rs.getString("Usuario"));
                v_cliente.setContrasena(rs.getString("Contrasena"));
                v_cliente.setDireccion(rs.getString("Direccion")); 
//                 System.out.println("Cadena de caracteres pasada como parametro de entrada="+rs.getString("inputParam"));  
             } 
        }catch (Exception e) 
        {  
            conexion.rollback();  
            e.printStackTrace(); 
            conexion.close();
            return v_cliente ;
            
        }
        finally
        {  
            conexion.close();  
            return v_cliente ;
        } 
    }

    public Cliente Login(Cliente cliente) throws SQLException {
        
        Connection conexion = null;
         Cliente vcliente = new Cliente();
        
        try {
            conexion =  ConexionDB.conexion();
            conexion.setAutoCommit(false); 
//            ps = conexion.prepareStatement("CALL LOGIN_CLIENTE(?,?)");
            
            CallableStatement cStmt = conexion.prepareCall("call LOGIN_CLIENTE(?, ?)");    
             cStmt.setString(1, cliente.getUsuario());    
             cStmt.setString(2, cliente.getContrasena());                 
             cStmt.execute();    
             final ResultSet rs = cStmt.getResultSet();  
               
             while (rs.next()) {  
                vcliente.setId_cliente(rs.getInt("Id_cliente"));
                vcliente.setNombre(rs.getString("Nombre"));  
                vcliente.setApellidos(rs.getString("Apellidos"));
                vcliente.setTelefono(rs.getString("Telefono"));
                vcliente.setId_distrito(rs.getInt("Id_distrito"));
                vcliente.setUsuario(rs.getString("Usuario"));
                vcliente.setContrasena(rs.getString("Contrasena"));
                vcliente.setDireccion(rs.getString("Direccion")); 
//                 System.out.println("Cadena de caracteres pasada como parametro de entrada="+rs.getString("inputParam"));  
             }           
               
            
            
        } catch (Exception e) 
        {  
            conexion.rollback();  
            e.printStackTrace(); 
            conexion.close();
            return vcliente ;
            
        }
        finally
        {  
            conexion.close();  
            return vcliente ;
        }  
    }  
} 

