package Contenido;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
