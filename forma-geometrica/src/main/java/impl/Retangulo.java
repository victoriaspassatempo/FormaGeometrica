package impl;

import Abstract.FormaGeometrica;
import exception.FormaGeometricaException;

import static exception.FormaGeometricaException.*;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) throws FormaGeometricaException {
        super.setLados(4);
            setBase(base);
            setAltura(altura);

    }

    public void setBase(double base) throws FormaGeometricaException {
        if (base <= 0) {
            throw new FormaGeometricaException(PARAMETRO_INVALIDO_BASE_RETANGULO);
        }
        this.base = base;
    }

    public void setAltura(double altura) throws FormaGeometricaException {
        if (altura <= 0) {
            throw new FormaGeometricaException(PARAMETRO_INVALIDO_ALTURA_RETANGULO);
        }
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    @Override
    public void imprime() {
        System.out.println("\nInformações Retangulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Area: %.2f\n", area());
    }
}
