public class GeneradorReportes {
    public void generarYNotificarReporte(String tipo, String mensajeNotificacion, Notificacion notificacion) {
        Reporte reporte = FabricaDeReportes.crearReporte(tipo);
        reporte.generar();
        new NotificacionAdaptador(notificacion).enviar(mensajeNotificacion);
    }
}
