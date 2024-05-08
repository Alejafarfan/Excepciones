/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion79 {
 
    public static void main(String[] args) {
        try {
            // Intentamos iniciar la máquina virtual Java
            startJavaVM();
        } catch (VMStartException e) {
            // Capturamos y manejamos la excepción VMStartException
            System.err.println("Error al iniciar la VM: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void startJavaVM() throws VMStartException {
        // Simulamos un error al iniciar la máquina virtual
        throw new VMStartException("No se puede iniciar la VM");
    }
}

class VMStartException extends Exception {
    public VMStartException(String message) {
        super(message);
    }
}

