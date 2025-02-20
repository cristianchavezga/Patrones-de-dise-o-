public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Foto foto = new Foto();
        Video video = new Video();
        Articulo articulo = new Articulo();

        System.out.println("Interacciones en red social:");
        usuario.interactuar(foto, "¡Hermosa foto!", "Me encanta");
        usuario.interactuar(video, "Muy buen video!", "Me gusta");
        usuario.interactuar(articulo, "Interesante artículo", "Me encanta");
    }
}