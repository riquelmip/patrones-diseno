package patrones.creacionales.abstractFactory.clases;

import patrones.creacionales.abstractFactory.interfaces.FabricaMuebles;
import patrones.creacionales.abstractFactory.interfaces.Mesa;
import patrones.creacionales.abstractFactory.interfaces.Silla;

// Implementación de la fábrica abstracta para muebles clásicos
public class FabricaMueblesClasicos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }
}