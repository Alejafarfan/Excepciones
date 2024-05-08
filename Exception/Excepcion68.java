/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
   import java.util.EventListener;
import java.util.TooManyListenersException;

// Interfaz de un listener de evento
interface MyListener extends EventListener {
    void onEvent();
}

// Clase que dispara eventos
class EventSource {
    private MyListener listener;

    // Método para registrar un listener
    public void addListener(MyListener listener) throws TooManyListenersException {
        if (this.listener != null) {
            throw new TooManyListenersException("Solo se permite un unico listener.");
        }
        this.listener = listener;
    }

    // Método para disparar un evento
    public void fireEvent() {
        if (listener != null) {
            listener.onEvent();
        }
    }
}
/**
 *
 * @author farfa
 */
public class Excepcion68 {
 

    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        
        // Intentar agregar más de un listener (esto provocará una TooManyListenersException)
        try {
            eventSource.addListener(() -> System.out.println("Evento recibido"));
            eventSource.addListener(() -> System.out.println("Otro evento recibido")); // Esta línea lanzará una TooManyListenersException
        } catch (TooManyListenersException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Disparar un evento
        eventSource.fireEvent();
    }
}

