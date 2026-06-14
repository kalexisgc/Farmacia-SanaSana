/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cris
 */
public class SQLConexion {
    // URL de SQL Server
    private static final String URL =
        "jdbc:sqlserver://localhost:1433;databaseName=FarmaciaSanaSana;encrypt=true;trustServerCertificate=true";

    // Usuario SQL
    private static final String USER = "javauser";

    // Contraseña SQL
    private static final String PASSWORD = "123456";

    // Método de conexión
    public static Connection conectar() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexion exitosa");

        } catch (SQLException e) {
            

            System.out.println("Error de conexion: " + e.getMessage());

        }

        return con;
    }
}
