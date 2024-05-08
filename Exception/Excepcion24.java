/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.util.concurrent.*;
/**
 *
 * @author farfa
 */
public class Excepcion24 {
    //ExecutionException
    
  

    public static void main(String[] args) {
        // Creamos un ExecutorService para ejecutar tareas
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Creamos una tarea que lanzará una excepción
        Callable<String> task = () -> {
            // Simulamos una tarea que lanza una excepción
            throw new RuntimeException("Ocurrio un error durante la ejecucion de la tarea.");
        };

        // Ejecutamos la tarea y capturamos cualquier excepción lanzada
        try {
            Future<String> future = executor.submit(task);
            String result = future.get();
            System.out.println("Resultado de la tarea: " + result);
        } catch (InterruptedException e) {
            System.err.println("La ejecucion de la tarea fue interrumpida.");
        } catch (ExecutionException e) {
            System.err.println("Se produjo una excepcion durante la ejecucion de la tarea: " + e.getMessage());
        }

        // Detenemos el ExecutorService
        executor.shutdown();
    }
}
//En este ejemplo, creamos un ExecutorService para ejecutar tareas. Definimos una tarea (Callable) que simula lanzar una excepción
//durante su ejecución. Luego, ejecutamos esta tarea usando executor.submit(task) y capturamos cualquier excepción lanzada utilizando 
//un bloque try-catch. Si se lanza una ExecutionException



