# 8 - Bridge 

#### Problema:
Imagina que estás desarrollando un sistema de formas geométricas que puede dibujarse en distintos dispositivos, como en una ventana de la interfaz gráfica o en un archivo. Necesitas una solución que permita variar tanto las formas como los dispositivos de dibujo de forma independiente.


#### Solución - Patrón Bridge:

El patrón Bridge resuelve este problema separando la abstracción de su implementación, de modo que ambas puedan variar de forma independiente. En este caso, tendríamos una jerarquía de formas y otra jerarquía de dispositivos de dibujo, y el puente (Bridge) conectará las dos jerarquías.


#### Ejemplo en Java:

La clase abstracta:
```java
// Abstracción: Forma
public abstract class Forma {
    protected Dibujo dibujo;

    public Forma(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public abstract void dibujar();
}
```

La interfaz:
```java
// Implementación: Dibujo
public interface Dibujo {
    void dibujarForma();
}
```

Algunas formas:
```java
// Forma concreta: Círculo
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

// Forma concreta: Cuadrado
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
```

Implementaciones:
```java
// Implementación concreta: DibujoEnVentana
public class DibujoEnVentana implements Dibujo {
    @Override
    public void dibujarForma() {
        System.out.println("Dibujando en la ventana");
    }
}

// Implementación concreta: DibujoEnArchivo
public class DibujoEnArchivo implements Dibujo {
    @Override
    public void dibujarForma() {
        System.out.println("Guardando la forma en un archivo");
    }
}
```

### Ventajas:

- **Desacoplamiento:** Permite variar las formas y los dibujos de manera independiente.
- **Extensibilidad:** Facilita la introducción de nuevas formas o dibujos sin modificar el código existente.


### Desventajas:

- **Complejidad inicial:** Puede introducir una mayor complejidad al tener varias jerarquías.


### Conclusiones:

El patrón Bridge es útil cuando necesitas desacoplar abstracciones de sus implementaciones, permitiendo que ambas varíen de forma independiente. Aunque puede aumentar la complejidad inicial, proporciona flexibilidad y extensibilidad a largo plazo.






