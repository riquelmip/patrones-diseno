package patrones.estructurales.adapter.clases;

import patrones.estructurales.adapter.interfaces.EnemigoAntiguo;

public class Guerrero implements EnemigoAntiguo {
    @Override
    public void ataque() {
        System.out.println("ataque de guerrero!!");
    }

    @Override
    public void dano() {
        System.out.println("daño de guerrero!!");
    }
}
