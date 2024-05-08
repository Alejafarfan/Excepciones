/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
/**
 *
 * @author farfa
 */
public class Excepcion20 {
    //DatatypeConfigurationException
    
    public static void main(String[] args) {
        try {
            crearDatatypeFactory();
        } catch (DatatypeConfigurationException e) {
            System.out.println("Error: Configuración incorrecta del tipo de datos.");
            e.printStackTrace();
        }
    }

    public static void crearDatatypeFactory() throws DatatypeConfigurationException {
        // Intentamos crear una instancia de DatatypeFactory
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
    }
}

//En este ejemplo, intentamos crear una instancia de DatatypeFactory utilizando el método estático newInstance(). 
//Si hay un error en la configuración del tipo de datos, se lanzará una excepción DatatypeConfigurationException.