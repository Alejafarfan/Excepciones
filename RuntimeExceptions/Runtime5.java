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
public class Runtime5 {
    
    //BufferUnderflowException 
   public static void main(String[] args) {
      try {
         ByteBuffer buffer = ByteBuffer.allocate(16);
         buffer.putInt(123);
         buffer.putInt(456);

         for(int i = 0; i < 3; ++i) {
            System.out.println(buffer.getInt());
         }
      } catch (java.nio.BufferUnderflowException var3) {
         System.err.println("Error: Intento de leer mas datos de los que el buffer contiene.");
         System.err.println("  Razon: " + var3.getMessage());
      }

   }
}
