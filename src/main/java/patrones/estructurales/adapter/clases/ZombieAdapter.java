package patrones.estructurales.adapter.clases;

import patrones.estructurales.adapter.interfaces.EnemigoAntiguo;

public class ZombieAdapter implements EnemigoAntiguo {

    private Zombie zombie;

    public ZombieAdapter() {
        this.zombie = new Zombie();
    }

    @Override
    public void ataque() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
            zombie.morder();
        else
            zombie.golpear();
    }

    @Override
    public void dano() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
            zombie.danoCabeza();
        else
            zombie.danoCuerpo();
    }
}