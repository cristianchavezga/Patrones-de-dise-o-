public class Video implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en video: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en video: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo video.");
    }
}
