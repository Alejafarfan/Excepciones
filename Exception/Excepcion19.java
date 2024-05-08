/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/**
 *
 * @author farfa
 */
public class Excepcion19 {
    //DataFormatException
   
    public static void main(String[] args) {
        byte[] datosComprimidos = {120, -100, 75, 76, 75, 44, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}; // Datos comprimidos incorrectos
        try {
            descomprimirDatos(datosComprimidos);
        } catch (DataFormatException e) {
            System.out.println("Error: Formato de datos incorrecto.");
            e.printStackTrace();
        }
    }

    public static void descomprimirDatos(byte[] datosComprimidos) throws DataFormatException {
        Inflater descompresor = new Inflater();
        descompresor.setInput(datosComprimidos);

        byte[] buffer = new byte[1024];
        try {
            // Intentamos descomprimir los datos
            int bytesDescomprimidos = descompresor.inflate(buffer);
            System.out.println("Datos descomprimidos: " + new String(buffer, 0, bytesDescomprimidos));
        } catch (DataFormatException e) {
            throw e;
        } finally {
            descompresor.end();
        }
    }
}

//En este ejemplo, creamos un array de bytes datosComprimidos que contiene datos comprimidos incorrectos. 
//Luego, intentamos descomprimir estos datos utilizando un objeto Inflater. Dado que los datos comprimidos
//no están en el formato correcto, se lanzará una excepción DataFormatException. 
