/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion11 {
    
    //BadBinaryOpValueExpException
    
      public static void main(String[] args) {
        // Supongamos que recibimos los números y la operación desde algún lugar
        double num1 = 10;
        double num2 = 5;
        String operacion = ""; // Esto es incorrecto, debería ser "+", "-", "*", "/"

        try {
            double resultado = realizarOperacion(num1, num2, operacion);
            System.out.println("El resultado de la operacion es: " + resultado);
        } catch (BadBinaryOpValueExpException e) {
            System.out.println("Error: La operacion proporcionada no es valida.");
        }
    }

    public static double realizarOperacion(double num1, double num2, String operacion) throws BadBinaryOpValueExpException {
        switch (operacion) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new BadBinaryOpValueExpException("Operación no válida: " + operacion);
        }
    }
}

class BadBinaryOpValueExpException extends Exception {
    public BadBinaryOpValueExpException(String message) {
        super(message);
    }
}

//En este ejemplo, si la operación proporcionada es una cadena vacía o cualquier otra cadena que no sea un operador válido (+, -, *, /),
//se lanzará la excepción BadBinaryOpValueExpException.
   
