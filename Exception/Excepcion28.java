/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 *
 * @author farfa
 */
public class Excepcion28 {

    //IllegalClassFormatException
    
    
 public static void main(String[] args) {
        // Creamos una instancia de una clase que implementa ClassFileTransformer
        ClassFileTransformer transformer = new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                // Simulamos una transformación inválida lanzando IllegalClassFormatException
                throw new IllegalClassFormatException("Transformacion de clase no permitida");
            }
        };

        // Intentamos aplicar la transformación de clase
        try {
            // Simulamos la aplicación de la transformación a una clase
            transformer.transform(null, "MiClase", null, null, new byte[0]);
        } catch (IllegalClassFormatException e) {
            System.err.println("Se produjo un error de formato de clase: " + e.getMessage());
        }
    }
}
