package patrones.creacionales.factoryMethod.clases;

import patrones.creacionales.factoryMethod.interfaces.DocumentoFM;

// Implementación de la interfaz Document para un documento de texto.
public class DocumentoTexto implements DocumentoFM {
    @Override
    public void abrir() {
        System.out.println("Documento de texto abierto");
    }

    @Override
    public void cerrar() {
        System.out.println("Documento de texto cerrado");
    }
}
