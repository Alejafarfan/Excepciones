/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

/**
 *
 * @author farfa
 */
public class Excepcion37 extends Exception {
    
    //InvalidTargetObjectTypeException
    public Excepcion37 (String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new InvalidTargetObjectTypeException("Tipo de objeto de destino invalido");
        } catch (InvalidTargetObjectTypeException e) {
            System.err.println("Ocurrio una excepcion de tipo de objeto de destino invalido: " + e.getMessage());
            e.printStackTrace();
        }
    }
}



