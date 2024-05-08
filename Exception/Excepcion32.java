/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
/**
 *
 * @author farfa
 */
public class Excepcion32 {

//IntrospectionException 

    public static void main(String[] args) {
        try {
            // Intentamos realizar introspección en una clase que no existe
            PropertyDescriptor[] descriptors = Introspector.getBeanInfo(NonExistingClass.class).getPropertyDescriptors();
        } catch (IntrospectionException e) {
            // Capturamos la excepción y la imprimimos
            e.printStackTrace();
        }
    }

    // Clase ficticia que no existe
    static class NonExistingClass {
        private int someProperty;

        public int getSomeProperty() {
            return someProperty;
        }

        public void setSomeProperty(int someProperty) {
            this.someProperty = someProperty;
        }
    }
}




