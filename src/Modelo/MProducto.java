/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MProducto {
     private int idProducto;
    private String nombreProducto;
    private double precioCompra;
    private double precioVenta;
    private boolean receta;
    private int stock;
    private String fechaVencimiento;
    private String laboratorio;
    private String categoria;
    private String fechaRegistro;

    public MProducto(int idProducto,String nombreProducto, double precioCompra, double precioVenta, boolean receta, int stock, String fechaVencimiento, String laboratorio, String categoria, String fechaRegistro) {

        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.receta = receta;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
        this.laboratorio = laboratorio;
        this.categoria = categoria;
        this.fechaRegistro= fechaRegistro;
    }

    // Getters
    public int getIdProducto() { return idProducto; }
    public String getNombreProducto() { return nombreProducto; }
    public double getPrecioCompra() {return precioCompra;}
    public double getPrecioVenta() { return precioVenta; }
    public boolean getReceta(){return receta;}
    public int getStock() { return stock; }
    public String getFechaVencimiento() {return fechaVencimiento;}
    public String getLaboratorio() { return laboratorio; }
    public String getCategoria() { return categoria; }
    public String getFechaRegistro(){return fechaRegistro;}
}
