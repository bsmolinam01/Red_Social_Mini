package Contenido;

<<<<<<< HEAD
import java.util.Set;

public class ContenidoTexto extends Contenido {

    private String texto;

    public ContenidoTexto(Usuario u1, String texto, Set<String> etiquetas) {
        super(u1, etiquetas);
        this.texto = texto;
    }

    public String getPreview() {
        return texto.length() <= 50 ? texto : texto.substring(0, 50);
    }

    public void mostrarCompleto() {
        System.out.println("Autor: " + getAutor().getNombreUsuario());
        System.out.println("Texto:\n" + texto);
    }

    @Override
    public String previsualizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'previsualizar'");
    }

    @Override
    public void verCompleto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verCompleto'");
    }
}
=======
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
>>>>>>> featured_Juan
