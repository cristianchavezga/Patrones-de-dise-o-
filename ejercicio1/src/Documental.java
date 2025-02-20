public class Documental implements Reproducible{
    private String tema;

    public Documental(String tema) {
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo documental sobre: " + tema);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando documental sobre: " + tema);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo documental sobre: " + tema);
    }
}
