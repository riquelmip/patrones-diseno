package patrones.creacionales.factoryMethod.clases;

import patrones.creacionales.factoryMethod.interfaces.DocumentoFM;

// Implementación de la interfaz Documento para una hoja de cálculo.
public class HojaCalculo implements DocumentoFM {
    @Override
    public void abrir() {
        System.out.println("Hoja de cálculo abierta");
    }

    @Override
    public void cerrar() {
        System.out.println("Hoja de cálculo cerrada");
    }
}
