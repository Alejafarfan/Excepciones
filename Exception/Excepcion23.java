/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.ExecutionControlException;
/**
 *
 * @author farfa
 */
public class Excepcion23 {
    //ExecutionControl.ExecutionControlException
        //ExecutionControl.ClassInstallException
        //ExecutionControl.EngineTerminationException
        //ExecutionControl.InternalException
        //ExecutionControl.RunException

   
    public static void main(String[] args) {
        try {
            // Llamada a un método que lanza ExecutionControlException
            methodThatThrowsExecutionControlException();
        } catch (ExecutionControlException e) {
            System.out.println("Se ha lanzado una ExecutionControlException: " + e.getMessage());
            if (e instanceof ExecutionControl.ClassInstallException) {
                System.out.println("Es una ClassInstallException.");
            } else if (e instanceof ExecutionControl.EngineTerminationException) {
                System.out.println("Es una EngineTerminationException.");
            } else if (e instanceof ExecutionControl.InternalException) {
                System.out.println("Es una InternalException.");
            } else if (e instanceof ExecutionControl.RunException) {
                System.out.println("Es una RunException.");
            }
        }
    }

    // Método que lanza una ExecutionControlException
    public static void methodThatThrowsExecutionControlException() throws ExecutionControlException {
        // Aquí se puede lanzar cualquiera de las subclases de ExecutionControlException
        // Por ejemplo, vamos a lanzar una EngineTerminationException
        throw new ExecutionControl.EngineTerminationException("Ha ocurrido una terminacion del motor.");
    }
}

//En este ejemplo, tenemos una clase Main con un método main que llama a un método methodThatThrowsExecutionControlException,
//el cual lanza una instancia de una de las subclases de ExecutionControlException. Luego, en el bloque catch,
//comprobamos el tipo específico de excepción lanzada y mostramos un mensaje correspondiente.