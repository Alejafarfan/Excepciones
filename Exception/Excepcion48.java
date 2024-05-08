/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

/**
 *
 * @author farfa
 */
public class Excepcion48 {
    //MimeTypeParseException

    public static void main(String[] args) {
        try {
            // Intentamos crear un objeto MimeType con una cadena incorrecta
            String mimeTypeString = "text/html;;charset=UTF-8";
            MimeType mimeType = new MimeType(mimeTypeString);
        } catch (MimeTypeParseException e) {
            // Capturamos la excepción si la cadena no se puede analizar como tipo MIME
            System.err.println("Error al analizar el tipo MIME: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


