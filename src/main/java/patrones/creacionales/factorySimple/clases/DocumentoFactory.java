package patrones.creacionales.factorySimple.clases;

import patrones.creacionales.factorySimple.interfaces.Documento;

public class DocumentoFactory {

    public Documento crearDocumento(String tipo) {
        if(tipo.equalsIgnoreCase("texto"))
            return new DocumentoTexto();
        else if(tipo.equalsIgnoreCase("calculo"))
            return new HojaCalculo();
        else
            return null;
    }
}
