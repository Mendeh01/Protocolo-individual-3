package Ej2;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado g = new Gerente("Camila", 2500000, 600000);
        Empleado v = new Vendedor("Sebastián", 1800000, 450000);
        g.mostrarDetalles();
        v.mostrarDetalles();
    }
}

