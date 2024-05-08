/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
   import javax.security.auth.callback.*;
/**
 *
 * @author farfa
 */
public class Excepcion74 {
    //UnsupportedCallbackException
    
    public static class UnsupportedCallbackException extends Exception {
        public UnsupportedCallbackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Simulación de una operación que lanza UnsupportedCallbackException
            throw new UnsupportedCallbackException("Tipo de callback no soportado");
        } catch (UnsupportedCallbackException e) {
            // Manejo de la excepción UnsupportedCallbackException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

