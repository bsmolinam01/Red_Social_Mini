package Algoritmos;

import java.util.*;

/**
 * Algoritmo 3: Prioriza publicaciones de usuarios que el usuario actual sigue.
 */
public class SelectorPorSeguidos implements SelectorContenido {

    @Override
    public List<Contenido> seleccionar(List<Contenido> contenidos, Usuario usuario) {
        List<Contenido> seguidosPrimero = new ArrayList<>();
        List<Contenido> resto = new ArrayList<>();

        Set<Usuario> usuariosSeguidos = usuario.getSeguidos();

        for (Contenido contenido : contenidos) {
            if (usuariosSeguidos.contains(contenido.getAutor())) {
                seguidosPrimero.add(contenido);
            } else {
                resto.add(contenido);
            }
        }

        // Combinar: seguidos primero, luego resto
        seguidosPrimero.addAll(resto);
        return seguidosPrimero;
    }
}