/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime26 {
  //IllegalCallerException 
   public static void main(String[] args) {
      illegalMethodCall();
   }

   public static void illegalMethodCall() {
      try {
         if (!Thread.currentThread().getStackTrace()[2].getMethodName().equals("main")) {
            throw new RuntimeException("Esta llamada no está permitida en este contexto.");
         }
      } catch (Exception var1) {
         System.err.println("Error: Llamada ilegal al método.");
         System.err.println("  Razón: " + var1.getMessage());
      }

   }
}

