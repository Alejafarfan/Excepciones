/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import com.sun.tools.attach.AttachNotSupportedException;
/**
 *
 * @author farfa
 */
public class Excepcion7 {
    
    //AttachNotSupportedException
    public static void main(String[] args) {
        try {
            // Intentamos adjuntar a la máquina virtual en ejecución
            attachToVM();
        } catch (AttachNotSupportedException e) {
            // Capturamos la excepción si adjuntar no está soportado
            System.err.println("Error al intentar adjuntar a la VM: " + e.getMessage());
        }
    }

    public static void attachToVM() throws AttachNotSupportedException {
        // Simulamos la situación en la que intentamos adjuntar a una VM pero no es soportado
        throw new AttachNotSupportedException("Adjuntar a la VM no esta soportado.");
    }
}

//la función attachToVM() simula el intento de adjuntar a una máquina virtual en ejecución. Sin embargo, 
//en este caso, lanzamos directamente una AttachNotSupportedException para indicar que la operación de adjuntar no está soportada. 