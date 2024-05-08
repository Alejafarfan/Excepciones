/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

//TransformException
/**
 *
 * @author farfa
 */
public class Excepcion70 {
    public static class TransformException extends Exception {
        public TransformException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Lanzar una TransformException con un mensaje descriptivo
            throw new TransformException("Error durante la transformacion de datos");
        } catch (TransformException e) {
            // Capturar y manejar la excepción TransformException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


    
