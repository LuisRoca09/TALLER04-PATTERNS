public class NotificacionAdaptador {
    private Notificacion notificacion;

    public NotificacionAdaptador(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}
