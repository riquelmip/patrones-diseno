package patrones.creacionales.factorySimple.clases;

import patrones.creacionales.factorySimple.interfaces.Documento;

//Esta es la clase fábrica, donde se crearán los archivos dependiendo del tipo
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
