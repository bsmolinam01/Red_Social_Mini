package Contenido;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Contenido {
    private static int contadorId = 1;
    
    protected int id;
    protected Usuario autor;
    protected String titulo;
    protected String texto;
    protected LocalDateTime fechaPublicacion;
    protected List<Etiqueta> etiquetas;

    // Constructor flexible para todos los tipos
    public Contenido(Usuario autor, String tituloOTexto, String textoOArchivo, 
                     LocalDateTime fecha) {
        this.autor = autor;
        this.titulo = tituloOTexto;
        this.texto = textoOArchivo;
        this.fechaPublicacion = fecha;
        this.etiquetas = new ArrayList<>();

    }

    public void agregarEtiqueta(Etiqueta etiqueta){
        etiquetas.add(etiqueta);
     }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Contenido.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

<<<<<<< HEAD
    public Contenido(Usuario u1, Set<String> etiquetas2) {
        //TODO Auto-generated constructor stub
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

        public Usuario(Usuario u1, Set<String> etiquetas) {
            //TODO Auto-generated constructor stub
        }

        public String getNombreUsuario() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getNombreUsuario'");
        }

        public void addPublicacion(Contenido c) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'addPublicacion'");
        }
=======
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
>>>>>>> featured_Juan
    }
}
