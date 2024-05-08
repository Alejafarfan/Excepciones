/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
  import java.io.FilePermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;  
import java.security.ProtectionDomain;

/**
 *
 * @author farfa
 */
public class Excepcion52 {
        public static void main(String[] args) {
        // Crear una política de seguridad
        Policy.setPolicy(new CustomSecurityPolicy());
        
        // Establecer el administrador de seguridad
        System.setSecurityManager(new SecurityManager());
        
        // Intentar acceder a un recurso protegido
        try {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {
                sm.checkPermission(new FilePermission("test.txt", "read"));
                System.out.println("Se permitió el acceso al archivo.");
            } else {
                System.out.println("No hay administrador de seguridad establecido.");
            }
        } catch (SecurityException e) {
            System.err.println("No se pudo acceder al archivo: " + e.getMessage());
        }
    }
}

// Política de seguridad personalizada
class CustomSecurityPolicy extends Policy {
    @Override
    public boolean implies(ProtectionDomain domain, Permission permission) {
        // Comprobar si el permiso es una instancia de FilePermission
        if (permission instanceof FilePermission) {
            FilePermission filePermission = (FilePermission) permission;
            // Comprobar si el permiso es de lectura y para un archivo específico
            if (filePermission.getActions().equals("read") &&
                filePermission.getName().equals("test.txt")) {
                // Verificar si el código actual no es el propietario de la política de seguridad
                if (!"Main".equals(domain.getCodeSource().getLocation().toString())) {
                    throw new NotOwnerException("No es propietario de la política de seguridad.");
                }
            }
        }
        return true;
    }

    @Override
    public PermissionCollection getPermissions(CodeSource codesource) {
        return null;
    }
}

// Excepción personalizada para indicar que el código no es el propietario de la política de seguridad
class NotOwnerException extends SecurityException {
    public NotOwnerException(String message) {
        super(message);
    }
}



