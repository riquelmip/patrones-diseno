package patrones.creacionales.prototype.clases;

import patrones.creacionales.prototype.interfaces.Prototype;

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