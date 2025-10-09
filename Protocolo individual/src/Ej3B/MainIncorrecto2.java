package Ej3B;

public class MainIncorrecto2 {
    public static void main(String[] args) {
        Reporte r1 = new ReporteVentas(1000000, 190000);
        Reporte r2 = new ReporteServicios(20, 80000);
        System.out.println(r1.calcularTotal());
        System.out.println(r2.calcularTotal());
    }
}

//Este bloque compila y corre, pero siempre imprime 0.0
// porque calcularTotal() no obliga a las subclases a implementar su propia lógica