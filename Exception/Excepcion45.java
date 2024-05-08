/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.sound.sampled.*;
/**
 *
 * @author farfa
 */
public class Excepcion45 {
    

    public static void main(String[] args) {
        try {
            // Intentamos obtener una línea de audio para reproducir sonido
            AudioFormat formatoAudio = new AudioFormat(44100, 16, 2, true, true);
            
            // Provocamos deliberadamente un error en el formato de audio
            // El formato especificado no es compatible o no está soportado
            // Esto debería lanzar una LineUnavailableException
            SourceDataLine lineaDeAudio = AudioSystem.getSourceDataLine(formatoAudio);
        } catch (LineUnavailableException e) {
            // Capturamos la excepción LineUnavailableException
            System.out.println("¡Error! La línea de audio no está disponible.");
            e.printStackTrace();
            // Imprimimos un mensaje adicional
            System.out.println("Por favor, asegúrate de que no haya otros programas utilizando la línea de audio.");
        } finally {
            // Imprimimos un mensaje después del bloque try-catch
            System.out.println("El programa ha terminado.");
        }
    }
}
