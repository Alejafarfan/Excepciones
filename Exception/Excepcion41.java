/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
/**
 *
 * @author farfa
 */
public class Excepcion41 {

    //JShellException
    
    public static void main(String[] args) {
        // Crear una instancia de JShell
        JShell jshell = JShell.create();
        
        // Ejecutar un fragmento de código que producirá un error
        jshell.eval("int x = ;");
        
        // Obtener los eventos relacionados con la ejecución de los fragmentos de código
        for (SnippetEvent event : jshell.events().toArray(SnippetEvent[]::new)) {
            // Verificar si el evento es un error
            if (event.status() == SnippetEvent.Status.REJECTED) {
                // Obtener la excepción asociada con el evento
                Throwable exception = event.exception();
                // Imprimir información sobre la excepción
                System.err.println("Error durante la ejecución de JShell: " + exception.getMessage());
                exception.printStackTrace();
            }
        }
    }
}
   
