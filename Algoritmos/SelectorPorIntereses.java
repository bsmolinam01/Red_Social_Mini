package Algoritmos;


import java.util.*;

/**
 * Algoritmo 1: Prioriza publicaciones que compartan etiquetas
 * con los intereses del usuario (basado en visualizaciones previas).
 */
public class SelectorPorIntereses implements SelectorContenido {

    @Override
    public List<Contenido> seleccionar(List<Contenido> contenidos, Usuario usuario) {
        List<Contenido> copia = new ArrayList<>(contenidos);
        Set<String> intereses = usuario.getIntereses();

        copia.sort((c1, c2) -> {
            int score1 = coincidencias(c1.getEtiquetas(), intereses);
            int score2 = coincidencias(c2.getEtiquetas(), intereses);
            return Integer.compare(score2, score1); // Mayor score primero
        });

        return copia;
    }

    private int coincidencias(List<String> etiquetas, Set<String> intereses) {
        int count = 0;
        for (String etiqueta : etiquetas) {
            if (intereses.contains(etiqueta.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}
