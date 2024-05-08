/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import javax.naming.Context;
import javax.naming.InitialContext;
/**
 *
 * @author farfa
 */
public class Excepcion49 {
    //NamingException


   public static void main(String[] args) {
      try {
         Context initialContext = new InitialContext();
         Object var2 = initialContext.lookup("java:comp/env/dataSource");
      } catch (Exception var3) {
         System.err.println("Error: Naming service lookup failed.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}

