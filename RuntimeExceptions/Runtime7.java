/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
  import com.sun.jdi.InvalidCodeIndexException;
/**
 *
 * @author farfa
 */
public class Runtime7 {
  

//BytecodeManipulator 
   public void modifyInstruction(byte[] bytecode, int index, byte newInstruction) throws InvalidCodeIndexException {
      if (index >= 0 && index < bytecode.length) {
         bytecode[index] = newInstruction;
      } else {
         throw new InvalidCodeIndexException("Invalid instruction index.");
      }
   }
}
