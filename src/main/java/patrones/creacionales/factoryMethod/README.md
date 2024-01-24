# 2 - Factory Method

Imagina que estás desarrollando un sistema de creación de documentos y deseas implementar un mecanismo que permita crear diferentes tipos de documentos, como hojas de cálculo, presentaciones y documentos de texto.

## Problema
Necesitas una solución flexible y extensible para la creación de distintos tipos de documentos sin acoplar tu código a clases específicas de documentos.

### Uso del Patrón Factory Method
Utilizaremos el patrón Factory Method para posibilitar la creación de diversos tipos de documentos sin especificar las clases concretas en el código cliente.

## Solución

**Creamos dos interfaces:**

```java
// Interfaz Documento que define las operaciones comunes para todos los documentos.
public interface DocumentoFM {
    void abrir();
    void cerrar();
}

// La interfaz Creator define el método factory que las subclases implementarán.
public interface CreadorDocumentos {
    DocumentoFM crearDocumento();
}
```


**Creamos las implementaciones de las interfaces:**

```java
// Implementación de la interfaz Documento para un documento de texto.
public class DocumentoTexto implements DocumentoFM {
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
public class HojaCalculo implements DocumentoFM {
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

**Creamos las clases que servirán como creadoras de documentos:**

```java
// Implementación de la interfaz Creator para crear documentos de texto.
public class CreadorDocumentoTexto implements CreadorDocumentos {
    @Override
    public DocumentoFM crearDocumento() {
        return new DocumentoTexto();
    }
}

// Implementación de la interfaz Creator para crear hojas de cálculo.
public class CreadorHojaCalculo implements CreadorDocumentos {
    @Override
    public DocumentoFM crearDocumento() {
        return new HojaCalculo();
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
El patrón Factory Method es útil cuando necesitas desacoplar el código cliente de las clases concretas y proporcionar una forma de extender la creación de objetos sin modificar el código existente. Sin embargo, debes considerar la complejidad y el contexto de tu aplicación antes de decidir implementar este patrón.
