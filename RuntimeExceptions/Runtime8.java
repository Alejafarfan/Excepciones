/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
    import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
/**
 *
 * @author farfa
 */
public class Runtime8 {
//CMMException 
   public static void main(String[] args) {
      try {
         Color colorSRGB = Color.RED;
         ColorSpace espacioColorInvalido = new ICC_ColorSpace(ICC_Profile.getInstance("EspacioColorInvalido"));
         new Color(espacioColorInvalido, colorSRGB.getColorComponents((float[])null), 1.0F);
      } catch (Exception var4) {
         System.err.println("Error: Fallo la conversion de color.");
         System.err.println("  Razon: Se especifico un espacio de color invalido.");
      }

   }
}
