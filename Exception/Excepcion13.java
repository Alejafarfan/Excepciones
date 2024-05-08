/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion13 {
    //BadStringOperationException
 
    public static void main(String[] args) {
        try {
            String nombreCompleto = concatenarNombres("John", "Doe123");
            System.out.println("Nombre completo: " + nombreCompleto);
        } catch (BadStringOperationException e) {
            System.out.println("Error: Operacion de cadena no valida.");
            e.printStackTrace();
        }
    }

    public static String concatenarNombres(String nombre1, String nombre2) throws BadStringOperationException {
        // Verificamos si los nombres contienen caracteres no permitidos
        if (!nombre1.matches("[a-zA-Z]+") || !nombre2.matches("[a-zA-Z]+")) {
            throw new BadStringOperationException("Nombres contienen caracteres no validos.");
        }

        // Concatenamos los nombres
        return nombre1 + " " + nombre2;
    }
}

class BadStringOperationException extends Exception {
    public BadStringOperationException(String message) {
        super(message);
    }
}

//En este ejemplo, estamos intentando concatenar los nombres "John" y "Doe123". Sin embargo, 
//el segundo nombre contiene caracteres no permitidos (números),
//por lo que lanzaremos una excepción BadStringOperationException.
