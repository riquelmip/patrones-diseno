# 7 - Adapter

#### Problema:
Imagina que tienes una clase existente (`Zombie`) y necesitas agregarle mas funcionalidades sin tener que modificarla.

#### Solución - Patrón Adapter:

El patrón Adapter permite que interfaces incompatibles trabajen juntas. Creamos una nueva clase (`ZombieAdapter`) que actúa como puente entre la clase antigua y la nueva, permitiendo que el nuevo sistema utilice la clase antigua sin modificaciones.

#### Ejemplo en Java:

La interfaz antigua:
```java
// Interfaz antigua
public interface EnemigoAntiguo {
    void ataque();
    void dano();
}
```

La clase antigua:
```java
public class Zombie {
    public void morder(){
        System.out.println("zombie muerde");
    }

    public void golpear(){
        System.out.println("zombie golpea");
    }

    public void danoCabeza(){
        System.out.println("daño en la cabeza!!");
    }

    public void danoCuerpo(){
        System.out.println("daño en el cuerpo!!");
    }
}
```

La clase adaptador:
```java
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
```

### Ventajas:

- **Reutilización de código:** Permite la reutilización de clases existentes con interfaces incompatibles.
- **Integración sin modificaciones:** Permite integrar componentes existentes en nuevos sistemas sin modificar su código.

### Desventajas:

- **Complejidad adicional:** Introducción de clases adicionales puede aumentar la complejidad del sistema.

### Conclusiones:

El patrón Adapter es esencial cuando necesitas integrar componentes con interfaces incompatibles. Aunque introduce complejidad adicional, proporciona una solución flexible y reutilizable.
