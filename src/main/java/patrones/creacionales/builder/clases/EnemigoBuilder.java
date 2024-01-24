package patrones.creacionales.builder.clases;

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
