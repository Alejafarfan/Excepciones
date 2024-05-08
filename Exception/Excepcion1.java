/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.util.ArrayList;


/**
 *
 * @author farfa
 */
public class Excepcion1 {
    //AbsentInformationException 
 
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        try {
            if (nombres.isEmpty()) {
                throw new AbsentInformationException("La lista de nombres esta vacia.");
            }
        } catch (AbsentInformationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class AbsentInformationException extends Exception {
    public AbsentInformationException(String message) {
        super(message);
    }
}

//creamos una lista de nombres y luego verificamos si está vacía. Si la lista está vacía, 
//lanzamos la excepción AbsentInformationException con un mensaje indicando que la información está ausente. 

