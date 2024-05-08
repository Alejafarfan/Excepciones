/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
import java.beans.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;


/**
 *
 * @author farfa
 */
public class Excepcion36 {
    //InvalidTargetObjectTypeException

    public static void main(String[] args) {
        // Intentamos establecer un valor incorrecto para un bean
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(MyBean.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            // Iteramos sobre las propiedades del bean y establecemos un valor incorrecto
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if ("age".equals(propertyDescriptor.getName())) {
                    // Intentamos establecer un valor que no es del tipo correcto (un String en lugar de un int)
                    propertyDescriptor.getWriteMethod().invoke(new MyBean(), "invalid_value");
                }
            }
        } catch (Exception e) {
            if (e instanceof InvalidTargetObjectTypeException) {
                System.out.println("Se ha lanzado una InvalidTargetObjectTypeException: " + e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}

class MyBean {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

