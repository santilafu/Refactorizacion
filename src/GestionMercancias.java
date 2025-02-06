/**
 *  El siguiente código es un fragmento funcional pero con margen de mejora para poder aplicar refactorización, control de versiones, documentación con JavaDoc y herramientas de integración continua. El código
 representará una gestión básica de mercancías peligrosas dentro de una compañía de transporte. Contendrá deficiencias intencionadas para la refactorización y optimización como parte de la actividad.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que gestiona las mercancías peligrosas.
 */

public class GestionMercancias {
    public static void main(String[] args) {
        SistemaTransporte sistema = new SistemaTransporte();
        sistema.agregarMercancia(new Mercancia("Químico A", "España", "Francia", 100));
        sistema.agregarMercancia(new Mercancia("Gas B", "Italia", "Alemania", 200));
        sistema.mostrarMercancias();
    }
}

/**
 * Clase que representa una mercancía peligrosa.
 */

class Mercancia {
    String nombre;
    String origen;
    String destino;
    int cantidad;

    public Mercancia(String n, String o, String d, int c) {
        this.nombre = n;
        this.origen = o;
        this.destino = d;
        this.cantidad = c;
    }

    public void mostrarInfo() {
        System.out.println("Mercancía: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad);
    }
}

/**
 * Clase que gestiona la logística de transporte.
 */

class SistemaTransporte {
    List<Mercancia> mercancias = new ArrayList<>();

    public void agregarMercancia(Mercancia m) {
        mercancias.add(m);
    }

    public void mostrarMercancias() {
        for (Mercancia m : mercancias) {
            m.mostrarInfo();
        }
    }
}