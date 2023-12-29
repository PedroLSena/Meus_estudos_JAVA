import java.util.Scanner;

abstract class Figr {
    public abstract double calcArea();

    public void mosArea() {
        System.out.println("Área calculada: " + calcArea());
    }
}

class Crcu extends Figr {
    private double raio;

    public Crcu(double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        return Math.PI * raio * raio;
    }
}

class Qadr extends Figr {
    private double lado;

    public Qadr(double lado) {
        this.lado = lado;
    }

    public double calcArea() {
        return lado * lado;
    }
}

class Trgl extends Figr {
    private double base;
    private double alt;

    public Trgl(double base, double alt) {
        this.base = base;
        this.alt = alt;
    }

    public double calcArea() {
        return 0.5 * base * alt;
    }
}

public class Questao3_lista4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma figura para calcular a área:");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Triângulo");

        int escolha = scan.nextInt();

        Figr fig = null;

        switch (escolha) {
            case 1:
                System.out.println("Informe o raio do círculo:");
                double raio = scan.nextDouble();
                fig = new Crcu(raio);
                break;
            case 2:
                System.out.println("Informe o lado do quadrado:");
                double lado = scan.nextDouble();
                fig = new Qadr(lado);
                break;
            case 3:
                System.out.println("Informe a base do triângulo:");
                double base = scan.nextDouble();
                System.out.println("Informe a altura do triângulo:");
                double alt = scan.nextDouble();
                fig = new Trgl(base, alt);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        if (fig != null) {
            fig.mosArea();
        }

        scan.close();
    }
}
