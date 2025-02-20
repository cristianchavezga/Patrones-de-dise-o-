public class Main {
    public static void main(String[] args) {
        Notificacion email = new CorreoElectronico();
        Notificacion sms = new SMS();
        Notificacion push = new PushNotification();

        Usuario usuario1 = new Usuario("Carlos", email);
        Usuario usuario2 = new Usuario("María", sms);
        Usuario usuario3 = new Usuario("Pedro", push);

        usuario1.recibirNotificacion("¡Tu pedido ha sido enviado!");
        usuario2.recibirNotificacion("Tienes un nuevo mensaje.");
        usuario3.recibirNotificacion("Tu cuenta ha sido actualizada.");
    }
}