/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;




public class Excepcion51 {
 
    public static void main(String[] args) {
        try {
            // Crear el contexto inicial
            Context context = new InitialContext();
            
            // Intentar buscar un objeto que no está vinculado en el contexto
            Object obj = context.lookup("NotBoundObject");
            
            // Si llegamos hasta aquí, significa que el objeto fue encontrado
            System.out.println("Objeto encontrado: " + obj);
        } catch (NamingException e) {
            // Capturar la excepción NotBoundException
            System.err.println("El objeto no está vinculado en el contexto.");
            e.printStackTrace();
        }
    }
}

