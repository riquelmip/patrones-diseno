# 4 - Builder

## Problema
Imagina que estás desarrollando un videojuego y necesitas crear instancias de enemigos con configuraciones específicas, como nombre, tipo, salud, daño y resistencia. Crear enemigos directamente podría ser complejo y propenso a errores si se tienen muchas configuraciones posibles.

## Solución
Para abordar este problema, implementamos el patrón Builder. Creamos una clase Enemigo con un constructor privado y un método estático builder() que devuelve una instancia de EnemigoBuilder. Este último actúa como el builder y permite configurar las propiedades del enemigo paso a paso.

**Creamos la clase Enemigo:**

```java
public class Enemigo {
    private String nombre;
    private String tipo;
    private int salud;
    private int daño;
    private int resistencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public static EnemigoBuilder builder(){
        return new EnemigoBuilder();
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", salud=" + salud +
                ", daño=" + daño +
                ", resistencia=" + resistencia +
                '}';
    }
}

```

**Creamos el builder:**

```java
public class EnemigoBuilder {
    private String nombre;
    private String tipo;
    private int salud;
    private int daño;
    private int resistencia;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSalud() {
        return salud;
    }

    public int getDaño() {
        return daño;
    }

    public int getResistencia() {
        return resistencia;
    }

    public EnemigoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EnemigoBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public EnemigoBuilder salud(int salud) {
        this.salud = salud;
        return this;
    }

    public EnemigoBuilder daño(int daño) {
        this.daño = daño;
        return this;
    }

    public EnemigoBuilder resistencia(int resistencia) {
        this.resistencia = resistencia;
        return this;
    }

    public Enemigo build(){
        Enemigo enemigo = new Enemigo();
        enemigo.setNombre(getNombre());
        enemigo.setTipo(getTipo());
        enemigo.setSalud(getSalud());
        enemigo.setResistencia(getResistencia());
        enemigo.setDaño(getDaño());
        return enemigo;
    }
}

```

### Ventajas:

- **Facilita la construcción de objetos complejos:** Permite la construcción paso a paso de objetos complejos, facilitando la configuración de sus numerosos atributos.

- **Legibilidad del código:** Utilizar métodos encadenados (Fluent Interface) mejora la legibilidad del código al permitir llamadas secuenciales y proporcionar un flujo natural.

- **Evita constructores telescópicos:** Evita la necesidad de tener múltiples constructores con diferentes combinaciones de parámetros, evitando así el problema de constructores telescópicos.

### Desventajas:

- **Complejidad adicional:** Añade clases y métodos adicionales, lo que puede aumentar la complejidad del código, especialmente para objetos simples.

- **Requiere crear una clase Builder por cada tipo:** Para cada tipo de objeto que deseamos construir, necesitamos una clase Builder correspondiente.

### Conclusión:

El patrón Builder es útil cuando necesitas construir objetos con muchas configuraciones posibles y proporciona una interfaz limpia y fácil de usar para la construcción paso a paso. Aunque introduce complejidad adicional, sus ventajas en términos de legibilidad del código y facilidad de construcción superan las desventajas en situaciones donde la configuración es extensa y variada.
