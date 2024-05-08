/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import javax.sound.midi.InvalidMidiDataException;
/**
 *
 * @author farfa
 */
public class Excepcion34 {
    //InvalidMidiDataException
   
    public static void main(String[] args) {
        try {
            reproducirMidi("cancion.mid");
            System.out.println("La canción se ha reproducido correctamente.");
        } catch (InvalidMidiDataException e) {
            System.out.println("Error: Los datos MIDI no son validos.");
            // Aquí podrías agregar más lógica para manejar el error, como registrar el problema o notificar al usuario.
        }
    }

    // Método para reproducir un archivo MIDI
    public static void reproducirMidi(String archivoMidi) throws InvalidMidiDataException {
        // Supongamos que intentamos reproducir un archivo MIDI que contiene datos no válidos
        boolean datosMidiValidos = false;

        if (!datosMidiValidos) {
            // Si los datos MIDI no son válidos, lanzamos la excepción.
            throw new InvalidMidiDataException("Los datos MIDI proporcionados no son validos.");
        }

        // Si los datos son válidos, aquí iría la lógica para reproducir el archivo MIDI.
    }
}

