

import Contenido.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GestorUsuarios {

    // clave: nombre de usuario
    private Map<String, Usuario> usuarios = new HashMap<>();

    public GestorUsuarios() {
        cargarDatosIniciales();
    }

    public Usuario registrar(String nombreUsuario, String password) {
        if (usuarios.containsKey(nombreUsuario)) {
            return null; // ya existe
        }
        Usuario u = new Usuario(nombreUsuario);
        usuarios.put(nombreUsuario, u);
        return u;
    }

    public Usuario login(String nombreUsuario, String password) {
        Usuario u = usuarios.get(nombreUsuario);
        if (u != null && u.comprobarPassword(password)) {
            return u;
        }
        return null;
    }

    public Collection<Usuario> getTodos() {
        return usuarios.values();
    }

    public Usuario buscarPorNombre(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }

    private void cargarDatosIniciales() {
        // Usuarios de prueba
        Usuario alice = registrar("alice", "1234");
        Usuario bob   = registrar("bob", "1234");
        Usuario carol = registrar("carol", "1234");

        // Relaciones de seguimiento iniciales
        alice.seguir(bob);
        bob.seguir(alice);
        carol.seguir(alice);
    }
}