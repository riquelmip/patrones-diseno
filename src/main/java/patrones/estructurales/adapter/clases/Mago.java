package patrones.estructurales.adapter.clases;

import patrones.estructurales.adapter.interfaces.EnemigoAntiguo;

public class Mago implements EnemigoAntiguo {
    @Override
    public void ataque() {
        System.out.println("ataque de mago!!");
    }

    @Override
    public void dano() {
        System.out.println("daño de mago!!");
    }
}
