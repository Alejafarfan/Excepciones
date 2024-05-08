/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author farfa
 */
public class Excepcion14 {
    //BrokenBarrierException

    public static void main(String[] args) {
        // Creamos una barrera con 3 participantes
        CyclicBarrier barrera = new CyclicBarrier(3);

        // Creamos y ejecutamos los hilos
        Thread hilo1 = new Thread(new Tarea(barrera), "Hilo 1");
        Thread hilo2 = new Thread(new Tarea(barrera), "Hilo 2");
        Thread hilo3 = new Thread(new TareaConExcepcion(barrera), "Hilo 3");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

// Tarea común sin excepción
class Tarea implements Runnable {

    private final CyclicBarrier barrera;

    public Tarea(CyclicBarrier barrera) {
        this.barrera = barrera;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " esperando en la barrera...");
            barrera.await();
            System.out.println(Thread.currentThread().getName() + " continuando despues de la barrera...");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

// Tarea que arroja una excepción
class TareaConExcepcion implements Runnable {

    private final CyclicBarrier barrera;

    public TareaConExcepcion(CyclicBarrier barrera) {
        this.barrera = barrera;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " realizando tarea...");
            // Simulamos una excepción en una de las tareas
            throw new RuntimeException("Excepcion en " + Thread.currentThread().getName());
        } finally {
            // Llegamos a la barrera independientemente de si hubo una excepción
            try {
                barrera.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}

//En este ejemplo, creamos tres hilos. Dos de ellos realizan tareas normales y el tercero lanza una excepción.
//Como resultado, cuando el tercer hilo intenta alcanzar la barrera, arroja una excepción y la barrera se rompe, 
//lo que provoca una BrokenBarrierException. Las otras tareas no pueden continuar esperando indefinidamente en la barrera.
