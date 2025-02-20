public class Articulo implements Interactuable{
    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en artículo: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción en artículo: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo artículo.");
    }
}
