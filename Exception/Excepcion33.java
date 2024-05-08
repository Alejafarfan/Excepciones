/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion33 {
    //InvalidApplicationException 
    
    public static void main(String[] args) {
        try {
            // Simulando una aplicación que requiere una configuración válida
            validarConfiguracion("configuracion.txt");
            System.out.println("La configuracion es valida. La aplicacion puede continuar.");
        } catch (InvalidApplicationException e) {
            System.out.println("Error: La configuracion no es valida para la aplicacion.");
            // Aquí podrías agregar más lógica para manejar el error, como registrar el problema o notificar al usuario.
        }
    }

    // Método para validar la configuración de la aplicación
    public static void validarConfiguracion(String archivoConfiguracion) throws InvalidApplicationException {
        // Supongamos que el archivo de configuración no es válido en este caso.
        boolean configuracionValida = false;

        if (!configuracionValida) {
            // Si la configuración no es válida, lanzamos la excepción.
            throw new InvalidApplicationException("La configuracion proporcionada no es valida.");
        }
    }
}

// Definición de la excepción personalizada
class InvalidApplicationException extends Exception {
    public InvalidApplicationException(String message) {
        super(message);
    }
}

