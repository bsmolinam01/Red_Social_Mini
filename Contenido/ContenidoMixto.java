package Contenido;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class ContenidoMixto extends Contenido {

    private String rutaArchivo;

    public ContenidoMixto(Usuario autor,
                          String texto,
                          String rutaArchivo,
                          List<String> etiquetas) {
        super(autor, null, texto, LocalDateTime.now(), etiquetas);
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public String previsualizar() {
        String t = getTexto();
        if (t == null) {
            return "(sin texto)";
        }
        if (t.length() <= 50) {
            return t;
        }
        return t.substring(0, 50) + "...";
    }

    @Override
    public void verCompleto() {
        System.out.println("Publicación de: " + getAutor().getNombreUsuario());
        System.out.println("Texto:");
        System.out.println(getTexto());
        System.out.println("\nArchivo asociado: " + rutaArchivo);

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