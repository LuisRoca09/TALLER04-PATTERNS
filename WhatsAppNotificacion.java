public class WhatsAppNotificacion implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por WhatsApp: " + mensaje);
    }
}
