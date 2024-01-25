package patrones.estructurales.bridge.clases;

import patrones.estructurales.bridge.interfaces.Dibujo;

public class Cuadrado extends Forma {
    private int lado;

    public Cuadrado(Dibujo dibujo, int lado) {
        super(dibujo);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de lado " + lado);
        dibujo.dibujarForma();
    }
}