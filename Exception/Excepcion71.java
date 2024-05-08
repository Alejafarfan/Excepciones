/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
    //UnmodifiableClassException
    
    public class Excepcion71 extends Exception {
    public Excepcion71() {
        super();
    }

    public Excepcion71(String message) {
        super(message);
    }

    public Excepcion71(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepcion71(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {
        try {
            // Intentar modificar una clase no modificable
            throw new Excepcion71("No se puede modificar la clase");
        } catch (Excepcion71 e) {
            // Capturar y manejar la excepción Excepcion71
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

