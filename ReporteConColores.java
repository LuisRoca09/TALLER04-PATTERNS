public class ReporteConColores extends ReporteDecorador {
    public ReporteConColores(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Aplicando colores personalizados al reporte.");
    }
}
