/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author farfa
 */
public class Runtime17 {

//ConcurrentModificationException 
   public static void main(String[] args) {
      List<String> list = new ArrayList();
      list.add("A");
      list.add("B");
      list.add("C");
      Iterator iterator = list.iterator();

      while(iterator.hasNext()) {
         String element = (String)iterator.next();
         System.out.println(element);
         list.add("D");
      }

   }
}

