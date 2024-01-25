package patrones.estructurales.bridge.clases;

import patrones.estructurales.bridge.interfaces.Dibujo;

public class Circulo extends Forma {
    private int radio;

    public Circulo(Dibujo dibujo, int radio) {
        super(dibujo);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
        dibujo.dibujarForma();
    }
}