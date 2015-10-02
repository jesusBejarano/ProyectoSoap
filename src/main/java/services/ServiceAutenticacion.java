/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entidad.Cliente;
import Servicio.SrvCliente;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author programadoryes
 */
@WebService(serviceName = "ServiceAutenticacion")
public class ServiceAutenticacion {
    SrvCliente vSrvCliente=new SrvCliente();
    Cliente cl;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "SingUp")
    public Cliente SingUp(@WebParam(name = "Nombre") String vnombre,@WebParam(name = "Apellido") String apellido,@WebParam(name = "Telefono") String telefono,@WebParam(name = "Distrito") int ID_Distrito,@WebParam(name = "Usuario") String usuario,@WebParam(name = "Password") String password,@WebParam(name = "Direccion") String direccion) throws SQLException {
        
         cl=new Cliente(vnombre,apellido,telefono,ID_Distrito,usuario,password,direccion );
        return vSrvCliente.registarCliente(cl);
    }
    @WebMethod(operationName = "Login")
    public Cliente Login(@WebParam(name = "Usuario") String usuario,@WebParam(name = "Password") String password) throws SQLException {
     
         cl=new Cliente(usuario,password);        
        return vSrvCliente.LoginCliente(cl);
    }
}
