public class FabricaDeReportes {
    public static Reporte crearReporte(String tipo) {
        switch (tipo) {
            case "PDF":
                return new ReportePDF();
            case "Excel":
                return new ReporteEXCEL();
            case "Word":
                return new ReporteWORD();
            default:
                throw new IllegalArgumentException("Formato de reporte no válido");
        }
    }
}
