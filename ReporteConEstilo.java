public class ReporteConEstilo extends ReporteDecorador {
    public ReporteConEstilo(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void generar() {
        super.generar();
        System.out.println("Aplicando estilos personalizados al reporte.");
    }
}
