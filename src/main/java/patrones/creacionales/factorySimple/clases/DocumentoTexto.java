package patrones.creacionales.factorySimple.clases;

import patrones.creacionales.factorySimple.interfaces.Documento;

public class DocumentoTexto implements Documento {
    @Override
    public void abrir() {
        System.out.println("Documento de texto abierto");
    }

    @Override
    public void cerrar() {
        System.out.println("Documento de texto cerrado");
    }
}
