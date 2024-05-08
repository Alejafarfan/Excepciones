/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime22 {
       public static void main(String[] args) {
        try {
            // Simulación de interacción con FileManager
            FileManager fileManager = new FileManager();
            fileManager.openFile("archivo.txt");
        }catch (RuntimeException e) {
            // Manejo de otras excepciones de tiempo de ejecución
            System.err.println("Se ha producido una excepcion de tiempo de ejecucion:");
            e.printStackTrace();
            // Puedes agregar aquí el código para recuperarse o manejar la excepción de otra manera
        }
        // Manejo de la excepción específica de FileManager
        // Puedes agregar aquí el código para recuperarse o manejar la excepción de otra manera
        
    }

    private static class FileManager {

        public FileManager() {
        }

        private void openFile(String archivotxt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class FileManagerException {

        public FileManagerException() {
        }

        private void printStackTrace() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
 
