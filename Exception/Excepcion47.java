/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import javax.sound.midi.*;
/**
 *
 * @author farfa
 */
public class Excepcion47 {
    //MidiUnavailableException 
    
 

    public static void main(String[] args) {
        try {
            // Intentamos abrir un secuenciador MIDI
            Sequencer sequencer = MidiSystem.getSequencer();
            
            // Simulamos que el secuenciador no está disponible
            throw new MidiUnavailableException("El secuenciador MIDI no esta disponible.");
        } catch (MidiUnavailableException e) {
            // Capturamos la excepción si el dispositivo MIDI no está disponible
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

