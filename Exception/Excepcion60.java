/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.util.List;

// Definición de una clase DataCache que representa un caché de datos
class DataCache {

    private List<String> data;

    // Método para actualizar los datos del caché
    public void refresh() throws RefreshFailedException {
        try {
            // Lógica para actualizar los datos (simulada aquí)
            throw new RuntimeException("Error al actualizar los datos");
        } catch (Exception e) {
            // Capturamos cualquier excepción que ocurra durante la actualización y la lanzamos como RefreshFailedException
            throw new RefreshFailedException("Error al actualizar el cache de datos", e);
        }
    }
}

// Definición de una excepción RefreshFailedException
class RefreshFailedException extends Exception {

    public RefreshFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Excepcion60 {
    //RefreshFailedException

    public static void main(String[] args) {
        DataCache cache = new DataCache();

        try {
            // Intentamos actualizar el caché de datos
            cache.refresh();
        } catch (RefreshFailedException e) {
            // Capturamos y manejamos la RefreshFailedException
            System.err.println("Error al actualizar el cache de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
