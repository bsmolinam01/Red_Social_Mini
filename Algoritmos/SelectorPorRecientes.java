package Algoritmos;

import java.util.*;

/**
 * Algoritmo 2: Muestra las publicaciones ordenadas por fecha,
 * primero las más recientes.
 */
public class SelectorPorRecientes implements SelectorContenido {

    @Override
    public List<Contenido> seleccionar(List<Contenido> contenidos, Usuario usuario) {
        List<Contenido> copia = new ArrayList<>(contenidos);
        
        copia.sort((c1, c2) -> 
            c2.getFechaPublicacion().compareTo(c1.getFechaPublicacion())
        );

        return copia;
    }
}
