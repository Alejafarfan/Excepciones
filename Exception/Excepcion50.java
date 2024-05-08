/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
/**
 *
 * @author farfa
 */
public class Excepcion50 {
    //NoninvertibleTransformException
    
    public static void main(String[] args) {
        // Creamos una transformación afín
        AffineTransform transform = new AffineTransform();
        
        // Rotamos la transformación en 90 grados
        transform.rotate(Math.PI / 2);
        
        try {
            // Intentamos obtener la inversa de la transformación
            AffineTransform inverseTransform = transform.createInverse();
            System.out.println("Transformacion inversa: " + inverseTransform);
        } catch (NoninvertibleTransformException e) {
            // Capturamos la excepción si la transformación no es invertible
            System.err.println("La transformacion no es invertible: " + e.getMessage());
        }
    }
}

