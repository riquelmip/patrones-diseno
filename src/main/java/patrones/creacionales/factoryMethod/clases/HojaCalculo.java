package patrones.creacionales.factoryMethod.clases;

import patrones.creacionales.factoryMethod.interfaces.Documento;

// Implementación de la interfaz Document para una hoja de cálculo.
public class HojaCalculo implements Documento {
    @Override
    public void abrir() {
        System.out.println("Hoja de cálculo abierta");
    }

    @Override
    public void cerrar() {
        System.out.println("Hoja de cálculo cerrada");
    }
}
