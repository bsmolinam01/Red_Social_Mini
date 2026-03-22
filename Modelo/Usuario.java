// Usuario.java
// import java.util.*;
// import java.time.LocalDateTime;
/**
@author("Brayan Stiven Molina Macías")
 */

// public class Usuario {
//     private String nombreUsuario;
//     private String contrasena;
//     private Set<String> intereses; // Etiquetas de interés basadas en visualizaciones
//     private Set<Usuario> seguidos;
//     private List<Contenido> publicaciones;
// 
//     public Usuario(String nombreUsuario) {
//         this.nombreUsuario = nombreUsuario;
//         this.contrasena = ""; // Se setea al crear
//         this.intereses = new HashSet<>();
//         this.seguidos = new HashSet<>();
//         this.publicaciones = new ArrayList<>();
//     }
// 
//     // Getters y setters
//     public String getNombreUsuario() { return nombreUsuario; }
//     public void setContrasena(String contrasena) { this.contrasena = contrasena; }
//     public Set<String> getIntereses() { return intereses; }
//     public Set<Usuario> getSeguidos() { return seguidos; }
//     public List<Contenido> getPublicaciones() { return publicaciones; }
// 
//     public void agregarInteres(String etiqueta) {
//         intereses.add(etiqueta);
//     }
// 
//     public void seguirUsuario(Usuario otro) {
//         seguidos.add(otro);
//     }
// 
//     public boolean verificaContrasena(String pass) {
//         return contrasena.equals(pass);
//     }
// 
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Usuario usuario = (Usuario) o;
//         return nombreUsuario.equals(usuario.nombreUsuario);
//     }
// 
//     @Override
//     public int hashCode() {
//         return Objects.hash(nombreUsuario);
//     }
// }
// 