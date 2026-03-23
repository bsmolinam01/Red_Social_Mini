package Contenido;

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
