# 1 - Factory Simple

Imagina que estás desarrollando un sistema de creación de documentos y deseas implementar un mecanismo que permita crear diferentes tipos de documentos, como hojas de cálculo, presentaciones y documentos de texto.

## Problema
Necesitas una solución flexible y extensible para la creación de distintos tipos de documentos sin acoplar tu código a clases específicas de documentos.

### Uso del Patrón Factory Simple
Utilizaremos el patrón Factory Simple para posibilitar la creación de diversos tipos de documentos sin especificar las clases concretas en el código cliente.

## Solución

**Creamos una interfaz:**

```java
// Interfaz Documento que define las operaciones comunes para todos los documentos.
public interface DocumentoFM {
    void abrir();
    void cerrar();
}
```

**Creamos las implementaciones de las interfaces:**

```java
// Implementación de la interfaz Documento para un documento de texto.
public class DocumentoTexto implements Documento {
    @Override
    public void abrir() {
        System.out.println("Documento de texto abierto");
    }

    @Override
    public void cerrar() {
        System.out.println("Documento de texto cerrado");
    }
}

// Implementación de la interfaz Documento para una hoja de cálculo.
public class HojaCalculo implements Documento {
    @Override
    public void abrir() {
        System.out.println("Hoja de cálculo abierta");
    }

    @Override
    public void cerrar() {
        System.out.println("Hoja de cálculo cerrada");
    }
}
```

**Creamos la clase que servirá como la fábrica:**

```java
//Esta es la clase fábrica, donde se crearán los archivos dependiendo del tipo
public class DocumentoFactory {

    public Documento crearDocumento(String tipo) {
        if(tipo.equalsIgnoreCase("texto"))
            return new DocumentoTexto();
        else if(tipo.equalsIgnoreCase("calculo"))
            return new HojaCalculo();
        else
            return null;
    }
}

```

## Ventajas:

- **Desacoplamiento:** El código cliente no necesita conocer las clases concretas de documentos, lo que permite una mayor flexibilidad.
- **Extensibilidad:** Puedes agregar nuevos tipos de documentos fácilmente simplemente creando nuevas clases concretas y sus respectivos creadores.

## Desventajas:

- **Complejidad:** Puede introducir una complejidad adicional al tener múltiples interfaces y clases.
- **Cantidad de Código:** En casos simples, puede parecer que estás creando más clases e interfaces de las necesarias.

## Conclusión:
El patrón Factory Simple es útil cuando necesitas desacoplar el código cliente de las clases concretas y proporcionar una forma de extender la creación de objetos sin modificar el código existente. Sin embargo, debes considerar la complejidad y el contexto de tu aplicación antes de decidir implementar este patrón.
