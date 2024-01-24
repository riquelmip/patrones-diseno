package patrones.creacionales.singleton;

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
