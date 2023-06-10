package impl;

import Abstract.FormaGeometrica;
import exception.FormaGeometricaException;

import static exception.FormaGeometricaException.PARAMETRO_INVALIDO_RAIO;

public class Circulo extends FormaGeometrica {
    private double raio;


    public void setRaio(double raio) throws FormaGeometricaException {
        if (raio <= 0) {
            throw new FormaGeometricaException(PARAMETRO_INVALIDO_RAIO);
        }
        this.raio = raio;
    }

    public Circulo(double raio) throws FormaGeometricaException {
        setRaio(raio);
    }

    public double area() {
        return (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public void imprime() {
        System.out.println("Informações Circulo");
        System.out.printf("Area: %.2f\n", area());
    }
}
