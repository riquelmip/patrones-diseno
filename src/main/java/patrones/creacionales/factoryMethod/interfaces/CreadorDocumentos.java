package patrones.creacionales.factoryMethod.interfaces;

// La interfaz Creator define el método factory que las subclases implementarán.

public interface CreadorDocumentos {
    Documento crearDocumento();
}
