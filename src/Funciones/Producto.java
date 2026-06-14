/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Conexion.SQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import Modelo.MProducto;
import Modelo.MCategoria;
import Modelo.MLaboratorios;

/**
 *
 * @author cris
 */
public class Producto {

    
   public boolean RegistrarProducto(String nombre, double precioCompra, double precioVenta, boolean requiereReceta, int stockActivo, 
        String fechaVencimiento, int idLaboratorio, int idCategoria) {

    Connection con = SQLConexion.conectar();

    String sql =
        "INSERT INTO Inventario.Producto " +
        "(Nombre_Producto, Precio_Compra, Precio_Venta, " +
        "Requiere_Receta, Stock_Activo, Fecha_Vencimiento, " +
        "Id_Laboratorio, Id_Categoria) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (
        con;
        PreparedStatement ps = con.prepareStatement(sql)
    ) {

        ps.setString(1, nombre);
        ps.setDouble(2, precioCompra);
        ps.setDouble(3, precioVenta);
        ps.setBoolean(4, requiereReceta);
        ps.setInt(5, stockActivo);

        // Fecha_Vencimiento
        ps.setDate(
                6,
                java.sql.Date.valueOf(fechaVencimiento)
        );

        ps.setInt(7, idLaboratorio);
        ps.setInt(8, idCategoria);

        int filas = ps.executeUpdate();

        return filas > 0;

    } catch (SQLException e) {

        System.out.println(
                "Error al registrar producto: "
                + e.getMessage()
        );

        e.printStackTrace();
    }

