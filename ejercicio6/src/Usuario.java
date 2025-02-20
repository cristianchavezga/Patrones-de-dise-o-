public class Usuario {
    private String nombre;
    private Notificacion metodoNotificacion;

    public Usuario(String nombre, Notificacion metodoNotificacion) {
        this.nombre = nombre;
        this.metodoNotificacion = metodoNotificacion;
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println(nombre + " ha recibido una notificación:");
        metodoNotificacion.enviarMensaje(mensaje);
    }
}
