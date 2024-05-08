/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime12 {
   //CatalogException 
   public static void main(String[] args) {
      try {
         throw new javax.xml.catalog.CatalogException("Error de catalogo: no se puede procesar el catalogo XML");
      } catch (javax.xml.catalog.CatalogException var2) {
         System.err.println("Error: Excepcion en el catalogo XML.");
         System.err.println("  Razon: " + var2.getMessage());
      }
   }
}
