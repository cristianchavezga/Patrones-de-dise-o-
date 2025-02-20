public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Inception", 148);
        Serie serie = new Serie("Breaking Bad", 5);
        Documental documental = new Documental("El Universo");

        Usuario usuario = new Usuario("Juan");

        usuario.agregarAFavoritos(pelicula);
        usuario.agregarAFavoritos(serie);
        usuario.agregarAFavoritos(documental);

        System.out.println("Reproduciendo contenido favorito:");
        usuario.reproducirContenido();
    }
}