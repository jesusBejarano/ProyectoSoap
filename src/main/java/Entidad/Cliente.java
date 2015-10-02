/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author programadoryes
 */
public class Cliente {

    int Id_cliente;
    String Nombre;
    String Apellidos;
    String Telefono;
    int id_distrito;
    String Usuario;
    String Contrasena;
    String Direccion;
    
  

//<editor-fold defaultstate="collapsed" desc="Geter and seter">
  

    public int getId_cliente() {
        return Id_cliente;
    }
    
    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellidos() {
        return Apellidos;
    }
    
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public String getTelefono() {
        return Telefono;
    }
    
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
   
    
    public String getUsuario() {
        return Usuario;
    }
    
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    public String getContrasena() {
        return Contrasena;
    }
    
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    public String getDireccion() {
        return Direccion;
    }
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }
    
    
//</editor-fold>

    
 //   nuevo usuario

    public Cliente(String Nombre, String Apellidos, String Telefono, int id_distrito, String Usuario, String Contrasena, String Direccion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.id_distrito = id_distrito;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Direccion = Direccion;
    }

   
   

    public Cliente() {
    }
    

    //login
    public Cliente(String Usuario, String Contrasena) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }
    
}
