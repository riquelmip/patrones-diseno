package patrones.creacionales.abstractFactory.interfaces;

// Interfaz para la fábrica abstracta de muebles
public interface FabricaMuebles {
    Silla crearSilla();
    Mesa crearMesa();
}