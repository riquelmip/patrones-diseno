package patrones.creacionales.factoryMethod.clases;

import patrones.creacionales.factoryMethod.interfaces.CreadorDocumentos;
import patrones.creacionales.factoryMethod.interfaces.DocumentoFM;

// Implementación de la interfaz Creator para crear hojas de cálculo.
public class CreadorHojaCalculo implements CreadorDocumentos {
    @Override
    public DocumentoFM crearDocumento() {
        return new HojaCalculo();
    }
}
