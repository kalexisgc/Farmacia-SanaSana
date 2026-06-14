/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Conexion.SQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import Modelo.MProveedor;
import java.sql.ResultSet;

/**
 *
 * @author cris
 */
public class Proveedor {
    public boolean RegistrarProveedor(String nombres, String telefono, String ruc, String correo, String direccion , String apellidos){
         try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "INSERT INTO PCompra.Proveedor " +
            "(Nombres, Telefono, Ruc, Correo, Direccion, Apellidos) " +
            "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombres);
        ps.setString(2, telefono);
        ps.setString(3, ruc);
        ps.setString(4, correo);
        ps.setString(5, direccion);
        ps.setString(6, apellidos);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al registrar proveedor: "
            + e.getMessage());
    }

    return false;
    }
    
    public ArrayList<MProveedor> ObtenerProveedores() {

    ArrayList<MProveedor> proveedores = new ArrayList<>();
    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "SELECT Id_Proveedor, "+
            "Nombres, " +
            "Telefono, " +
            "Ruc, " +
            "Correo, " +
            "Direccion, " +
            "Apellidos " +
            "FROM PCompra.Proveedor ";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while (rs.next()) {

            MProveedor p =
                new MProveedor(

                    rs.getInt("Id_Proveedor"),
                    rs.getString("Nombres"),
                    rs.getString("Telefono"),
                    rs.getString("Ruc"),
                    rs.getString("Correo"),
                    rs.getString("Direccion"),
                    rs.getString("Apellidos")

                );

            proveedores.add(p);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error al obtener proveedores: "
            + e.getMessage());
    }

    return proveedores;
}
    
    public boolean EliminarProveedor(
        String nombres,
        String apellidos) {

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "DELETE FROM PCompra.Proveedor " +
            "WHERE Nombres = ? " +
            "AND Apellidos = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombres);
        ps.setString(2, apellidos);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al eliminar proveedor: "
            + e.getMessage());
    }

    return false;
}
}
