public class ReporteBuilder {
    private ReportePersonalizado reporte;

    public ReporteBuilder() {
        this.reporte = new ReportePersonalizado();
    }

    public ReporteBuilder aplicarFuente(String fuente) {
        reporte.setFuente(fuente);
        return this;
    }

    public ReporteBuilder aplicarColor(String color) {
        reporte.setColor(color);
        return this;
    }

    public ReporteBuilder aplicarEstilo(String estilo) {
        reporte.setEstilo(estilo);
        return this;
    }

    public ReportePersonalizado construir() {
        return reporte;
    }
}
