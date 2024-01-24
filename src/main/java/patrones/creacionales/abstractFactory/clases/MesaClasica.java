package patrones.creacionales.abstractFactory.clases;

import patrones.creacionales.abstractFactory.interfaces.Mesa;

public class MesaClasica implements Mesa {
    @Override
    public void construir() {
        System.out.println("Se ha construido una mesa clásica.");
    }
}