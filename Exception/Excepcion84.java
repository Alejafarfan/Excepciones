/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
/**
 *
 * @author farfa
 */
public class Excepcion84 {
    //XPathException
   

    public static void main(String[] args) {
        // Documento XML
        String xml = "<personas><persona><nombre>John</nombre><edad>30</edad></persona></personas>";

        try {
            // Crear un objeto Document a partir del XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));

            // Crear un objeto XPath
            XPath xpath = XPathFactory.newInstance().newXPath();

            // Evaluar una expresión XPath
            XPathExpression expression = xpath.compile("/personas/persona/nombre");
            String nombre = (String) expression.evaluate(document, XPathConstants.STRING);

            // Imprimir el nombre
            System.out.println("Nombre: " + nombre);

            // Evaluar una expresión XPath no válida para simular un XPathException
            expression = xpath.compile("//personas/persona/nombre/text()");
            String nombreInvalido = (String) expression.evaluate(document, XPathConstants.STRING);

            // Esto no debería imprimirse porque se lanza un XPathException antes
            System.out.println("Nombre invalido: " + nombreInvalido);
        } catch (XPathExpressionException e) {
            // Capturar y manejar la excepción XPathException
            System.err.println("Error durante la evaluación de la expresión XPath: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception ex) {
            // Capturar y manejar otras excepciones
            System.err.println("Error inesperado: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

