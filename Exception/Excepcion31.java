/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion31 {
    //InterruptedException
    
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                // Simulamos una tarea que toma tiempo
                Thread.sleep(5000); // Espera por 5 segundos
            } catch (InterruptedException e) {
                // Si el hilo es interrumpido mientras duerme, lanzará InterruptedException
                System.out.println("El hilo fue interrumpido mientras dormia.");
                e.printStackTrace();
            }
        });

        // Comenzamos el hilo
        myThread.start();

        // Después de iniciar el hilo, lo interrumpimos después de 2 segundos
        try {
            Thread.sleep(2000); // Esperamos 2 segundos
            myThread.interrupt(); // Interrumpimos el hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    
