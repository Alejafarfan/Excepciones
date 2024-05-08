package Throwable.Error;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.*;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MiAnotacion {

    String valor();
}

@MiAnotacion(valor = "Ejemplo")
class MiClase {
}

public class Error {

    public static void main(String[] args) throws CharacterCodingException {

        //// 1 AnnotationFormatError 
        Class<?> clase = MiClase.class;

        try {
            MiAnotacion anotacion = clase.getAnnotation(MiAnotacion.class);

            if (anotacion != null) {
                System.out.println("El valor de la anotacion es: " + anotacion.valor());
            } else {
                System.out.println("La clase no tiene la anotacion especificada.");
            }
        } catch (AnnotationFormatError e) {
            System.out.println("Se produjo un error al intentar leer la anotación: " + e.getMessage());
        }

        ////2 AssertionError 
        int x = 5;
        int y = 10;

        // Esperamos que x sea menor que y
        // pero por alguna razón, eso no sucede
        if (x > y) {
            // Lanzamos un AssertionError si la condición no se cumple
            throw new AssertionError("x no puede ser mayor que y");
        } else {
            System.out.println("Todo esta bien, x es menor que y.");
        }

        ////3 AWTError
        Frame frame = new Frame("Ejemplo de AWTError");

        try {
            // Intentamos agregar un componente que AWT no puede manejar
            frame.add(new Button("Haz clic"));
        } catch (AWTError e) {
            System.out.println("Se produjo un error de AWT: " + e.getMessage());
        }

        frame.setSize(300, 200);
        frame.setVisible(true);

        //// 4 CoderMalfunctionError
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        // Simulamos un comportamiento inesperado al configurar el encoder
        encoder.onMalformedInput(CodingErrorAction.REPLACE);

        System.out.println("Ejemplo de comportamiento inesperado pero sin lanzar CoderMalfunctionError");

        //// 5 FactoryConfigurationError
        try {
            // Intentamos obtener una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Intentamos obtener un DocumentBuilder a partir de la fábrica
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Realizamos alguna operación con el DocumentBuilder
            // (en este caso, simplemente lo mostramos)
            System.out.println("DocumentBuilder creado exitosamente: " + builder);
        } catch (javax.xml.parsers.FactoryConfigurationError e) {
            System.out.println("Error de configuración de la fábrica: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Otro error: " + ex.getMessage());
        }

        //// 6 IOError
        try {
            FileInputStream fis = new FileInputStream("archivo_que_no_existe.txt");
        } catch (IOException e) {
            System.out.println("Se produjo un error de entrada/salida: " + e.getMessage());
        }

        //// 7 LinkageError
        try {
            // Intentamos cargar una clase que depende de otra clase
            // pero esta última tiene una versión incompatible
            Class.forName("ClaseDependiente");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar la clase: " + e.getMessage());
        } catch (LinkageError ex) {
            System.out.println("Se produjo un error de enlace: " + ex.getMessage());
        }

        //// 8 SchemaFactoryConfigurationError
        try {
            // Creamos una fábrica de validación de esquemas XML
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            // Intentamos cargar un esquema XML desde un archivo
            Schema schema = factory.newSchema(new StreamSource("archivo_de_esquema.xsd"));

            // Realizamos alguna operación con el esquema (en este caso, simplemente lo mostramos)
            System.out.println("Esquema XML cargado correctamente: " + schema);
        } catch (SchemaFactoryConfigurationError e) {
            System.out.println("Error de configuración en la fábrica de esquemas XML: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Otro error: " + ex.getMessage());
        }

        //// 9 ServiceConfigurationError
        try {
            // Intentamos cargar un servicio que no existe
            ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);
            for (MyService service : serviceLoader) {
            }
        } catch (ServiceConfigurationError e) {
            System.out.println("Se produjo un error de configuración de servicio: " + e.getMessage());
        }

        //// 10 TransformerFactoryConfigurationError
        try {
            // Intentamos obtener una instancia de la fábrica de transformadores XML
            TransformerFactory factory = TransformerFactory.newInstance();

            // Intentamos crear un objeto Transformer a partir de la fábrica
            Transformer transformer = factory.newTransformer();

            // Realizamos alguna operación con el transformador (en este caso, simplemente lo mostramos)
            System.out.println("Transformer creado exitosamente: " + transformer);
        } catch (TransformerFactoryConfigurationError e) {
            System.out.println("Error de configuración de la fábrica de transformadores XML: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Otro error: " + ex.getMessage());
        }
        //// 11 ThreadDeath
        Thread t = new Thread(() -> {
            try {
                // Hacemos que el hilo duerma durante 5 segundos
                Thread.sleep(1000);
                System.out.println("El hilo ha terminado de dormir.");
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
            }
        });

        t.start(); // Iniciamos el hilo

        // Simulamos una interrupción abrupta del hilo después de 2 segundos
        try {
            Thread.sleep(2000);
            t.interrupt(); // Interrumpimos el hilo
            System.out.println("Hilo principal: Hilo interrumpido.");
        } catch (InterruptedException e) {
            System.out.println("Hilo principal: El hilo principal fue interrumpido.");
        }

        ////12 VirtualMachineError
        //InternalError
        try {
            // Simulamos un error interno en la JVM
            throw new InternalError("Error interno en la JVM");
        } catch (InternalError e) {
            System.out.println("Se ha producido un InternalError: " + e.getMessage());
        }
        //OutOfMemoryError

        try {
            // Creamos un gran array para forzar un OutOfMemoryError
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Se ha producido un OutOfMemoryError: " + e.getMessage());
        }

        //StackOverflowError
        try {
            // Creamos un objeto y llamamos a un método que consume mucha memoria recursivamente
            ObjetoRecursivo objeto = new ObjetoRecursivo();
            objeto.metodoRecursivo();
        } catch (StackOverflowError e) {
            System.out.println("Se ha producido un StackOverflowError: " + e.getMessage());
        }

        //UnknownError
        try {
            // Lanzamos un error desconocido
            throw new UnknownError("Error desconocido en la JVM");
        } catch (UnknownError e) {
            System.out.println("Se ha producido un UnknownError: " + e.getMessage());
        }
    }
}

class ClaseDependiente {

    // Esta clase depende de otra clase llamada ClaseIncompatible
    static {
        ClaseIncompatible.incompatibleMethod();
    }
}

class ClaseIncompatible {
    // Método que puede causar un LinkageError
    static void incompatibleMethod() {
        // Este método no existe en la versión esperada de ClaseIncompatible
    }
}

interface MyService {

    void doSomething();
}

class ObjetoRecursivo {

 
    public void metodoRecursivo() {
        // Creamos un array grande en cada llamada recursiva
        int[] array = new int[1000];
        metodoRecursivo(); // Llamada recursiva
    }
}