/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion61 {
  //RuntimeException
    public static void main(String[] args) {
        try {
            // Intentamos realizar una división por cero, lo cual resultará en una RuntimeException
            int result = divide(10, 0);
            System.out.println("Resultado: " + result);
        } catch (RuntimeException e) {
            // Capturamos y manejamos la excepción RuntimeException
            System.err.println("Error durante la ejecucion: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static int divide(int dividend, int divisor) {
        // Intentamos realizar la división
        return dividend / divisor;
    }
}

