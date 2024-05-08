/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author farfa
 */
public class Runtime23 {

//FileSystemNotFoundException 
   public static void main(String[] args) {
      try {
         Path path = FileSystems.getDefault().getPath("ruta/archivo.txt");
         System.out.println("Path: " + String.valueOf(path));
      } catch (java.nio.file.FileSystemNotFoundException var2) {
         System.err.println("Error: Sistema de archivos no encontrado.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}