/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime2 {
  //ArithmeticException 
   public static void main(String[] args) {
      try {
         int result = divide(10, 0);
         System.out.println("Result: " + result);
      } catch (Exception var2) {
         System.err.println("Error: Division by zero.");
         System.err.println("  Reason: " + var2.getMessage());
      }

   }

   public static int divide(int dividend, int divisor) {
      return dividend / divisor;
   }
}
   
