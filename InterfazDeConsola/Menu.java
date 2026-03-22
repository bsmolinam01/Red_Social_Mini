// Menu.java
//   import java.util.Scanner;
//   /** 
//   @author("Brayan Stiven Molina Macías")
//   */
//   
//   public class Menu {
//       private Scanner scanner;
//       private Usuario usuarioActual;
//       private SelectorPorIntereses selector;
//   
//       public Menu() {
//           scanner = new Scanner(System.in);
//           selector = new SelectorPorIntereses(); // Por defecto
//       }
//   
//       public void mostrarMenuLogin() {
//           System.out.println("=== RED SOCIAL MINI ===");
//           System.out.println("1. Registrarse");
//           System.out.println("2. Iniciar sesión");
//           System.out.print("Opción: ");
//           int opcion = scanner.nextInt();
//           scanner.nextLine(); // Limpiar buffer
//   
//           switch (opcion) {
//               case 1:
//                   registrarUsuario();
//                   break;
//               case 2:
//                   if (iniciarSesion()) {
//                       mostrarMenuPrincipal();
//                   }
//                   break;
//               default:
//                   System.out.println("Opción inválida.");
//           }
//       }
//   
//       private void registrarUsuario() {
//           System.out.print("Nombre de usuario: ");
//           String nombre = scanner.nextLine();
//           System.out.print("Contraseña: ");
//           String contrasena = scanner.nextLine();
//           // Aquí se crearía el usuario en el sistema (Servicios.gestorUsuarios.registrar(nombre, contrasena))
//           System.out.println("Usuario registrado exitosamente.");
//       }
//   
//       private boolean iniciarSesion() {
//           System.out.print("Nombre de usuario: ");
//           String nombre = scanner.nextLine();
//           System.out.print("Contraseña: ");
//           String contrasena = scanner.nextLine();
//           // usuarioActual = Servicios.gestorUsuarios.login(nombre, contrasena);
//           // Simulando login exitoso
//           usuarioActual = new Usuario(nombre);
//           return true;
//       }
//   
//       private void mostrarMenuPrincipal() {
//           int opcion;
//           do {
//               System.out.println("\n=== MENÚ PRINCIPAL ===");
//               System.out.println("1. Ver contenido");
//               System.out.println("2. Crear contenido");
//               System.out.println("3. Configuración");
//               System.out.println("4. Cerrar sesión");
//               System.out.print("Opción: ");
//               opcion = scanner.nextInt();
//               scanner.nextLine();
//   
//               switch (opcion) {
//                   case 1:
//                       verContenido();
//                       break;
//                   case 2:
//                       crearContenido();
//                       break;
//                   case 3:
//                       configuracion();
//                       break;
//                   case 4:
//                       System.out.println("Sesión cerrada.");
//                       usuarioActual = null;
//                       break;
//                   default:
//                       System.out.println("Opción inválida.");
//               }
//           } while (opcion != 4);
//       }
//   
//       private void verContenido() {
//           // Lista de contenidos ordenada por el selector actual
//           // List<Contenido> contenidos = selector.seleccionar(/* lista global */, usuarioActual);
//           System.out.println("Lista de publicaciones (previsualización):");
//           // Mostrar previsualizaciones (primeros 50 chars o nombre archivo)
//           // Luego seleccionar una para ver completa o seguir usuario
//           System.out.println("Contenido mostrado con algoritmo: " + selector.getClass().getSimpleName());
//       }
//   
//       private void crearContenido() {
//           System.out.print("Texto (opcional): ");
//           String texto = scanner.nextLine();
//           System.out.print("Ruta archivo (opcional): ");
//           String rutaArchivo = scanner.nextLine();
//           System.out.print("Etiquetas (separadas por coma): ");
//           String etiquetasStr = scanner.nextLine();
//           String[] etiquetas = etiquetasStr.split(",");
//           // Crear Contenido y agregarlo via Servicios.gestorContenido.publicar(usuarioActual, texto, rutaArchivo, etiquetas)
//           System.out.println("Contenido publicado.");
//       }
//   
//       private void configuracion() {
//           System.out.println("1. Selección por intereses");
//           System.out.println("2. Selección por reciente");
//           System.out.println("3. Selección por seguidos");
//           System.out.print("Elegir algoritmo: ");
//           int alg = scanner.nextInt();
//           scanner.nextLine();
//           switch (alg) {
//               case 1:
//                   selector = new SelectorPorIntereses();
//                   break;
//               case 2:
//                   selector = new SelectorPorRecientes();
//                   break;
//               case 3:
//                   selector = new SelectorPorSeguidos();
//                   break;
//           }
//           System.out.println("Algoritmo cambiado.");
//       }
//   }
//   