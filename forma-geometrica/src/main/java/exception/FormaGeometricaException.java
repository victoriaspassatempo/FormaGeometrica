package exception;

public class FormaGeometricaException extends  Exception{
    public static final String PARAMETRO_INVALIDO_RAIO = "O raio deve ser maior que zero.";
    public static final String PARAMETRO_TRIANGULO_MENOR= "Os lados do triângulo devem ser maiores que zero.";
    public static final String PARAMETRO_INVALIDO_TRIANGULO_INVALIDO = "Os lados não formam um triângulo válido..";
    public static final String PARAMETRO_INVALIDO_BASE_RETANGULO = "A base do retângulo deve ser maior que zero.";
    public static final String PARAMETRO_INVALIDO_ALTURA_RETANGULO = "A altura do retângulo deve ser maior que zero.";

    public FormaGeometricaException (String message){
        super(message);
    }
}