    return false;
}
   public int ObtenerIdCategoria(String nombreCategoria) {

    int idCategoria = -1;

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "SELECT Id_Categoria " +
            "FROM Inventario.Categoria " +
            "WHERE Nombre_C = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombreCategoria);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            idCategoria =
                    rs.getInt("Id_Categoria");
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(e.getMessage());
    }

    return idCategoria;
}
   
   public int ObtenerIdLaboratorio(String nombreLaboratorio) {

    int idLaboratorio = -1;

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "SELECT Id_Laboratorio " +
            "FROM Inventario.Laboratorio " +
            "WHERE Nombre_Lab = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombreLaboratorio);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            idLaboratorio =
                    rs.getInt("Id_Laboratorio");
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
                "Error al obtener laboratorio: "
                + e.getMessage());
    }

    return idLaboratorio;
}
    
    
//    public ArrayList<MProducto> ObtenerProductos(String Busqueda){
//          ArrayList<MProducto> Productos = new ArrayList<>();
//
//    try {
//
//      Connection con = SQLConexion.conectar();
//
//       String sql;
//        PreparedStatement ps;
//
//        if (Busqueda.matches("\\d+")) {
//
//            // Buscar por ID
//            sql = "SELECT * "
//                + "FROM Inventario.vw_Productos "
//                + "WHERE Id_Producto = ?";
//
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, Integer.parseInt(Busqueda));
//
//        } else {
//
//            // Buscar por nombre
//            sql = "SELECT * "
//                + "FROM Inventario.vw_Productos "
//                + "WHERE Nombre_Producto LIKE ?";
//
//            ps = con.prepareStatement(sql);
//            ps.setString(1, "%" + Busqueda + "%");
//        }
//
//        ResultSet rs = ps.executeQuery();
//
//        while (rs.next()) {
//
//            MProducto p = new MProducto(
//                rs.getInt("Id_Producto"),
//                rs.getString("Nombre_Producto"),
//                rs.getDouble("Precio_Compra"),
//                rs.getDouble("Precio_Venta"),
//                rs.getBoolean("Requiere_Receta"),
//                rs.getInt("Stock_Activo"),
//                rs.getString("Fecha_Vencimiento"),
//                rs.getString("Nombre_Lab"),
//                rs.getString("Nombre_C")
//            );
//
//            Productos.add(p);
//        }
//
//    } catch (Exception e) {
//        System.out.println("problemas con obtenerProductos" + e.getMessage());
//    }
//
//    return Productos;
//    }
   
      public ArrayList<MProducto> ObtenerProductos(String Busqueda){
          ArrayList<MProducto> Productos = new ArrayList<>();
        try {
        Connection con = SQLConexion.conectar();
        String sql;
        PreparedStatement ps;
        if (Busqueda.matches("\\d+")) {
            // Buscar por ID
            sql = "SELECT p.Id_Producto, p.Nombre_Producto, p.Precio_Compra, p.Precio_Venta, "
                + "p.Requiere_Receta, p.Stock_Activo, p.Fecha_Vencimiento, p.Fecha_Ingreso, "
                + "l.Nombre_Lab, c.Nombre_C "
                + "FROM Inventario.Producto p "
                + "JOIN Inventario.Laboratorio l ON p.Id_Laboratorio = l.Id_Laboratorio "
                + "JOIN Inventario.Categoria c ON p.Id_Categoria = c.Id_Categoria "
                + "WHERE p.Id_Producto = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(Busqueda));
        } else {
            // Buscar por nombre
            sql = "SELECT p.Id_Producto, p.Nombre_Producto, p.Precio_Compra, p.Precio_Venta, "
                + "p.Requiere_Receta, p.Stock_Activo, p.Fecha_Vencimiento, p.Fecha_Ingreso,  "
                + "l.Nombre_Lab, c.Nombre_C "
                + "FROM Inventario.Producto p "
                + "JOIN Inventario.Laboratorio l ON p.Id_Laboratorio = l.Id_Laboratorio "
                + "JOIN Inventario.Categoria c ON p.Id_Categoria = c.Id_Categoria "
                + "WHERE p.Nombre_Producto LIKE ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + Busqueda + "%");
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            MProducto p = new MProducto(
                rs.getInt("Id_Producto"),
                rs.getString("Nombre_Producto"),
                rs.getDouble("Precio_Compra"),
                rs.getDouble("Precio_Venta"),
                rs.getBoolean("Requiere_Receta"),
                rs.getInt("Stock_Activo"),
                rs.getString("Fecha_Vencimiento"),
                rs.getString("Nombre_Lab"),
                rs.getString("Nombre_C"),
                rs.getString("Fecha_Ingreso")
            );
            Productos.add(p);
        }
    } catch (Exception e) {
        System.out.println("problemas con obtenerProductos" + e.getMessage());
    }
    return Productos;
}
    
    
    public ArrayList<MProducto> buscarPorCategoria(String categoria) {

    ArrayList<MProducto> lista = new ArrayList<>();

    try {

      Connection con = SQLConexion.conectar();

        String sql =
            "SELECT * " +
            "FROM Inventario.vw_Productos " +
            "WHERE Nombre_C = ?";
    

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, categoria);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MProducto p = new MProducto(
                rs.getInt("Id_Producto"),
                rs.getString("Nombre_Producto"),
                rs.getDouble("Precio_Compra"),
                rs.getDouble("Precio_Venta"),
                rs.getBoolean("Requiere_Receta"),
                rs.getInt("Stock_Activo"),
                rs.getString("Fecha_Vencimiento"),
                rs.getString("Nombre_Lab"),
                rs.getString("Nombre_C"),
                rs.getString("Fechar_Ingreso")

            );

            lista.add(p);
        }

    } catch (Exception e) {
        System.out.println("Problema con buscar producto por categoria" +e.getMessage());
    }

    return lista;
}
    
    public boolean EliminarProducto(int idProducto) {

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "DELETE FROM Inventario.Producto " +
            "WHERE Id_Producto = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idProducto);

        int filas = ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al eliminar producto: "
            + e.getMessage());
    }

    return false;
}
    
    public boolean RegistrarCategoria(String nombreCategoria) {

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "INSERT INTO Inventario.Categoria " +
            "(Nombre_C) VALUES (?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombreCategoria);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al registrar categoría: "
            + e.getMessage());
    }

    return false;
    }
    
    public boolean EliminarCategoria(int idCategoria) {

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "DELETE FROM Inventario.Categoria " +
            "WHERE Id_Categoria = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idCategoria);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al eliminar categoría: "
            + e.getMessage());
    }

    return false;
    }
    
    public boolean EliminarLaboratorio(
        int idLaboratorio) {

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "DELETE FROM Inventario.Laboratorio " +
            "WHERE Id_Laboratorio = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idLaboratorio);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al eliminar laboratorio: "
            + e.getMessage());
    }

    return false;
    }
    
    public boolean RegistrarLaboratorio(String nombreLaboratorio) {

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "INSERT INTO Inventario.Laboratorio " +
            "(Nombre_Lab) VALUES (?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombreLaboratorio);

        int filas =
                ps.executeUpdate();

        ps.close();
        con.close();

        return filas > 0;

    } catch (Exception e) {

        System.out.println(
            "Error al registrar laboratorio: "
            + e.getMessage());
    }

    return false;
}
    
    public ArrayList<MCategoria> ObtenerCategorias() {

    ArrayList<MCategoria> categorias =
            new ArrayList<>();

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "SELECT Id_Categoria, Nombre_C " +
            "FROM Inventario.Categoria " +
            "ORDER BY Nombre_C";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while (rs.next()) {

            MCategoria c =
                new MCategoria(

                    rs.getInt("Id_Categoria"),
                    rs.getString("Nombre_C")
                );

            categorias.add(c);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error al obtener categorías: "
            + e.getMessage());
    }

    return categorias;
}

    public ArrayList<MLaboratorios> ObtenerLaboratorios() {

    ArrayList<MLaboratorios> laboratorios =
            new ArrayList<>();

    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "SELECT Id_Laboratorio, Nombre_Lab " +
            "FROM Inventario.Laboratorio " +
            "ORDER BY Nombre_Lab";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while (rs.next()) {

            MLaboratorios l =
                new MLaboratorios(

                    rs.getInt("Id_Laboratorio"),
                    rs.getString("Nombre_Lab")
                );

            laboratorios.add(l);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error al obtener laboratorios: "
            + e.getMessage());
    }

    return laboratorios;
   }
}
