/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.RuntimeExceptions;
import java.security.ProviderException;

/**
 *
 * @author farfa
 */
public class Runtime18 {
  
    //CryptoServiceProvider 
   public static byte[] encrypt(byte[] data, String algorithm) throws ProviderException {
      if (!algorithm.equals("AES")) {
         throw new ProviderException("El algoritmo de cifrado no es compatible");
      } else {
         return new byte[0];
      }
   }
}

