/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

   // Supongamos que estamos utilizando una biblioteca externa para el procesamiento de XML
// Esta es solo una simulación y no se corresponde con una biblioteca real
class XMLParser {
    public void parse(String xmlContent) throws XMLParseException {
        // Simulamos el análisis del documento XML
        // Si ocurre un error durante el análisis, lanzamos una XMLParseException
        throw new XMLParseException("Error al analizar el documento XML");
    }
}

// Clase de excepción personalizada XMLParseException
class XMLParseException extends Exception {
    public XMLParseException(String message) {
        super(message);
    }
}
 
public class Excepcion81 {
    //XMLParseException
    
    public static void main(String[] args) {
        // Simulamos la llamada a la biblioteca de procesamiento de XML
        XMLParser parser = new XMLParser();
        String xmlContent = "<root><element>data</element></root>";
        
        try {
            // Intentamos analizar el documento XML
            parser.parse(xmlContent);
        } catch (XMLParseException e) {
            // Capturamos y manejamos la excepción XMLParseException
            System.err.println("Error durante el analisis del documento XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

