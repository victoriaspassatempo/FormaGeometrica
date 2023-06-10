package teste;

import exception.FormaGeometricaException;
import impl.Circulo;
import impl.Retangulo;
import impl.Triangulo;

public class TesteFormaGeometrica {
    public static void main(String[] args) {

        try {
            Circulo circulo = new Circulo(-5);
            circulo.imprime();
        } catch (FormaGeometricaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Triangulo triangulo = new Triangulo(5, 6, 5);
            triangulo.imprime();
        } catch (FormaGeometricaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Retangulo retangulo = new Retangulo(5, 5);
            retangulo.imprime();
            System.out.println("----------------");
            Retangulo retangulo1 = new Retangulo(0,5);
            retangulo1.imprime();
        } catch (FormaGeometricaException e) {
            System.out.println("Erro: " + e.getMessage());
        }




    }
}

