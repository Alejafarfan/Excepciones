/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.awt.print.PrinterException;
   import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.PrinterName;


/**
 *
 * @author farfa
 */
public class Excepcion55 {
    //PrinterException
    
    public static void main(String[] args) {
        // Definir el nombre de la impresora
        String printerName = "NombreDeLaImpresora";
        // Obtener una instancia del servicio de impresión por defecto
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
        if (defaultPrintService != null) {
            // Configurar la impresora a utilizar
            PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
            attributes.add(new PrinterName(printerName, null));
            
            // Crear una tarea de impresión
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            
            // Realizar la impresión (aquí asumimos que se está imprimiendo un documento)
            // printJob.print(documento, attributes);
            
            System.out.println("El documento se ha enviado a imprimir correctamente.");
        } else {
            System.err.println("No se encontró ninguna impresora predeterminada.");
        }
    }
}

