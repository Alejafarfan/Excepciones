/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
/**
 *
 * @author farfa
 */
public class Excepcion22 {
    //DestroyFailedException
    
    public static void main(String[] args) {
        try {
            crearObjetoNoDestruible();
        } catch (DestroyFailedException e) {
            System.out.println("Error: No se pudo destruir el objeto correctamente.");
            e.printStackTrace();
        }
    }

    public static void crearObjetoNoDestruible() throws DestroyFailedException {
        // Simulamos un objeto que no se puede destruir correctamente
        // En este caso, simplemente lanzamos una excepción al intentar destruirlo
        Object objeto = new Object();

        // Intentamos destruir el objeto (simulado)
        if (!destruirObjeto(objeto)) {
            throw new DestroyFailedException("No se pudo destruir el objeto correctamente.");
        }
    }

    public static boolean destruirObjeto(Object objeto) {
        // Simulamos un intento de destruir el objeto
        // En este caso, simplemente devolvemos false para simular que no se puede destruir
        return false;
    }
}

class DestroyFailedException extends Exception {
    public DestroyFailedException(String message) {
        super(message);
    }
}

//Este código simula un objeto que no se puede destruir correctamente al intentar llamar a un método ficticio destruirObjeto().
//Siempre devuelve false para simular que no se puede destruir el objeto correctamente. 
//Cuando se intenta destruir el objeto en el método crearObjetoNoDestruible(), se lanza una excepción DestroyFailedException.