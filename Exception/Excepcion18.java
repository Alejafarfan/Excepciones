/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

/**
 *
 * @author farfa
 */
public class Excepcion18 {
    //CloneNotSupportedException
        //ServerCloneException
   
    public static void main(String[] args) {
        try {
            Server server1 = new Server("Servidor1");
            // Intentamos clonar un objeto de tipo Server
            Server server2 = (Server) server1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error al clonar el servidor:");
            System.out.println(e.getMessage());
        }
    }
}
    class Server implements Cloneable {
    private String name;
    
    public Server(String name) {
        this.name = name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Si el objeto no es clonable, lanzamos una excepción
        throw new CloneNotSupportedException("No se puede clonar el servidor: " + name);
    }
}

class ServerCloneException extends CloneNotSupportedException {
    public ServerCloneException(String message) {
        super(message);
    }
}

//En este ejemplo, la clase Server implementa la interfaz Cloneable, pero anula el método clone()
//para lanzar explícitamente una excepción CloneNotSupportedException. Luego, creamos una subclase personalizada
//llamada ServerCloneException que extiende CloneNotSupportedException.
