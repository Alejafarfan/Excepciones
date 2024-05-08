/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.io.IOException;

/**
 *
 * @author farfa
 */
public class Excepcion62 {
    //SAXException

    public static void main(String[] args) {
        try {
            // Crear un objeto XMLReader para procesar el documento XML
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();

            // Establecer el controlador de eventos para el procesamiento SAX
            xmlReader.setContentHandler(new DefaultHandler() {
                boolean inName = false;

                // Método llamado cuando se encuentran caracteres dentro de un elemento XML
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (inName) {
                        // Si estamos dentro del elemento 'name', imprimir los caracteres
                        System.out.println("Nombre: " + new String(ch, start, length));
                    }
                }

                // Método llamado al comenzar un elemento XML
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("name")) {
                        // Si encontramos el elemento 'name', establecer la bandera en true
                        inName = true;
                    }
                }

                // Método llamado al finalizar un elemento XML
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (qName.equalsIgnoreCase("name")) {
                        // Si finalizamos el elemento 'name', establecer la bandera en false
                        inName = false;
                    }
                }
            });

            // Leer y procesar el documento XML
            xmlReader.parse("datos.xml");
        } catch (SAXException | IOException e) {
            // Capturar y manejar cualquier excepción SAXException o IOException
            System.err.println("Error durante el procesamiento SAX: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
