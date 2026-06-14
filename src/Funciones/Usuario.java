/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import Conexion.SQLConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.sql.ResultSet;
import Modelo.MPerfil;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author cris
 */
public class Usuario {
    
   public boolean AutenticacionUsuario(String nombreUsuario){

    Connection con = SQLConexion.conectar();

    String sql = "SELECT COUNT(*) FROM Personas.Usuarios WHERE Nombre_Usuario = ?";

    try(con;
        PreparedStatement ps = con.prepareStatement(sql)){

        ps.setString(1, nombreUsuario);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int cantidad = rs.getInt(1);
            System.out.println("Coincidencias: " + cantidad);
            return cantidad > 0;
        }
    }catch(SQLException e){
        System.out.println("Error: " + e.getMessage());
    }

    return false;
    }
   
   
   public boolean AutenticacionContraseña(String contraseña){

    Connection con = SQLConexion.conectar();

    String sql = "SELECT COUNT(*) FROM Personas.Usuarios WHERE Contraseña = ?";

    try(con;
        PreparedStatement ps = con.prepareStatement(sql)){
        ps.setString(1, contraseña);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int cantidad = rs.getInt(1);
            System.out.println("Coincidencias: " + cantidad);
            return cantidad > 0;
        }

    }catch(SQLException e){

        System.out.println("Error: " + e.getMessage());
    }

    return false;
    }
    

   public boolean RegistraUsuario(String nameUsuario,String nombres,String apellidos,String correo,int telefono,String contrasena) {

    Connection con = SQLConexion.conectar();
    String sqlDatosPersonales =
            "INSERT INTO Personas.DatosPersonales "
            + "(Nombres, Apellidos, Correo, Telefono) "
            + "VALUES (?, ?, ?, ?)";

    String sqlUsuarios =
            "INSERT INTO Personas.Usuarios "
            + "(Nombre_Usuario, Contraseña, Id_Rol, Id_DatosPersonales) "
            + "VALUES (?, ?, ?, ?)";

    int RolPorDefecto = 13; // rol Almacenero --> ID :13

    try {
        
        //  DATOS PERSONALES
        PreparedStatement ps = con.prepareStatement(
                sqlDatosPersonales,
                Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, nombres);
        ps.setString(2, apellidos);
        ps.setString(3, correo);
        ps.setInt(4, telefono);

        ps.executeUpdate();

        // OBTENER EL ID GENERADO
        ResultSet rs = ps.getGeneratedKeys();

        int idDatosPersonales = 0;

        if (rs.next()) {

            idDatosPersonales = rs.getInt(1);
        }

        //  USUARIO
        PreparedStatement ps1 =
                con.prepareStatement(sqlUsuarios);

        ps1.setString(1, nameUsuario);
        ps1.setString(2, contrasena);
        ps1.setInt(3, RolPorDefecto);
        ps1.setInt(4, idDatosPersonales);

        int filas = ps1.executeUpdate();

        return filas > 0;

    } catch (SQLException e) {

        System.out.println(
                "Error al registrar: "
                + e.getMessage());
    }

    return false;
}
 
   public String ObtenerRol(String nombreUsuario) {

    String rol = "";

    try {

        Connection con = SQLConexion.conectar();

         String sql =
            "SELECT R.Nombre_Rol " +
            "FROM Personas.Usuarios U " +
            "INNER JOIN Personas.Roles R " +
            "ON U.Id_Rol = R.Id_Rol " +
            "WHERE U.Nombre_Usuario = ?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, nombreUsuario);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            rol = rs.getString("Nombre_Rol");
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
                "Error al obtener rol: "
                + e.getMessage());
    }

    return rol;
}
   
   public ArrayList<MPerfil> ObtenerPerfil(String NombreUsuario){
       ArrayList<MPerfil> Perfil = new ArrayList<>();
       try {

        Connection con =
                SQLConexion.conectar();

        String sql = "select U.Id_Usuario, " +
                     "R.Nombre_Rol, " +
                     "DP.Fecha_Registro, " +
                     "U.Nombre_Usuario, " +
                     "DP.Nombres, " +
                     "DP.Apellidos, " +
                     "DP.Correo, " +
                     "DP.Telefono "+
                     "from Personas.Usuarios U "+
                     "inner join Personas.Roles R "+
                     "on U.Id_Rol = R.Id_Rol "+
                     "inner join Personas.DatosPersonales DP "+
                     "on U.Id_DatosPersonales = DP.Id_DatosPersonales "+
                     "where U.Nombre_Usuario = ? ";
        
        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, NombreUsuario);

        ResultSet rs =
                ps.executeQuery();

        while (rs.next()) {

            MPerfil p =
                new MPerfil(

                    rs.getInt("Id_Usuario"),
                    rs.getString("Nombre_Rol"),
                    rs.getString("Fecha_Registro"),
                    rs.getString("Nombre_Usuario"),
                    rs.getString("Nombres"),
                    rs.getString("Apellidos"),
                    rs.getString("Correo"),
                    rs.getInt("Telefono")
                );

            Perfil.add(p);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
            "Error el obtener perfil: "
            + e.getMessage());
    }

    return Perfil;
   
   }
  
}
   

