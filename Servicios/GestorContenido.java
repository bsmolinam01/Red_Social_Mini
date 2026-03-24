
package Servicios;
 import Contenido.*;
 
 import java.util.*;
 
 public class GestorContenido {
 
     private List<Contenido> contenidos = new ArrayList<>();
 
     public void addContenido(Contenido c) {
         if (c == null) return;
         contenidos.add(c);
         c.getAutor().addPublicacion(c);
     }
 
     public List<Contenido> getTodos() {
         return new ArrayList<>(contenidos);
     }
 
     public void cargarDatosIniciales(Collection<Usuario> usuarios) {
         Iterator<Usuario> it = usuarios.iterator();
         if (!it.hasNext()) {
             return;
         }
 
         Usuario u1 = it.next();
         Set<String> et1 = new HashSet<>(Arrays.asList("java", "programacion"));
         addContenido(new ContenidoTexto(u1,
                 "Bienvenido a la mini red social en consola.",
                 et1));
 
         if (!it.hasNext()) return;
         Usuario u2 = it.next();
         Set<String> et2 = new HashSet<>(Arrays.asList("foto", "viaje"));
         addContenido(new ContenidoArchivo(u2,
 "datos/foto1.jpg",   // ajusta la ruta a tus archivos de prueba
                 et2));
 
         if (!it.hasNext()) return;
         Usuario u3 = it.next();
         Set<String> et3 = new HashSet<>(Arrays.asList("musica", "archivo"));
         addContenido(new ContenidoMixto(u3,
                 "Escuchando este temazo ahora mismo.",
                 "datos/cancion.mp3", // ajusta la ruta
                 et3));
     }
 
     
 }