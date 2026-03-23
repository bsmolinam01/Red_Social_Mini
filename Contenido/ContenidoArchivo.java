package Contenido;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class ContenidoArchivo extends Contenido {

    private String rutaArchivo;

    public ContenidoArchivo(Usuario autor,
                            String titulo,
                            String rutaArchivo,
                            List<String> etiquetas) {
        super(autor, titulo, null, LocalDateTime.now(), etiquetas);
        this.rutaArchivo = rutaArchivo;
    }






        //TODO Auto-generated constructor stub
    





    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public String previsualizar() {
        // Para archivos solo mostramos el título / nombre del archivo
        return getTitulo();
    }

    private String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }

    @Override
    public void verCompleto() {
        System.out.println("Publicación de: " + getAutor().getNombreUsuario());
        System.out.println("Título: " + getTitulo());
        System.out.println("Archivo: " + rutaArchivo);

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop no soportado en este sistema.");
            return;
        }
        try {
            File f = new File(rutaArchivo);
            if (f.exists()) {
                Desktop.getDesktop().open(f);
            } else {
                System.out.println("El archivo no existe: " + rutaArchivo);
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        }
    }
}