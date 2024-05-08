/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import java.util.Random;

/**
 *
 * @author farfa
 */
public class Excepcion15 {
    //CardException
        //CardNotPresentException
    
    public static void main(String[] args) {
        try {
            procesarPagoConTarjeta("1234567890123456", 100.0);
            procesarPagoConTarjeta("9876543210987654", 200.0); // Esta tarjeta no está presente físicamente
        } catch (CardNotPresentException e) {
            System.out.println("Error: La tarjeta no esta presente fisicamente.");
            e.printStackTrace();
        } catch (CardException e) {
            System.out.println("Error: Ocurrio un problema con la tarjeta.");
            e.printStackTrace();
        }
    }

    public static void procesarPagoConTarjeta(String numeroDeTarjeta, double monto) throws CardException {
        // Simulamos la verificación de la tarjeta
        if (!validarTarjeta(numeroDeTarjeta)) {
            throw new CardException("La tarjeta no es valida: " + numeroDeTarjeta);
        }

        // Simulamos la verificación de si la tarjeta está presente físicamente
        if (!tarjetaPresenteFisicamente()) {
            throw new CardNotPresentException("La tarjeta no esta presente fisicamente.");
        }

        // Simulamos el proceso de pago
        System.out.println("Pago de $" + monto + " realizado con exito con la tarjeta: " + numeroDeTarjeta);
    }

    public static boolean validarTarjeta(String numeroDeTarjeta) {
        // Simulamos la validación de la tarjeta
        // En este ejemplo, simplemente verificamos que el número de tarjeta tenga 16 dígitos
        return numeroDeTarjeta.length() == 16;
    }

    public static boolean tarjetaPresenteFisicamente() {
        // Simulamos la presencia física de la tarjeta
        // En este ejemplo, generamos un valor aleatorio para simular si la tarjeta está presente o no
        Random random = new Random();
        return random.nextBoolean();
    }
}

class CardException extends Exception {
    public CardException(String message) {
        super(message);
    }
}

class CardNotPresentException extends CardException {
    public CardNotPresentException(String message) {
        super(message);
    }
}

//En este ejemplo, tenemos un método procesarPagoConTarjeta que simula el proceso de pago con tarjeta.
//Dentro de este método, verificamos la validez de la tarjeta y si está presente físicamente. 
//Si la tarjeta no es válida, lanzamos una CardException. Si la tarjeta no está presente físicamente, 
//lanzamos una subclase específica de CardException llamada CardNotPresentException.


