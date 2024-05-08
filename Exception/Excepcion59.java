/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.lang.reflect.Method;

/**
 *
 * @author farfa
 */
public class Excepcion59 {
    //ReflectiveOperationException

    public static void main(String[] args) {
        try {
            // Obtener una referencia al método 'toUpperCase' de la clase String
            Method toUpperCaseMethod = String.class.getMethod("nonExistentMethod");

            // Invocar el método 'toUpperCase' en una cadena
            String result = (String) toUpperCaseMethod.invoke("hello");

            // Imprimir el resultado
            System.out.println("Resultado de toUpperCase: " + result);
        } catch (ReflectiveOperationException e) {
            // Capturar y manejar cualquier excepción relacionada con la reflexión
            System.err.println("Error durante la operacion de reflexion: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
