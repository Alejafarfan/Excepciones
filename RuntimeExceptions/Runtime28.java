/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime28 {

//IllegalArgumentException 
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - incompatible types: int cannot be converted to java.lang.String");
      } catch (Exception var2) {
         System.err.println("Error: Argumento invalido.");
         System.err.println("  Reason: el elemento no es compatible con la lista");
      }
   }
}
