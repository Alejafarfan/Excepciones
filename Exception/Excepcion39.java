/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author farfa
 */
public class Excepcion39 {
    //IOException
    
   public static void main(String[] args) {
      try {
         BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));

         String linea;
         while((linea = reader.readLine()) != null) {
            System.out.println(linea);
         }

         reader.close();
      } catch (Exception var3) {
         System.err.println("Ocurrio un error de entrada/salida: " + var3.getMessage());
         var3.printStackTrace();
      }

   }
}
