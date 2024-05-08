/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author farfa
 */
public class Excepcion78 {
    //URISyntaxException
    
    public static void main(String[] args) {
        try {
            // Intentamos crear una instancia de URI con una cadena que no es una URI válida
            URI uri = new URI("not_a_valid_uri");
        } catch (URISyntaxException e) {
            // Capturamos y manejamos la URISyntaxException
            System.err.println("Error al crear la URI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


