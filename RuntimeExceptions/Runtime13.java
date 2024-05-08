/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime13 {

//ClassCastException 
   public static void main(String[] args) {
      try {
         Object obj = "Hola";
         Integer number = (Integer)obj;
         System.out.println("Number: " + number);
      } catch (Exception var3) {
         System.err.println("Error: ClassCastException occurred.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
   
