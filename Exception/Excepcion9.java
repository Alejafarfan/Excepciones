/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import java.util.prefs.*;
/**
 *
 * @author farfa
 */
public class Excepcion9 {
//BackingStoreException 
    public static void main(String[] args) {
        try {
            // Obtenemos el nodo de preferencias para la aplicación
            Preferences prefs = Preferences.userRoot().node("miaplicacion");

            // Guardamos una preferencia
            prefs.put("idioma", "español");

            // Intentamos sincronizar las preferencias con el almacenamiento persistente
            prefs.sync();

            System.out.println("Preferencia guardada correctamente.");
        } catch (BackingStoreException e) {
            // Capturamos la excepción si ocurre algún problema con el almacenamiento persistente
            System.err.println("Error en el almacenamiento persistente: " + e.getMessage());
        }
    }

}

//intentamos guardar una preferencia utilizando la API de preferencias de Java. Después de guardar la preferencia, 
//intentamos sincronizar las preferencias con el almacenamiento persistente mediante el método sync(). 
//Si ocurre algún problema durante la sincronización con el almacenamiento persistente, como un fallo de E/S, 
//se lanzará una BackingStoreException, que capturamos y manejamos adecuadamente.

