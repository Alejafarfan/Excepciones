/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion72 {
    //UnmodifiableClassException

    public static class UnmodifiableClassException extends Exception {
        public UnmodifiableClassException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Simulación de un intento de modificación de una clase no modificable
            throw new UnmodifiableClassException("No se puede modificar esta clase");
        } catch (UnmodifiableClassException e) {
            // Capturar y manejar la excepción UnmodifiableClassException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

