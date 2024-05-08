/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author farfa
 */
public class Excepcion6 {
//AlreadyBoundException
    public static void main(String[] args) {
        try {
            // Creamos una instancia de la implementación de la interfaz
            MiInterfaz miObjeto = new ImplementacionInterfaz();

            // Creamos un registro RMI en el puerto 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Exportamos el objeto para que esté disponible de forma remota
            MiInterfaz stub = (MiInterfaz) UnicastRemoteObject.exportObject(miObjeto, 0);

            // Vamos a enlazar un objeto al registro
            String objetoNombre = "MiObjeto";

            // Intentamos enlazar el objeto al nombre especificado
            registry.bind(objetoNombre, stub);
            System.out.println("Objeto enlazado correctamente.");

            // Ahora intentamos enlazar otro objeto con el mismo nombre
            registry.bind(objetoNombre, stub); // Esto lanzará AlreadyBoundException
            System.out.println("¡Esto no se imprimirá porque ya hemos lanzado una excepción!");

        } catch (RemoteException | AlreadyBoundException e) {
            // Capturamos cualquier excepción que pueda ocurrir, incluida AlreadyBoundException
            System.err.println("Error: " + e.getMessage());
        }
    }
}

interface MiInterfaz extends java.rmi.Remote {
    void saludar() throws java.rmi.RemoteException;
}

// Implementación de la interfaz remota
class ImplementacionInterfaz implements MiInterfaz {
    public void saludar() throws java.rmi.RemoteException {
        System.out.println("¡Hola, mundo desde el servidor RMI!");
    }
}

// ejemplo crea un registro RMI en el puerto 1099, enlaza un objeto remoto a un nombre en ese registro
// y luego intenta enlazar otro objeto remoto con el mismo nombre, lo que provocará una AlreadyBoundException