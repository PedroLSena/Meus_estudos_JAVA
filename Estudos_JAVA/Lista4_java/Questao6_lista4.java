
abstract class Calc {
    public abstract double soma(double x, double y);
    public abstract double subtr(double x, double y);
    public abstract double mult(double x, double y);
    public abstract double div(double x, double y);
}

class CalcCientifica extends Calc {
    public double soma(double x, double y) {
        return x + y;
    }

    public double subtr(double x, double y) {
        return x - y;
    }

    public double mult(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {

        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Erro: divisão por zero.");
            return Double.NaN; 
        }
    }

    public double raizQuadrada(double x) {
        return Math.sqrt(x);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}

public class Questao6_lista4 {
    public static void main(String[] args) {
        
        CalcCientifica calcCientifica = new CalcCientifica();

        double resultadoSoma = calcCientifica.soma(10, 5);
        double resultadoSubtracao = calcCientifica.subtr(10, 5);
        double resultadoMultiplicacao = calcCientifica.mult(10, 5);
        double resultadoDivisao = calcCientifica.div(10, 5);

        double resultadoRaizQuadrada = calcCientifica.raizQuadrada(25);
        double resultadoPotencia = calcCientifica.potencia(2, 3);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
        System.out.println("Raiz: " + resultadoRaizQuadrada);
        System.out.println("Potencia: " + resultadoPotencia);
    }
}
