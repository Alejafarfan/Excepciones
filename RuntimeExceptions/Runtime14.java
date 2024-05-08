/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

/**
 *
 * @author farfa
 */
public class Runtime14 {
    
//ClassNotPreparedException 
   public static void main(String[] args) {
      try {
         String className = "com.example.MyClass";
         Class<?> clazz = Class.forName(className);
         Object var3 = clazz.newInstance();
      } catch (IllegalAccessException | InstantiationException | ClassNotFoundException var4) {
         System.err.println("Error: Class not prepared for instantiation.");
         System.err.println("  Reason: The class might not be fully initialized or have errors.");
      }

   }
}
