package Throwable.Exception;
 import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author farfa
 */
public class Excepcion65 {
   //SQLException
    
   
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Establecer la conexión con la base de datos
            String url = "jdbc:mysql://localhost:3306/my_database";
            String username = "usuario";
            String password = "contraseña";
            connection = DriverManager.getConnection(url, username, password);
            
            // Crear una declaración para ejecutar la consulta SQL
            statement = connection.createStatement();
            
            // Ejecutar la consulta SQL
            resultSet = statement.executeQuery("SELECT * FROM users");
            
            // Procesar los resultados de la consulta
            while (resultSet.next()) {
                String Username = resultSet.getString("username");
                String email = resultSet.getString("email");
                System.out.println("Usuario: " + username + ", Email: " + email);
            }
        } catch (SQLException e) {
            // Capturar y manejar la excepción SQLException
            System.err.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cerrar la conexión, la declaración y el conjunto de resultados
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

   
