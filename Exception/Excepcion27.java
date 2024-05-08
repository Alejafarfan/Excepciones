/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import org.ietf.jgss.*;
/**
 *
 * @author farfa
 */
public class Excepcion27 {
   //GSSException
    
 public static void main(String[] args) {
        // Intentamos realizar una operación utilizando GSS-API
        try {
            GSSManager manager = GSSManager.getInstance();
            // Supongamos que intentamos crear un contexto de seguridad
            GSSContext context = manager.createContext((GSSCredential)null);
            
            // Simulamos un intento de autenticación fallido
            byte[] token = new byte[0]; // token de autenticación vacío
            context.initSecContext(token, 0, token.length);
            
            System.out.println("Autenticación exitosa.");
        } catch (GSSException e) {
            // Manejamos específicamente el error de fallo de autenticación (Código 13)
            if (e.getMajor() == GSSException.CREDENTIALS_EXPIRED) {
                System.err.println("Error: Las credenciales han expirado.");
            } else {
                System.err.println("Se produjo un error en la operación GSS: " + e.getMessage());
            }
        }
 }
 
}

//En este ejemplo, el contexto de seguridad se crea sin ninguna credencial.
//Luego, intentamos inicializar el contexto de seguridad con un token de autenticación vacío. 
//Esto generará un error, específicamente el error de credenciales expiradas (GSSException.CREDENTIALS_EXPIRED), 
//que manejamos en el bloque catch