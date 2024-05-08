/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import java.io.Serializable;
import java.io.*;

class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private transient int edad; // transient indica que no será serializado
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
public class Excepcion46 {
    //MarshalException
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        try {
            // Intentamos serializar el objeto
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persona);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            // Capturamos la excepción en caso de error
            e.printStackTrace();
        }
    }

}
//Este código lanzaría una excepción `MarshalException` debido a que la clase `Persona` tiene un miembro (`edad`) que no es serializable.
//Para solucionarlo, podrías simplemente quitar la palabra clave `transient` del miembro `edad`