/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author farfa
 */
public class Excepcion76 {
    //UnsupportedLookAndFeelException
   
    public static void main(String[] args) {
        try {
            // Simulación de una operación que lanza UnsupportedLookAndFeelException
            throw new UnsupportedLookAndFeelException("El aspecto visual no es compatible");
        } catch (UnsupportedLookAndFeelException e) {
            // Manejo de la excepción UnsupportedLookAndFeelException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

