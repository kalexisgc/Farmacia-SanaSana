/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MLaboratorios {
    private int idLaboratorio;
    private String nombreLaboratorio;
    
    public MLaboratorios(int idLaboratorio, String nombreLaboratorio){
        this.idLaboratorio=idLaboratorio;
        this.nombreLaboratorio=nombreLaboratorio;    
    }
    
    public int getIDlaboratorio(){return this.idLaboratorio;}
    public String getNombreLaboratorio(){return this.nombreLaboratorio;}
    
}
