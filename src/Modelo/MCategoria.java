/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MCategoria {
    private int idCategoria;
    private String nombreCategoria;
    
    public MCategoria(int idCategoria, String nombreCategoria){
        this.idCategoria=idCategoria;
        this.nombreCategoria=nombreCategoria;
    }
    
    public int getIDcategoria(){return this.idCategoria;}
    public String getNombreCategoria(){return this.nombreCategoria;}
    
}
