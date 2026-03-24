package Algoritmos;
import java.util.List;

/**
 * Interfaz que define el contrato para todos los algoritmos
 * de selección y ordenación de contenidos.
 *
 * Permite implementar el patrón Strategy para cambiar dinámicamente
 * cómo se ordena el feed de un usuario.
 *
 * @author Brayan Stiven Molina Macías
 * @param <Usuario>
 * @param <Contenido>

 */
public interface SelectorContenido<Usuario, Contenido> {

    /**
     * Selecciona y ordena los contenidos según el criterio específico del algoritmo.
     *
     * @param contenidos Lista completa de todas las publicaciones disponibles en la plataforma.
     * @param usuario Usuario para el que se genera el feed personalizado.
     * @return Lista ordenada de contenidos priorizados para el usuario.
     */
    List<Contenido> seleccionar(List<Contenido> contenidos, Usuario usuario);

    /**
     * Nombre descriptivo del algoritmo para mostrar en la configuración.
     */
    default String getNombre() {
        return this.getClass().getSimpleName().replace("Selector", "").toLowerCase();
    }


}
