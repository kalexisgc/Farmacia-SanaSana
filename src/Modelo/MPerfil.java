/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MPerfil {
    private static int IdUsuario;
    private static String Rol;
    private static String FechaRegistro;
    private static String NombreUsuario;
    private static String Nombres;
    private static String Apellidos;
    private static String Correo;
    private static int Telefono;
    
    public MPerfil(int IdUsuario, String Rol, String FechaRegistro, String NombreUsuario, String Nombres, String Apellidos, String Correo, int Telefono){
        this.IdUsuario=IdUsuario;
        this.Rol=Rol;
        this.FechaRegistro=FechaRegistro;
        this.NombreUsuario=NombreUsuario;
        this.Nombres=Nombres;
        this.Apellidos=Apellidos;
        this.Correo=Correo;
        this.Telefono=Telefono;
    }
    
    public int getIdUsuario(){return this.IdUsuario;}
    public String getRol(){return this.Rol;}
    public String getFechaRegistro(){return this.FechaRegistro;}
    public String getNombreUsuario(){return this.NombreUsuario;}
    public String getNombres(){return this.Nombres;}
    public String getApellidos(){return this.Apellidos;}
    public String getCorreo(){return this.Correo;}
    public int getTelefono(){return this.Telefono;}
            
    
}
