package patrones.estructurales.bridge.clases;

import patrones.estructurales.bridge.interfaces.Dibujo;

public abstract class Forma {
    protected Dibujo dibujo;

    public Forma(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public abstract void dibujar();
}