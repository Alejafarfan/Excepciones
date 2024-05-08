/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import java.io.IOException;

/**
 *
 * @author farfa
 */
public class Excepcion73 {
   
    //UnsupportedAudioFileException
    
    public static class UnsupportedAudioFileException extends IOException {
        public UnsupportedAudioFileException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            // Simulación de intento de leer un archivo de audio con un formato no compatible
            throw new UnsupportedAudioFileException("Formato de archivo de audio no compatible");
        } catch (UnsupportedAudioFileException e) {
            // Captura y maneja la excepción UnsupportedAudioFileException
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

