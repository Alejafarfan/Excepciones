/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import javax.script.*;

/**
 *
 * @author farfa
 */
public class Excepcion63 {
    //ScriptException

    public static void main(String[] args) {
        // Crear un motor de script
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        try {
            // Ejecutar un script en lenguaje JavaScript
            Object result = engine.eval("var x = 10; var y = 0; var z = x / y;");
            System.out.println("Resultado: " + result);
        } catch (ScriptException e) {
            // Capturar y manejar la excepción ScriptException
            System.err.println("Error durante la ejecución del script: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

