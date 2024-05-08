/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

import com.sun.jdi.request.DuplicateRequestException;

/**
 *
 * @author farfa
 */
public class Runtime21 {
    
//EmptyStackException 
   public static void main(String[] args) {
      try {
         processRequest("12345");
      } catch (DuplicateRequestException var2) {
         System.err.println("Error: Se detectó una solicitud duplicada.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }

   public static void processRequest(String requestId) throws DuplicateRequestException {
      boolean isDuplicate = checkIfRequestIsDuplicate(requestId);
      if (isDuplicate) {
         throw new DuplicateRequestException("La solicitud con ID " + requestId + " ya ha sido procesada.");
      } else {
         System.out.println("La solicitud con ID " + requestId + " se esta procesando.");
      }
   }

   public static boolean checkIfRequestIsDuplicate(String requestId) {
      return false;
   }
}
