//  package Contenido;
//  
//  import java.util.Set;
//  
//  public class ContenidoTexto extends Contenido.Usuario {
//      private String texto;
//  
//      public ContenidoTexto(Usuario u1, String texto, Set<String> etiquetas) {
//          super(u1, etiquetas);    
//          this.texto = texto;
//  
//      }
//  
//      public String getPreview() {
//          return texto.length() <= 50 ? texto : texto.substring(0, 50);
//      }
//  
//      public void mostrarCompleto() {
//          
//          System.out.println("Autor: " + autor);
//          System.out.println("Texto:\n" + texto);
//      }
//  }