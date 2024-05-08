/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.management.*;
import javax.management.openmbean.OpenDataException;
import javax.management.relation.RelationException;
/**
 *
 * @author farfa
 */
public class Excepcion40 {

    public static void main(String[] args) {
        try {
            // Simulando un error al operar un MBean

            throw new MBeanException(new Exception(), "Error en la operacion del MBean");

        } catch (MBeanException e) {
            System.out.println("Excepcion MBeanException: " + e.getMessage());
        }

        try {
            // Simulando un error relacionado con datos abiertos
            throw new OpenDataException("Error al manipular datos abiertos");
            
        } catch (OpenDataException e) {
            System.out.println("Excepcion OpenDataException: " + e.getMessage());
        }

        try {
            // Simulando un error en una operación
            throw new OperationsException("Error en la operacion");
            
        } catch (OperationsException e) {
            System.out.println("Excepcion OperationsException: " + e.getMessage());
        }

        try {
            // Simulando un error relacionado con la reflexión
            throw new ReflectionException(new Exception(), "Error en la reflexion");
            
        } catch (ReflectionException e) {
            System.out.println("Excepcion ReflectionException: " + e.getMessage());
        }

        try {
            // Simulando un error relacionado con una relación
            throw new RelationException("Error en la relacion");
            
        } catch (RelationException e) {
            System.out.println("Excepcion RelationException: " + e.getMessage());
        }
        
    }
}

