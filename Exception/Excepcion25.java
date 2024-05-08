/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
 import java.beans.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author farfa
 */
public class Excepcion25 {
    //ExpandVetoException
    
   

    public static void main(String[] args) {
        // Creamos un objeto que actúa como fuente de eventos
        MyBean bean = new MyBean();

        // Agregamos un listener al bean
        bean.addPropertyChangeListener(evt -> {
            // Simulamos un veto en la expansión del evento
            if ("value".equals(evt.getPropertyName()) && evt.getNewValue().equals("veto")) {
                try {
                    throw new PropertyVetoException("La expansion del evento ha sido vetada.", evt);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(Excepcion25.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Propiedad cambiada: " + evt.getPropertyName() + ", Nuevo valor: " + evt.getNewValue());
        });

        // Intentamos cambiar el valor del bean
        try {
            bean.setValue("nuevo valor");
            bean.setValue("veto"); // Este cambio debería lanzar una ExpandVetoException
        } catch (PropertyVetoException e) {
            System.err.println("Se produjo un veto en la expansión del evento: " + e.getMessage());
        }
    }
}

// Definición de la clase MyBean que genera eventos
class MyBean {
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String value;

    // Método para agregar un listener de cambio de propiedad
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    // Método para cambiar el valor y generar un evento
    public void setValue(String newValue) throws PropertyVetoException {
        // Simulamos un veto en la expansión del evento
        propertyChangeSupport.firePropertyChange("value", this.value, newValue);
        this.value = newValue;
    }
}


//En este ejemplo, creamos una clase MyBean que actúa como una fuente de eventos.
//Añadimos un listener de cambio de propiedad al bean y luego intentamos cambiar el valor del bean. 
//Cuando intentamos cambiar el valor a "veto", se genera una PropertyVetoException, que se maneja en el bloque catch.
