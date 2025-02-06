/**
 * El siguiente código es un fragmento funcional pero con margen de mejora para poder aplicar refactorización, control de versiones, documentación con JavaDoc y herramientas de integración continua. El código
 * representará una gestión básica de mercancías peligrosas dentro de una compañía de transporte. Contendrá deficiencias intencionadas para la refactorización y optimización como parte de la actividad.
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
    private static int contadorId = 1; // Contador para IDs únicos
    private int id;
    private String nombre;
    private String origen;
    private String destino;
    private int cantidad;

    /**
     * Constructor de la clase Mercancia.
     *
     * @param nombre   Nombre de la mercancía.
     * @param origen   Lugar de origen.
     * @param destino  Lugar de destino.
     * @param cantidad Cantidad de mercancía.
     */
    public Mercancia(String nombre, String origen, String destino, int cantidad) {
        this.id = contadorId++; // Asigna un ID único
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Devuelve la información de la mercancía en un formato legible.
     *
     * @return Información de la mercancía.
     */
    public String obtenerInformacion() {
        return "ID: " + id + " | Mercancía: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad;
    }
}

/**
 * Clase que gestiona la logística de transporte.
 */
class SistemaTransporte {
    private List<Mercancia> mercancias = new ArrayList<>();

    /**
     * Agrega una nueva mercancía a la lista.
     *
     * @param mercancia Objeto Mercancia a agregar.
     */
    public void agregarMercancia(Mercancia mercancia) {
        mercancias.add(mercancia);
    }

    /**
     * Muestra todas las mercancías registradas.
     */
    public void mostrarMercancias() {
        if (mercancias.isEmpty()) {
            System.out.println("No hay mercancías registradas.");
        } else {
            for (Mercancia m : mercancias) {
                System.out.println(m.obtenerInformacion());
            }
        }
    }
}
