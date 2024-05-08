/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
    import java.nio.ByteBuffer;
/**
 *
 * @author farfa
 */
public class Runtime4 {


//BufferOverflowException 
   public static void main(String[] args) {
      try {
         ByteBuffer var1 = ByteBuffer.allocate(5);
      } catch (java.nio.BufferOverflowException var2) {
         System.err.println("Error: Intento de escribir más datos de los que el buffer puede contener.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
