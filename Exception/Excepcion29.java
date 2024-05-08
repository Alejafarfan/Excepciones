/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
/**
 *
 * @author farfa
 */
public class Excepcion29 {
    //IllegalConnectorArgumentsException

    public static void main(String[] args) {
        // Creamos un conector para conectarnos a un agente JMX local
        JMXConnector connector = null;
        try {
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            connector = JMXConnectorFactory.connect(url, null);
            
            // Realizamos operaciones con el agente JMX...
            
            // Cerramos la conexión
            connector.close();
        } catch (Exception e) {
            System.err.println("Se produjo un error al conectar con el agente JMX: " + e.getMessage());
        } finally {
            // Aseguramos que se cierre el conector si está abierto
            if (connector != null) {
                try {
                    connector.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


