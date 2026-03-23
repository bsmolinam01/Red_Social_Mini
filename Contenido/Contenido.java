package Contenido;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Contenido {
    private static int contadorId = 1;
    
    protected int id;
    protected Usuario autor;
    protected String titulo;
    protected String texto;
    protected LocalDateTime fechaPublicacion;
    protected List<String> etiquetas;

    // Constructor flexible para todos los tipos
    public Contenido(Usuario autor, String tituloOTexto, String textoOArchivo, 
                     LocalDateTime fecha, List<String> etiquetas) {
        this.id = contadorId++;
        this.autor = autor;
        
        // Lógica para distinguir título/texto vs ruta archivo
        if (textoOArchivo != null && !textoOArchivo.isEmpty() && 
            !textoOArchivo.startsWith("ruta/")) {
            // Si no parece ruta de archivo, es texto
            this.texto = textoOArchivo;
            this.titulo = tituloOTexto;
        } else {
            // Es archivo
            this.titulo = tituloOTexto;
            this.texto = null;
        }
        
        this.fechaPublicacion = (fecha != null) ? fecha : LocalDateTime.now();
        this.etiquetas = etiquetas;
    }

    // Getters obligatorios
    public Usuario getAutor() { return autor; }
    public LocalDateTime getFechaPublicacion() { return fechaPublicacion; }
    public List<String> getEtiquetas() { return etiquetas; }
    public String getTexto() { return texto; }
    
    // Métodos abstractos
    public abstract String previsualizar();
    public abstract void verCompleto();
    public class Usuario {

        public String getNombreUsuario() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getNombreUsuario'");
        }

        public void addPublicacion(Contenido c) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'addPublicacion'");
        }
    }
}
