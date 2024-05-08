/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion26 {
    //GeneralSecurityException
    
       public static void main(String[] args) {
      try {
         throw new java.security.GeneralSecurityException("Error de seguridad general");
      } catch (Exception var2) {
         System.err.println("Ocurrio un error de seguridad: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
