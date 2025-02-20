public class Foto implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en foto: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en foto: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo foto.");
    }
}
