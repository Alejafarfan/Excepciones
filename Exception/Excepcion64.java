/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.rmi.server.ServerNotActiveException;

/**
 *
 * @author farfa
 */
public class Excepcion64 {
    //ServerNotActiveException
    

    public static void main(String[] args) {
        try {
            // Simulamos una operación en un objeto de flujo de entrada/salida que está inactivo
            throw new ServerNotActiveException("El objeto de flujo de entrada/salida no esta activo");
        } catch (ServerNotActiveException e) {
            // Capturamos y manejamos la excepción ServerNotActiveException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

