/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */class LastOwnerException extends Exception {
    public LastOwnerException(String message) {
        super(message);
    }
}

// Clase de la propiedad
class Propiedad {
    private int numPropietarios;

    public Propiedad() {
        this.numPropietarios = 0;
    }

    // Método para añadir propietarios
    public void agregarPropietario() {
        this.numPropietarios++;
    }

    // Método para eliminar propietarios
    public void eliminarPropietario() throws LastOwnerException {
        if (numPropietarios == 0) {
            throw new LastOwnerException("No hay propietarios para eliminar");
        } else if (numPropietarios == 1) {
            throw new LastOwnerException("No se puede eliminar el ultimo propietario");
        } else {
            this.numPropietarios--;
        }
    }
}
public class Excepcion44 {
    //LastOwnerException
    

    public static void main(String[] args) {
        Propiedad casa = new Propiedad();

        try {
            casa.agregarPropietario(); // Añadimos un propietario
            casa.eliminarPropietario(); // Eliminamos el único propietario (esto lanzará una excepción)
        } catch (LastOwnerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}