/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.swing.*;
import javax.swing.text.BadLocationException;

/**
 *
 * @author farfa
 */
public class Excepcion12 {
    //BadLocationException
   

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();

        try {
            // Intentamos insertar texto en una posición inválida
            insertarTexto(textArea, "¡Hola, mundo!", -1);
        } catch (BadLocationException e) {
            System.out.println("Error: Posicion de insercion invalida.");
            e.printStackTrace();
        }

        // Mostrar el contenido del JTextArea después de la inserción de texto
        System.out.println("Contenido del JTextArea:");
        System.out.println(textArea.getText());
    }

    public static void insertarTexto(JTextArea textArea, String texto, int posicion) throws BadLocationException {
        // Verificamos si la posición de inserción es válida
        if (posicion < 0 || posicion > textArea.getDocument().getLength()) {
            throw new BadLocationException("Posicion de insercion invalida: " + posicion, posicion);
        }

        // Insertamos el texto en la posición especificada
        textArea.insert(texto, posicion);
    }
}

//En este ejemplo, estamos intentando insertar texto en una posición de índice -1, lo que es claramente inválido para un JTextArea.
//Esto resultará en una BadLocationException. La excepción se maneja en el bloque catch, donde simplemente imprimimos un mensaje de error.


