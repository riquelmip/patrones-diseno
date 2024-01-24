package patrones.creacionales.factorySimple.clases;


import patrones.creacionales.factorySimple.interfaces.Documento;

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
