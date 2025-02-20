public class Pelicula implements Reproducible{
    private String titulo;
    private int duracion; // en minutos

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando película: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo película: " + titulo);
    }
}
