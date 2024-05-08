/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion5 {
    //AgentLoadException

// Clase principal que utiliza la clase Agent
    public static void main(String[] args) {
        Agent agent = new Agent();
        try {
            agent.load();
            System.out.println("El agente se ha cargado correctamente.");
        } catch (AgentLoadException e) {
            System.err.println("Error al cargar el agente: " + e.getMessage());
        }
    }
}

class AgentLoadException extends Exception {

    public AgentLoadException(String message) {
        super(message);
    }
}

// Clase ficticia Agent que podría lanzar AgentLoadException
class Agent {

    public void load() throws AgentLoadException {
        // Simulamos una situación en la que cargar el agente falla
        boolean agentLoaded = false;
        if (!agentLoaded) {
            throw new AgentLoadException("Error: No se pudo cargar el agente correctamente.");
        }
    }
}

//creamos una clase ficticia Agent que tiene un método load() que intenta cargar un agente. Si la carga falla
//lanzará una AgentLoadException. En la clase principal Main, intentamos cargar el agente y capturamos cualquier 
//AgentLoadException que pueda ser lanzada.

