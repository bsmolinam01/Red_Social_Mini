// package PuntoEntrada;
// App.java
//import java.util.Arrays;
//import java.util.List;

/**
 * Punto de entrada de la aplicación RED_SOCIAL_MINI.
 *
 * Inicializa los datos de prueba (usuarios y contenidos)
 * y lanza el menú principal de autenticación.
 *
 * @author Brayan Stiven Molina Macías
 * @author Juan
 */
// public class App {
// 
//     private static GestorUsuarios gestorUsuarios;
//     private static GestorContenido gestorContenido;
// 
//     public static void main(String[] args) {
//         System.out.println("=== RED SOCIAL MINI v1.0 ===");
//         System.out.println("Desarrollado por Brayan Stiven Molina Macías y Juan\n");
// 
//         // Inicializar gestores singleton (ajusta si usas otra implementación)
//         gestorUsuarios = GestorUsuarios.getInstancia();
//         gestorContenido = GestorContenido.getInstancia();
// 
//         // Cargar datos de prueba
//         cargarDatosPrueba();
// 
//         // Lanzar menú principal
//         Menu menu = new Menu();
//         menu.mostrarMenuLogin();
// 
//         System.out.println("\n¡Gracias por usar RED SOCIAL MINI! 😊");
//     }
// 
//     private static void cargarDatosPrueba() {
//         System.out.println("🔄 Cargando datos de prueba...");
// 
//         // Crear usuarios de prueba
//         Usuario user1 = new Usuario("admin");
//         user1.setContrasena("1234");
//         gestorUsuarios.registrar(user1);
// 
//         Usuario user2 = new Usuario("ana");
//         user2.setContrasena("ana123");
//         gestorUsuarios.registrar(user2);
// 
//         Usuario user3 = new Usuario("bryan");
//         user3.setContrasena("bryan456");
//         gestorUsuarios.registrar(user3);
// 
//         // Contenidos de prueba variados
//         List<String> tags1 = Arrays.asList("java", "programacion");
//         ContenidoTexto post1 = new ContenidoTexto(user1,
//                 "¡Hola mundo! Aprendiendo Java para redes sociales.",
//                 tags1);
//         gestorContenido.publicar(post1);
// 
//         List<String> tags2 = Arrays.asList("gaming", "gta");
//         ContenidoMixto post2 = new ContenidoMixto(user2,
//                 "Mi partida favorita de GTA V esta semana.",
//                 "ruta/a/imagen/gta.jpg", // Usa rutas reales en tu proyecto
//                 tags2);
//         gestorContenido.publicar(post2);
// 
//         List<String> tags3 = Arrays.asList("anime", "otaku");
//         ContenidoArchivo post3 = new ContenidoArchivo(user3,
//                 "Mi wallpaper favorito de anime",
//                 "ruta/a/imagen/anime.png",
//                 tags3);
//         gestorContenido.publicar(post3);
// 
//         System.out.printf("✅ Datos cargados: %d usuarios, %d contenidos\n\n",
//                 gestorUsuarios.getUsuarios().size(),
//                 gestorContenido.getContenidos().size());
//     }
// 
//     // Getters para que Menu pueda acceder (o usa singletons)
//     public static GestorUsuarios getGestorUsuarios() {
//         return gestorUsuarios;
//     }
// 
//     public static GestorContenido getGestorContenido() {
//         return gestorContenido;
//     }
// }
// 