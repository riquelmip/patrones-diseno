package patrones.estructurales.bridge.clases;

import patrones.estructurales.bridge.interfaces.Dibujo;

public class DibujoEnVentana implements Dibujo {
    @Override
    public void dibujarForma() {
        System.out.println("Dibujando en la ventana");
    }
}