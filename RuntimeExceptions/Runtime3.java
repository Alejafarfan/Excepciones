/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime3 {
    
   //ArrayStoreException
   public static void main(String[] args) {
      try {
         Object[] array = new Integer[5];
         array[0] = "Hello";
      } catch (Exception var2) {
         System.err.println("Error: Intento de almacenar un tipo de dato incorrecto en el arreglo.");
         System.err.println("  Razon: " + var2.getMessage());
      }

   }
}
