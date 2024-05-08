/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
/**
 *
 * @author farfa
 */
public class Runtime1 {
    
//AnnotationTypeMismatchException 
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - incompatible types: java.lang.String cannot be converted to int");
      } catch (Exception var3) {
         System.err.println("Error: Mismatch between annotation type and attribute type.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
