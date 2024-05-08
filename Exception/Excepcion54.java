/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    
    import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author farfa
 */
public class Excepcion54 {
   //ParserConfigurationException
    
  
    public static void main(String[] args) {
    try {
            // Crear una nueva instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // Configurar el factory para que genere un analizador que valide el XML
            factory.setValidating(false);
            
            // Obtener un DocumentBuilder del factory
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Realizar operaciones con el DocumentBuilder (no necesarias para el ejemplo)
            System.out.println("DocumentBuilder creado exitosamente.");
        } catch (ParserConfigurationException e) {
            // Capturar la excepción ParserConfigurationException
            System.err.println("Error al configurar el analizador XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

