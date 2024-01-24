package patrones.creacionales.abstractFactory.clases;

import patrones.creacionales.abstractFactory.interfaces.Silla;

public class SillaModerna implements Silla {
    @Override
    public void construir() {
        System.out.println("Se ha construido una silla moderna.");
    }
}
