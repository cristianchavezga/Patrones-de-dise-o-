public class PushNotification implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación Push: " + mensaje);
    }
}
