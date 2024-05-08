/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import javax.print.PrintException;

/**
 *
 * @author farfa
 */
public class Excepcion56 {
    //PrintException
 
    public static void main(String[] args) {
        try {
            // Intentar realizar una operación relacionada con la impresión
            simulatePrinting();
        } catch (PrintException e) {
            // Capturar la excepción PrintException
            System.err.println("Error al imprimir: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void simulatePrinting() throws PrintException {
        // Simular una excepción durante el proceso de impresión
        throw new PrintException("Error al imprimir: impresora no disponible");
    }
}
