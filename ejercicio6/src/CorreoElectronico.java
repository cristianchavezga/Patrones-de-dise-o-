public class CorreoElectronico implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Correo Electrónico: " + mensaje);
    }
}
