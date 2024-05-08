/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author farfa
 */
public class Excepcion21 {
    //FontFormatException
    
    public static void main(String[] args) {
        // Intentamos cargar una fuente desde un archivo
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("customfont.ttf"));
            System.out.println("Fuente cargada exitosamente: " + customFont.getName());
        } catch (FontFormatException e) {
            System.err.println("Se produjo un error de formato de fuente: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Se produjo un error de E/S al cargar la fuente: " + e.getMessage());
        }
    }
}

