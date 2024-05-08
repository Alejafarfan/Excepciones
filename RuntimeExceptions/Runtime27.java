/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime27 {
     //IllegalMonitorStateException 
   private static final Object lock = new Object();

   public static void main(String[] args) {
      try {
         synchronized(lock) {
            System.out.println("Dentro del bloque sincronizado...");
         }

         lock.notify();
      } catch (Exception var4) {
         System.err.println("Error: Intentando acceder a un monitor sin poseer el bloqueo.");
         var4.printStackTrace();
      }

   }
}  
