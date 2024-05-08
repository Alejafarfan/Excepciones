/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import java.security.AccessController;
import java.security.PrivilegedAction;
/**
 *
 * @author farfa
 */
public class Excepcion57 {
    //PrivilegedActionException
    

    public static void main(String[] args) {
        // Ejecutar una acción privilegiada que podría lanzar una excepción
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            // Código que podría lanzar una excepción
            // Simulemos un error aquí lanzando una excepción
            throw new RuntimeException("Error durante la accion privilegiada");
        });
    }
}

