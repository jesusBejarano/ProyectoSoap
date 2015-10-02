/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Dao.DaoCliente;
import Entidad.Cliente;
import java.sql.SQLException;

/**
 *
 * @author programadoryes
 */
public class SrvCliente {
    DaoCliente daoclie=new DaoCliente();
    public Cliente registarCliente(Cliente vcliente) throws SQLException
    {
    return daoclie.registarCliente(vcliente);
    }
    public Cliente LoginCliente(Cliente vcliente) throws SQLException
    {
    return daoclie.Login(vcliente);
    }
    
}
