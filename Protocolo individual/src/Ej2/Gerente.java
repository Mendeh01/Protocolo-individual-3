package Ej2;

public class Gerente extends Empleado {
    private double base;
    private double bono;

    public Gerente(String nombre, double base, double bono) {
        super(nombre);
        this.base = base;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return base + bono;
    }
}

