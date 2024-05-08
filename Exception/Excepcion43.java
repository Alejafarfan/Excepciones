/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */ 
@FunctionalInterface
interface OperacionUnica {
    int calcular(int a);
}
public class Excepcion43 {
    //LambdaConversionException
    
    public static void main(String[] args) {
        // Intentamos usar una expresión lambda que espera dos argumentos
        // en una interfaz funcional que espera solo uno.
        OperacionUnica operacionUnica = a -> a * 2;
        
        // Esto lanzará una LambdaConversionException porque la expresión lambda
        // espera un argumento, pero la interfaz funcional espera dos.
        System.out.println("El resultado es: " + operacionUnica.calcular(5));
    }
}

