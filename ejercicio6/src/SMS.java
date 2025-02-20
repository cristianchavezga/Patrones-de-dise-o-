public class SMS implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}
