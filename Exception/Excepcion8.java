/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author farfa
 */
public class Excepcion8 {
//AWTException

    public static void main(String[] args) {
        try {
            // Creamos un robot AWT que controlará la entrada del teclado
            Robot robot = new Robot();

            // Enviamos una combinación de teclas utilizando el robot
            robot.keyPress(KeyEvent.VK_A); // Presiona la tecla 'A'
            robot.keyRelease(KeyEvent.VK_A); // Libera la tecla 'A'

            System.out.println("Combinacion de teclas enviada correctamente.");
        } catch (AWTException e) {
            // Capturamos la excepción si ocurre algún problema con AWT
            System.err.println("Error con AWT: " + e.getMessage());
        }
    }
}

//En este ejemplo, creamos un objeto Robot de AWT que nos permite simular eventos de entrada del usuario, 
//como pulsaciones de teclas y movimientos del ratón. Aquí, intentamos crear un Robot y enviar una combinación de teclas. 
//Si hay algún problema con AWT durante la creación del Robot, se lanzará una AWTException, que capturamos y manejamos adecuadamente.
