/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Throwable.Exception;
    import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
/**
 *
 * @author farfa
 */
public class Excepcion82 {


    public static void main(String[] args) {
        String xmlFile = "documento_firmado.xml";
        String keystoreFile = "almacen_de_claves.jks";
        String keystorePassword = "password";

        try {
            // Cargar el documento XML firmado
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            Document doc = dbf.newDocumentBuilder().parse(new FileInputStream(xmlFile));

            // Obtener la lista de nodos de firma
            NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");

            if (nl.getLength() == 0) {
                throw new XMLSignatureException("No se encontró ninguna firma XML en el documento.");
            }

            // Cargar el almacén de claves
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(keystoreFile), keystorePassword.toCharArray());

            // Obtener el certificado del almacén de claves
            Enumeration<String> aliases = ks.aliases();
            String alias = aliases.nextElement();
            X509Certificate cert = (X509Certificate) ks.getCertificate(alias);

            // Crear un contexto de validación
            DOMValidateContext valContext = new DOMValidateContext(cert.getPublicKey(), nl.item(0));

            // Crear un objeto de fábrica de firmas XML
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Crear una firma XML y validarla
            XMLSignature signature = fac.unmarshalXMLSignature(valContext);
            boolean isValid = signature.validate(valContext);

            if (isValid) {
                System.out.println("La firma XML es válida.");
            } else {
                throw new XMLSignatureException("La firma XML no es válida.");
            }
        } catch (Exception e) {
            // Capturar y manejar la excepción XMLSignatureException
            System.err.println("Error durante la verificacion de la firma XML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class XMLSignatureException extends Exception {

        public XMLSignatureException(String no_se_encontró_ninguna_firma_XML_en_el_do) {
        }
    }
}

