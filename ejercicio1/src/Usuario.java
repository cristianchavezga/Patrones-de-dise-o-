import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Reproducible> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public void agregarAFavoritos(Reproducible contenido) {
        favoritos.add(contenido);
    }

    public void reproducirContenido() {
        for (Reproducible contenido : favoritos) {
            contenido.reproducir();
        }
    }
}
