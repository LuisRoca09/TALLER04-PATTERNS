public abstract class ReporteDecorador implements Reporte {
    protected Reporte reporte;

    public ReporteDecorador(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void generar() {
        reporte.generar();
    }
}

