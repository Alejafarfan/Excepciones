/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 *
 * @author farfa
 */
public class Excepcion38 {
    //InvocationException 
  
    public static void main(String[] args) {
        try {
            // Creamos una instancia de la clase MyClass
            MyClass myObject = new MyClass();

            // Obtenemos el método "methodThatThrows" utilizando reflexión
            Method method = MyClass.class.getMethod("methodThatThrows");

            // Invocamos el método que sabemos que lanzará una excepción
            method.invoke(myObject);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            // Capturamos la InvocationException y la imprimimos
            System.out.println("Se ha producido una InvocationException: " + e.getMessage());
        }
    }
}

class MyClass {
    // Un método que lanza una excepción
    public void methodThatThrows() {
        throw new RuntimeException("¡Este método lanza una excepción!");
    }
}

