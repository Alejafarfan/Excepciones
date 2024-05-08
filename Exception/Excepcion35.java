/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.util.prefs.*;
/**
 *
 * @author farfa
 */
public class Excepcion35 {
    //InvalidPreferencesFormatException
    
    
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("com.example");
        
        // Intentamos leer una preferencia que está en un formato incorrecto
        String valor = prefs.get("clave_invalida", "default");
        System.out.println("Valor de la clave 'clave_invalida': " + valor);
    }
    
}
