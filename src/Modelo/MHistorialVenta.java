/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cris
 */
public class MHistorialVenta {
      private int idVenta;
    private String fecha;
    private double montoTotal;
    private int cantidadProductos;

    public MHistorialVenta(
            int idVenta,
            String fecha,
            double montoTotal,
            int cantidadProductos) {

        this.idVenta = idVenta;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cantidadProductos = cantidadProductos;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
}
