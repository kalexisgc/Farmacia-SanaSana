/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Conexion.SQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import Modelo.MSesion;
import Modelo.MHistorialVenta;

/**
 *
 * @author cris
 */
import Modelo.MDatosPersonales;
import java.beans.Statement;
import java.util.ArrayList;
public class Cliente {
   public void CrearClienteDesdeUsuario() {

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "SELECT u.Id_Usuario, " +
            "       d.Nombres, " +
            "       d.Correo, " +
            "       d.Telefono " +
            "FROM Personas.Usuarios u " +
            "INNER JOIN Personas.DatosPersonales d " +
            "ON u.Id_DatosPersonales = d.Id_DatosPersonales " +
            "WHERE u.Nombre_Usuario = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, MSesion.UsuarioActual);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            int idUsuario =
                    rs.getInt("Id_Usuario");

            String nombre =
                    rs.getString("Nombres");

            String correo =
                    rs.getString("Correo");

            String telefono =
                    rs.getString("Telefono");

            // Verificar si ya existe
            String verificar =
                "SELECT Id_Cliente " +
                "FROM Pventa.Cliente " +
                "WHERE Id_Usuario = ?";

            PreparedStatement psVerificar =
                    con.prepareStatement(verificar);

            psVerificar.setInt(1, idUsuario);

            ResultSet rsVerificar =
                    psVerificar.executeQuery();

            if (!rsVerificar.next()) {

                String sqlInsert =
                    "INSERT INTO Pventa.Cliente " +
                    "(Nombre, Correo, Telefono, Id_Usuario) " +
                    "VALUES (?, ?, ?, ?)";

                PreparedStatement psInsert =
                        con.prepareStatement(sqlInsert);

                psInsert.setString(1, nombre);
                psInsert.setString(2, correo);
                psInsert.setString(3, telefono);
                psInsert.setInt(4, idUsuario);

                psInsert.executeUpdate();

                psInsert.close();
            }

            rsVerificar.close();
            psVerificar.close();
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error CrearClienteDesdeUsuario: "
            + e.getMessage());
    }
}
    
    public int ObtenerIdCliente() {

    int idCliente = -1;

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "SELECT Id_Cliente " +
            "FROM Pventa.Cliente " +
            "WHERE Id_Usuario = ( " +
            "    SELECT Id_Usuario " +
            "    FROM Personas.Usuarios " +
            "    WHERE Nombre_Usuario = ? " +
            ")";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, MSesion.UsuarioActual);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            idCliente = rs.getInt("Id_Cliente");

            System.out.println(
                "Cliente encontrado: " + idCliente);
        } else {

            System.out.println(
                "No existe cliente asociado al usuario: "
                + MSesion.UsuarioActual);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error ObtenerIdCliente: "
            + e.getMessage());
    }

    return idCliente;
}
    
    public boolean existeClientePorUsuario(String nombreUsuario) {
    boolean existe = false;

    String sql = "SELECT C.Id_Cliente " +
                 "FROM Pventa.Cliente C " +
                 "INNER JOIN Personas.Usuarios U ON C.Id_Usuario = U.Id_Usuario " +
                 "WHERE U.Nombre_Usuario = ?";



    try {
        Connection con = SQLConexion.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, nombreUsuario);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            existe = true;
            System.out.println("El cliente asociado al usuario '" + nombreUsuario + "' sí existe.");
        } else {
            System.out.println("No se encontró ningún cliente asociado al usuario: " + nombreUsuario);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {
        System.out.println("Error en existeClientePorUsuario: " + e.getMessage());
    }

    return existe;
}
    
   public int RegistrarVenta(int idCliente) {

    int idVenta = -1;

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "INSERT INTO Pventa.Venta (Id_Cliente) " +
            "OUTPUT INSERTED.Id_Venta " +
            "VALUES (?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, idCliente);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            idVenta = rs.getInt("Id_Venta");
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println("Error al registrar venta: "
                + e.getMessage());
    }

    return idVenta;
}
    
    public void RegistrarDetalleVenta(
        int idVenta,
        int idProducto,
        int cantidad,
        double precioUnitario) {

    try {

        Connection con = SQLConexion.conectar();

          String sql =
            "INSERT INTO Pventa.DetalleVenta " +
            "(Id_Venta, Id_Producto, Cantidad, " +
            "Precio_Unitario) " +
            "VALUES (?, ?, ?, ?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idVenta);
        ps.setInt(2, idProducto);
        ps.setInt(3, cantidad);
        ps.setDouble(4, precioUnitario);

        ps.executeUpdate();

        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(e.getMessage());
    }
    
    }
    public void ActualizarMontoTotalVenta(int idVenta) {

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "UPDATE Pventa.Venta " +
            "SET Monto_Total = (" +
            "   SELECT ISNULL(SUM(SubTotal),0) " +
            "   FROM Pventa.DetalleVenta " +
            "   WHERE Id_Venta = ?" +
            ") " +
            "WHERE Id_Venta = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idVenta);
        ps.setInt(2, idVenta);

        ps.executeUpdate();

        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error al actualizar total: "
            + e.getMessage());
    }
    }
    
    public void ActualizarStockVenta(int idVenta) {

    try {

        Connection con = SQLConexion.conectar();

        String sql =
            "UPDATE P " +
            "SET P.Stock_Activo = P.Stock_Activo - DV.Cantidad " +
            "FROM Inventario.Producto P " +
            "INNER JOIN Pventa.DetalleVenta DV " +
            "ON P.Id_Producto = DV.Id_Producto " +
            "WHERE DV.Id_Venta = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idVenta);

        int filas = ps.executeUpdate();

        System.out.println(
                "Stock actualizado. Filas afectadas: "
                + filas);

        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
                "Error al actualizar stock: "
                + e.getMessage());
    }
    }
    
    public ArrayList<MHistorialVenta> ObtenerHistorialCompras(int idCliente) {

    ArrayList<MHistorialVenta> lista =
            new ArrayList<>();
    try {

        Connection con =
                SQLConexion.conectar();

        String sql =
            "SELECT " +
            "V.Id_Venta, " +
            "V.Fecha_Venta AS Fecha, " +
            "V.Monto_Total, " +
            "SUM(DV.Cantidad) AS Cantidad_Total_Productos " +
            "FROM Pventa.Venta V " +
            "INNER JOIN Pventa.DetalleVenta DV " +
            "ON V.Id_Venta = DV.Id_Venta " +
            "WHERE V.Id_Cliente = ? " +
            "GROUP BY " +
            "V.Id_Venta, " +
            "V.Fecha_Venta, " +
            "V.Monto_Total " +
            "ORDER BY V.Fecha_Venta DESC";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, idCliente);

        ResultSet rs =
                ps.executeQuery();

        while (rs.next()) {

            MHistorialVenta h =
                new MHistorialVenta(

                    rs.getInt("Id_Venta"),
                    rs.getString("Fecha"),
                    rs.getDouble("Monto_Total"),
                    rs.getInt(
                        "Cantidad_Total_Productos")
                );

            lista.add(h);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error historial: "
            + e.getMessage());
    }

    return lista;
}
   
}

