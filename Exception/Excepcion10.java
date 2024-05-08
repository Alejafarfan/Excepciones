/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.management.BadAttributeValueExpException;

/**
 *
 * @author farfa
 */
public class Excepcion10 {
        public static void main(String[] args) {
        try {
            // Simulamos una situación en la que se crea una expresión de atributo inválida
            String atributoInvalido = "nombreAtributo > 10";

            // Lanzamos la excepción con la expresión de atributo inválida
            throw new BadAttributeValueExpException(atributoInvalido);
        } catch (BadAttributeValueExpException e) {
            // Capturamos y manejamos la excepción
            System.err.println("Error: Expresion de atributo invalida - " + e.getMessage());
        }
    }
}

//En este ejemplo, creamos una expresión de atributo inválida (nombreAtributo > 10) 
//y luego lanzamos una BadAttributeValueExpException con esta expresión. Luego, en el bloque catch,
// capturamos la excepción y manejamos el error mostrando un mensaje que indica que se encontró una expresión de atributo inválida.