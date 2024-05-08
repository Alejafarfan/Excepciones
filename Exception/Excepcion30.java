/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import com.sun.jdi.IncompatibleThreadStateException;

/**
 *
 * @author farfa
 */
public class Excepcion30 {
    
    //IncompatibleThreadStateException 
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            // Haciendo alguna tarea
            try {
                Thread.sleep(1000); // Simulando una tarea que toma tiempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Comenzamos el hilo
        myThread.start();

        // Intentamos pausar el hilo, pero si ya está pausado, lanzará la excepción
        myThread.suspend();
    }
}

 
