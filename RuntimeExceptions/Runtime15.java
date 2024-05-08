/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime15 {
    //CloudStorageProvider
    public static void main(String[] args) {
        try {
            // Simulación de interacción con CloudStorageProvider
            CloudStorageProvider storageProvider = new CloudStorageProvider();
            storageProvider.uploadFile("archivo.txt");
        } catch (RuntimeException e) {
            // Manejo de la excepción de tiempo de ejecución
            System.err.println("Se ha producido una excepcion de tiempo de ejecucion:");
            e.printStackTrace();
            // Puedes agregar aquí el código para recuperarse o manejar la excepción de otra manera
        }
    }

    private static class CloudStorageProvider {

        public CloudStorageProvider() {
        }

        private void uploadFile(String archivotxt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

