/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import javax.xml.stream.*;
import java.io.*;
/**
 *
 * @author farfa
 */
public class Excepcion83 {
    //XMLStreamException
    public static void main(String[] args) {
        // Nombre del archivo XML a procesar
        String xmlFile = "datos.xml";

        try {
            // Crear un lector XML utilizando StAX
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(xmlFile));

            // Iterar sobre los elementos del documento XML
            while (reader.hasNext()) {
                int event = reader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        // Procesar el elemento de inicio
                        System.out.println("Elemento de inicio: " + reader.getLocalName());
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        // Procesar los caracteres dentro de un elemento
                        String text = reader.getText().trim();
                        if (!text.isEmpty()) {
                            System.out.println("Texto: " + text);
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        // Procesar el elemento de fin
                        System.out.println("Elemento de fin: " + reader.getLocalName());
                        break;
                }
            }

            // Cerrar el lector XML
            reader.close();
        } catch (XMLStreamException | FileNotFoundException e) {
            // Capturar y manejar la excepción XMLStreamException
            System.err.println("Error durante el procesamiento del documento XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

