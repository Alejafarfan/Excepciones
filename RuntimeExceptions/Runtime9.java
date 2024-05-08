/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
    import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author farfa
 */
public class Runtime9 {
    //CannotRedoException 
    
   public static void main(String[] args) {
      StyleContext sc = new StyleContext();
      StyledDocument doc = new DefaultStyledDocument(sc);
      UndoManager undoManager = new UndoManager();
      doc.addUndoableEditListener(undoManager);

      try {
         doc.insertString(0, "Hola, mundo!", (AttributeSet)null);
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      try {
         undoManager.undo();
      } catch (CannotUndoException var6) {
         System.err.println("Error: No se puede deshacer la última acción.");
         System.err.println("  Razón: " + var6.getMessage());
      }

      try {
         undoManager.redo();
      } catch (javax.swing.undo.CannotRedoException var5) {
         System.err.println("Error: No se puede rehacer la última acción deshecha.");
         System.err.println("  Razón: " + var5.getMessage());
      }

   }
}

