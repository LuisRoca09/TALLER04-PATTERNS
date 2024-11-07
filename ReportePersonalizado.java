public class ReportePersonalizado {
    private String fuente;
    private String color;
    private String estilo;

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void mostrarPersonalizacion() {
        System.out.println("Personalización del reporte:");
        System.out.println("Fuente: " + fuente);
        System.out.println("Color: " + color);
        System.out.println("Estilo: " + estilo);
    }
}
