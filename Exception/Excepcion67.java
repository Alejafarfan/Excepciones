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
public class Excepcion67 {
    //TimeoutException

    public static void main(String[] args) {
        // Crear un executor
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        // Crear una tarea que duerme durante un tiempo más largo que el tiempo de espera
        Callable<String> task = () -> {
            Thread.sleep(2000); // Dormir durante 2 segundos
            return "Resultado de la tarea";
        };
        
        try {
            // Ejecutar la tarea y esperar un máximo de 1 segundo
            Future<String> future = executor.submit(task);
            String result = future.get(1, TimeUnit.SECONDS);
            System.out.println("Resultado: " + result);
        } catch (TimeoutException e) {
            // Capturar y manejar la excepción TimeoutException
            System.err.println("La operacion ha excedido el tiempo de espera.");
            e.printStackTrace();
        } catch (InterruptedException | ExecutionException e) {
            // Capturar y manejar otras excepciones posibles
            e.printStackTrace();
        } finally {
            // Apagar el executor
            executor.shutdown();
        }
    }
}
