/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MProveedor {
    private int idProveedor;
    private String nombres;
    private String telefono;
    private String ruc;
    private String correo;
    private String direccion;
    private String apellidos;
    
    public MProveedor(int idProveedor, String nombres, String telefono, String ruc, String correo, String direccion, String apellidos){
        this.idProveedor=idProveedor;
        this.nombres=nombres;
        this.telefono=telefono;
        this.ruc=ruc;
        this.correo=correo;
        this.direccion=direccion;
        this.apellidos=apellidos;
    }
    
    public int getIDproveedor(){return idProveedor;}
    public String getNombres(){return nombres;}
    public String getTelefono(){return telefono;}
    public String getRuc(){return ruc;}
    public String getCorreo(){return correo;}
    public String getDireccion(){return direccion;}
    public String getApellidos(){return apellidos;}
    
}
