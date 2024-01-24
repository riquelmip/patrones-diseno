# 1 - Abstract Factory

## Problema
Imagina que estás diseñando un sistema para fabricar muebles, y necesitas crear diferentes tipos de muebles, como sillas y mesas, en distintos estilos, como moderno y clásico. El problema radica en cómo organizar la creación de estos muebles de manera que los productos creados sean coherentes en términos de estilo.

## Solución

**Interfaces para los productos:**

```java
// Interfaz para la silla
public interface Silla {
    void construir();
}

// Interfaz para la mesa
public interface Mesa {
    void construir();
}
```

**Implementaciones concretas de los productos:**

```java
// Implementación de la silla moderna
public class SillaModerna implements Silla {
    @Override
    public void construir() {
        System.out.println("Se ha construido una silla moderna.");
    }
}

// Implementación de la mesa moderna
public class MesaModerna implements Mesa {
    @Override
    public void construir() {
        System.out.println("Se ha construido una mesa moderna.");
    }
}

// Implementación de la silla clásica
public class SillaClasica implements Silla {
    @Override
    public void construir() {
        System.out.println("Se ha construido una silla clásica.");
    }
}

// Implementación de la mesa clásica
public class MesaClasica implements Mesa {
    @Override
    public void construir() {
        System.out.println("Se ha construido una mesa clásica.");
    }
}
```

**Interfaces para las fábricas abstractas:**

```java
// Interfaz para la fábrica abstracta de muebles
public interface FabricaMuebles {
    Silla crearSilla();
    Mesa crearMesa();
}
```

**Implementaciones concretas de las fábricas:**

```java
// Implementación de la fábrica abstracta para muebles modernos
public class FabricaMueblesModernos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}

// Implementación de la fábrica abstracta para muebles clásicos
public class FabricaMueblesClasicos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }
}
```

## Ventajas:

- **Desacoplamiento:** El código cliente no necesita conocer las clases concretas de los productos ni cómo se crean, ya que trabaja con las interfaces.
- **Consistencia:** Las fábricas abstractas aseguran que los productos creados pertenezcan a la misma familia y sigan un estilo coherente.

## Desventajas:

- **Complejidad:** Introducción de múltiples interfaces y clases, lo que podría aumentar la complejidad del código.
- **Dificultad para añadir nuevos productos:** Puede ser complicado añadir nuevos productos a las familias existentes.

## Conclusión:
El patrón Abstract Factory es una solución efectiva para organizar la creación de objetos relacionados entre sí y garantizar que los productos creados sigan un tema o estilo específico. Sin embargo, la complejidad adicional debe evaluarse según las necesidades del proyecto.