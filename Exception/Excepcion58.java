/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;

class MyClass {
    private int value;
    private PropertyChangeSupport support;

    public MyClass() {
        this.support = new PropertyChangeSupport(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) throws PropertyVetoException {
        int oldValue = this.value;
        // Aquí podemos aplicar reglas de veto
        if (newValue < 0) {
            // Si el nuevo valor es negativo, lanzamos una PropertyVetoException
            throw new PropertyVetoException("El valor no puede ser negativo", new PropertyChangeEvent(this, "value", oldValue, newValue));
        }
        this.value = newValue;
        // Notificar a los oyentes de cambios de propiedad
        support.firePropertyChange("value", oldValue, newValue);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}

/**
 *
 * @author farfa
 */
public class Excepcion58 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Agregar un oyente de cambios de propiedad
        obj.addPropertyChangeListener(evt -> System.out.println("El valor cambió a: " + evt.getNewValue()));

        try {
            // Intentar establecer un valor negativo (lo que debería lanzar una PropertyVetoException)
            obj.setValue(-10);
        } catch (PropertyVetoException e) {
            // Capturar y manejar la excepción PropertyVetoException
            System.err.println("Error al establecer el valor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}  

