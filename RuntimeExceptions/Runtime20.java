/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author farfa
 */
public class Runtime20 {


//DateTimeException 
   public static void main(String[] args) {
      try {
         String dateTimeString = "2023-05-32T15:30:00";
         LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
         System.out.println("Fecha y hora parseadas correctamente: " + String.valueOf(dateTime));
      } catch (DateTimeParseException var3) {
         System.err.println("Error: No se pudo analizar la fecha y hora.");
         System.err.println("  Razon: La cadena de fecha y hora no coincide con el formato esperado.");
         System.err.println("  Mensaje: " + var3.getMessage());
      }

   }
}

   
