/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

import java.lang.module.FindException;

/**
 *
 * @author farfa
 */
public class Runtime24 {

//FindException
    public static void main(String[] args) {
        try {
            // Simulación de un posible lanzamiento de FindException
            throw new FindException("No se encontró el elemento buscado.");
        } catch (FindException e) {
            // Manejo de la excepción FindException
            System.err.println("Se ha producido una FindException:");
            e.printStackTrace();
            // Puedes agregar aquí el código para recuperarse o manejar la excepción de otra manera
        } catch (RuntimeException e) {
            // Manejo de otras excepciones de tiempo de ejecución
            System.err.println("Se ha producido una excepción de tiempo de ejecución:");
            e.printStackTrace();
            // Puedes agregar aquí el código para recuperarse o manejar la excepción de otra manera
        }
    }
}

