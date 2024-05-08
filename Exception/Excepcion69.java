/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import javax.xml.transform.*;
import javax.xml.transform.stream.*;
/**
 *
 * @author farfa
 */
public class Excepcion69 {

//TransformerException
    public static void main(String[] args) {
        try {
            // Crear una fábrica de transformadores
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            
            // Crear un transformador para realizar la transformación
            Transformer transformer = transformerFactory.newTransformer();
            
            // Crear una fuente de origen (por ejemplo, un documento XML)
            Source source = new StreamSource("input.xml");
            
            // Crear una fuente de resultado (por ejemplo, un archivo de salida)
            Result result = new StreamResult("output.xml");
            
            // Realizar la transformación
            transformer.transform(source, result);
            
            System.out.println("Transformación XML completada con éxito.");
        } catch (TransformerException e) {
            // Capturar y manejar la excepción TransformerException
            System.err.println("Error durante la transformacion XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

