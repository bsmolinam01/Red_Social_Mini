// package Modelo;
// 
// import java.util.Set;
// 
// public class ContenidoTexto extends Modelo.Usuario {
//     private String texto;
// 
//     public ContenidoTexto(Usuario autor, String texto, Set<String> etiquetas) {
//         super(autor, etiquetas);    
//         this.texto = texto;
// 
//     }
// 
//     @Override
//     public String getPreview() {
//         return texto.length() <= 50 ? texto : texto.substring(0, 50);
//     }
// 
//     @Override
//     public void mostrarCompleto() {
//         System.out.println("Autor: " + autor);
//         System.out.println("Texto:\n" + texto);
//     }
// }