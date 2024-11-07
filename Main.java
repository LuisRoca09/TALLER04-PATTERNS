public class Main {
    public static void main(String[] args) {
        // Crear reporte con estilo y colores
        Reporte reportePDF = new ReporteConColores(new ReporteConEstilo(new ReportePDF()));
        reportePDF.generar();

        // Enviar notificación del reporte
        Notificacion notificacionEmail = new EmailNotificacion();
        GeneradorReportes generador = new GeneradorReportes();
        generador.generarYNotificarReporte("pdf", "Reporte generado y listo para revisión", notificacionEmail);
    }
}
