package Ej2;

public class Vendedor extends Empleado {
    private double base;
    private double comision;

    public Vendedor(String nombre, double base, double comision) {
        super(nombre);
        this.base = base;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return base + comision;
    }
}

