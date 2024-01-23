package patrones.creacionales.factoryMethod.clases;

import patrones.creacionales.factoryMethod.interfaces.CreadorDocumentos;
import patrones.creacionales.factoryMethod.interfaces.Documento;

// Implementación de la interfaz Creator para crear documentos de texto.

public class CreadorDocumentoTexto implements CreadorDocumentos {
    @Override
    public Documento crearDocumento() {
        return new DocumentoTexto();
    }
}
