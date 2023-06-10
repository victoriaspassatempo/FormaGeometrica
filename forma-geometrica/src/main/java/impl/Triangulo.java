package impl;

import Abstract.FormaGeometrica;
import exception.FormaGeometricaException;

import static exception.FormaGeometricaException.*;

public class Triangulo extends FormaGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) throws FormaGeometricaException {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new FormaGeometricaException(PARAMETRO_TRIANGULO_MENOR);
        }
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new FormaGeometricaException(PARAMETRO_INVALIDO_TRIANGULO_INVALIDO);
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public double area() {
        double semiPerimetro = calcularPerimetro() / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) *
                (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        return area;
    }

    @Override
    public void imprime() {
        System.out.println("\nInformações Triângulo:");
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Lado C: " + ladoC);
        System.out.printf("Area: %.2f\n", area());
    }
}
