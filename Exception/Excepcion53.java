/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author farfa
 */
public class Excepcion53 {


    public static void main(String[] args) {
        String dateString = "2022-30-30"; // Cadena que esperamos sea una fecha en formato yyyy-MM-dd
        
        try {
            // Intentar analizar la cadena como una fecha
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); // Hacer que el análisis sea estricto
            dateFormat.parse(dateString);
            System.out.println("La cadena es una fecha válida.");
        } catch (ParseException e) {
            // Capturar la excepción ParseException si la cadena no es una fecha válida
            System.err.println("Error al analizar la cadena como fecha: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

