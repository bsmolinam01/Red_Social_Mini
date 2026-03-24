package Contenido;

import java.time.LocalDateTime;
import java.util.Set;

public class ContenidoTexto extends Contenido {
    private String descripcion;

    

    public ContenidoTexto(Usuario autor, String tituloOTexto, String textoOArchivo, LocalDateTime fecha, String texto) {
        super(autor, tituloOTexto, textoOArchivo, fecha);
        this.descripcion = texto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreview() {
        StringBuilder sb = new StringBuilder();
        if (descripcion.length() > 50) {
            for (int i = 0; i < 50; i++) {
                char letra = descripcion.charAt(i);
                sb.append(letra);
                

            }
            return sb.toString();
        }

       return getDescripcion();
    }

    public void mostrarCompleto() {

        System.out.println("Autor: " + autor);
        System.out.println("Texto:\n" + texto);
    }
}