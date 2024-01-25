package patrones.estructurales.bridge.clases;

import patrones.estructurales.bridge.interfaces.Dibujo;

// Implementación concreta: DibujoEnArchivo
public class DibujoEnArchivo implements Dibujo {
    @Override
    public void dibujarForma() {
        System.out.println("Guardando la forma en un archivo");
    }
}