/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.awt.datatransfer.DataFlavor;
/**
 *
 * @author farfa
 */
public class Excepcion75 {
    //UnsupportedFlavorException
    

    public static class UnsupportedFlavorException extends Exception {
        public UnsupportedFlavorException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Simulación de una operación que lanza UnsupportedFlavorException
            throw new UnsupportedFlavorException("Tipo de formato no soportado");
        } catch (UnsupportedFlavorException e) {
            // Manejo de la excepción UnsupportedFlavorException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

