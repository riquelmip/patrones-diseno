# 6 - Singleton

## Problema
Imagina que estás desarrollando una aplicación y necesitas una clase que se encargue de manejar la configuración global de la aplicación, pero solo debe haber una instancia de esta clase para evitar conflictos y asegurar que todos los componentes accedan a la misma configuración.

## Solución
El patrón Singleton garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia. Esto es útil cuando se necesita una única instancia para coordinar acciones en toda la aplicación.

**Creamos la clase que implementa Singleton:**

```java
// Clase Singleton que maneja la configuración global
public class ConfiguracionGlobal {

    // Instancia única de la clase
    private static ConfiguracionGlobal instancia;

    // Atributos de configuración
    private String idioma;
    private int maximoConexiones;

    // Constructor privado para evitar instanciación directa
    private ConfiguracionGlobal() {
        // Inicialización de valores predeterminados
        this.idioma = "es";
        this.maximoConexiones = 10;
    }

    // Método estático para obtener la instancia única (lazy initialization)
    public static ConfiguracionGlobal obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    // Métodos para obtener y modificar la configuración
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getMaximoConexiones() {
        return maximoConexiones;
    }

    public void setMaximoConexiones(int maximoConexiones) {
        this.maximoConexiones = maximoConexiones;
    }
}

```

### Ventajas:

- **Instancia única:** Garantiza que solo exista una instancia de la clase, evitando conflictos de configuración.
- **Acceso global:** Proporciona un punto de acceso global a la instancia única, permitiendo a otros componentes acceder fácilmente a la configuración global.

### Desventajas:

- **Dificultad en pruebas unitarias:** Puede ser difícil realizar pruebas unitarias, ya que la instancia única puede persistir entre pruebas.

### Conclusión:

El patrón Singleton es útil cuando se necesita una única instancia de una clase para manejar la configuración global o coordinar acciones en toda la aplicación. Sin embargo, debes tener cuidado al usarlo para evitar problemas en las pruebas unitarias y asegurarte de que realmente es necesario restringir la creación de instancias a una única entidad en tu aplicación.
