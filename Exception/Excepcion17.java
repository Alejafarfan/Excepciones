/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion17 {
    //ClassNotLoadedException
    
    public static void main(String[] args) {
        try {
            // Intentamos cargar una clase que no existe
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: La clase no pudo ser encontrada.");
            e.printStackTrace();
        }
    }    
}

//En este ejemplo, estamos intentando cargar la clase "ClaseInexistente", que obviamente no existe.
//Como resultado, se lanzará una excepción ClassNotFoundException. El bloque catch captura esta excepción
//y muestra un mensaje de error junto con la traza de la pila para ayudar en la depuración.
