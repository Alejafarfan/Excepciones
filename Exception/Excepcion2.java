/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion2 {

    public static void main(String[] args) {
//AclNotFoundException 
        try {
            // Simulando un intento de acceder a un recurso protegido que no existe
            String recurso = "archivo.txt";
            verificarAcceso(recurso);
        } catch (AclNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verificarAcceso(String recurso) throws AclNotFoundException {
        // Simulando la búsqueda del recurso protegido
        boolean recursoExiste = false;

        if (!recursoExiste) {
            throw new AclNotFoundException("El recurso protegido '" + recurso + "' no ha sido encontrado.");
        }
    }
}

class AclNotFoundException extends Exception {

    public AclNotFoundException(String message) {
        super(message);
    }
}

//tenemos un método verificarAcceso que simula la verificación de un recurso protegido. Si el recurso no se encuentra, 
//lanzamos la excepción AclNotFoundException con un mensaje indicando que el recurso protegido especificado no ha sido encontrado.
