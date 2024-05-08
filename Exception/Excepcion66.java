/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion66 {
   //StringConcatException
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = null;

        // Intentar concatenar una cadena de caracteres con un valor nulo
        String result = str1 + str2;

        System.out.println("Resultado de la concatenacion: " + result);
    }
}


