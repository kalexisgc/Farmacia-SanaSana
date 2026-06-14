/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MDatosPersonales {
    private int IDdatosPersonales;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    
    public MDatosPersonales(int IDdatosPersonales, String nombre, String apellidos, String correo, String telefono){
        this.IDdatosPersonales = IDdatosPersonales;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public int getIDdatosPersonales(){return this.IDdatosPersonales;}
    public String getNombres(){return this.nombres;}
    public String getApellidos(){return this.apellidos;}
    public String getCorreo(){return this.correo;}
    public String getTelefono(){return this.telefono;}
}
