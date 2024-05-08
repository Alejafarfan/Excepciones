/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import com.sun.tools.attach.AgentInitializationException;
import java.lang.instrument.*;
/**
 *
 * @author farfa
 */
public class Excepcion4 {
    
    public static void main(String[] args) {
        
        //AgentInitializationException
        try {
            inicializarAgente();
        } catch (AgentInitializationException e) {
            System.out.println("Error al inicializar el agente: " + e.getMessage());
        }
    }

    public static void inicializarAgente() throws AgentInitializationException {
        // Simulando la inicialización de un agente
        boolean falloInicializacion = true; // Simulación de un fallo en la inicialización del agente

        if (falloInicializacion) {
            throw new AgentInitializationException("Error en la inicializacion del agente.");
        }
    }
}

//Simula la inicialización de un agente y maneja cualquier error que ocurra durante este proceso. Si hay un fallo en la inicialización, 
//se lanza la excepción `AgentInitializationException`, la cual es capturada en el método `main` para imprimir un mensaje de error.

