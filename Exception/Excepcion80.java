/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import javax.transaction.xa.*;
/**
 *
 * @author farfa
 */
public class Excepcion80 {
    //XAException
  
    public static void main(String[] args) {
        try {
            // Simulamos una operación de transacción distribuida
            simulateDistributedTransaction();
        } catch (XAException e) {
            // Capturamos y manejamos la XAException
            System.err.println("Error durante la transaccion distribuida: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void simulateDistributedTransaction() throws XAException {
        // Simulamos una operación que involucra un recurso de transacción participante
        // Supongamos que ocurre un error durante la operación
        throw new XAException("Error en el recurso de transaccion participante");
    }
}

