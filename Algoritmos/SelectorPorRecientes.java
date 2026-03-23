package Algoritmos;

import java.util.*;

import Contenido.Contenido;
import Contenido.Usuario;

/**
 * Algoritmo 2: Muestra las publicaciones ordenadas por fecha,
 * primero las más recientes.
 */
public class SelectorPorRecientes implements SelectorContenido {

    public List<Contenido> seleccionar(List<Contenido> contenidos, Usuario usuario) {
        List<Contenido> copia = new ArrayList<>(contenidos);
        
        copia.sort((c1, c2) -> 
            c2.getFechaPublicacion().compareTo(c1.getFechaPublicacion())
        );

        return copia;
    }

    @Override
    public List seleccionar(List contenidos, Object usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seleccionar'");
    }
}
