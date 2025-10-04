package Ej1;

public class MainFigura {
    public static void main(String[] args) {
        Figura c = new Circulo(5);
        Figura r = new Rectangulo(4, 6);
        c.mostrarArea();
        r.mostrarArea();
    }
}