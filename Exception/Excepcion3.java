/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion3 {
    //ActivationException
    //UnknownGroupException, UnknownObjectException

    public static void main(String[] args) {
        try {
            // Simulando una activación que produce una excepción
            activarRecurso("grupo1", "objeto1");
        } catch (ActivationException e) {
            System.out.println("Error de activación: " + e.getMessage());
        }
    }

    public static void activarRecurso(String grupo, String objeto) throws ActivationException {
        // Simulando la activación de un recurso en un grupo específico
        boolean grupoExistente = true; 
        boolean objetoExistente = false; 

        if (!grupoExistente) {
            throw new UnknownGroupException("El grupo '" + grupo + "' es desconocido.");
        }

        if (!objetoExistente) {
            throw new UnknownObjectException("El objeto '" + objeto + "' es desconocido en el grupo '" + grupo + "'.");
        }

        // Lógica para activar el recurso
    }
}

class ActivationException extends Exception {

    public ActivationException(String message) {
        super(message);
    }
}

class UnknownGroupException extends ActivationException {

    public UnknownGroupException(String message) {
        super(message);
    }
}

class UnknownObjectException extends ActivationException {

    public UnknownObjectException(String message) {
        super(message);
    }

}
//El método activarRecurso simula la activación de un recurso en un grupo específico y 
//lanza las excepciones correspondientes según la situación.
// En el bloque catch, capturamos ActivationException para manejar cualquier error durante la activación del recurso.