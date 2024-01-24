# 5 - Prototype

## Problema
Imagina que necesitas crear múltiples instancias de un objeto complejo, pero la creación de cada instancia es costosa en términos de recursos y tiempo. Además, quieres evitar duplicar código para la inicialización de objetos similares.

## Solución
El patrón Prototype aborda este problema permitiendo la creación de nuevos objetos mediante la clonación de un objeto existente. Esto no solo mejora el rendimiento sino que también evita la duplicación innecesaria de código de inicialización.

**Creamos la interfaz Prototype:**

```java
public interface Prototype {
    Prototype clonar();
}
```

**Creamos una clase Persona que implemente la interfaz:**

```java
// Clase concreta que implementa el Prototype
public class Persona implements Prototype {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Persona: " + nombre + ", Edad: " + edad);
    }

    // Método para clonar la instancia de Persona
    @Override
    public Prototype clonar() {
        return new Persona(this.nombre, this.edad);
    }
}
```

### Ventajas:

- **Ahorro de recursos:** Permite crear nuevos objetos clonando instancias existentes, evitando la inicialización costosa.
- **Reducción de duplicación de código:** Evita la duplicación de código de inicialización al utilizar prototipos clonables.

### Desventajas:

- **Manejo de referencias:** Si el objeto tiene referencias a otros objetos, debes manejar la clonación profunda para evitar compartir referencias.

### Conclusión:

El patrón Prototype es útil cuando necesitas crear instancias de objetos complejos de manera eficiente y evitar la duplicación innecesaria de código. Sin embargo, debes tener cuidado con la clonación profunda si tu objeto contiene referencias a otros objetos. En general, el patrón Prototype mejora el rendimiento y promueve un diseño más modular y reutilizable.
