package Ej3B;

public class ReporteVentas extends Reporte {
    private double subtotal;
    private double impuestos;

    public ReporteVentas(double subtotal, double impuestos) {
        this.subtotal = subtotal;
        this.impuestos = impuestos;
    }
}

