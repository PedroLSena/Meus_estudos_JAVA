
abstract class Veiculo {
    public abstract float acel(float veloc);
    public abstract void par();
}


class Bici extends Veiculo {
    private float velAtual;

    public float acel(float veloc) {

        velAtual += veloc;
        return velAtual;
    }

    public void par() {
        velAtual = 0;
        System.out.println("Bicicleta parada.");
    }
}

class Auto extends Veiculo {
    private float velAtual;

    public float acel(float veloc) {

        velAtual += veloc;
        return velAtual;
    }

    public void par() {
        velAtual = 0;
        System.out.println("Veiculo parado.");
    }

    public void mudarOleo(float litros) {
        System.out.println("Troca de óleo realizada com " + litros + " litros de óleo.");
    }
}

public class Questao7_lista4 {
    public static void main(String[] args) {
        Bici bicicleta = new Bici();
        bicicleta.acel(10);
        System.out.println("Velocidade da bicicleta: " + bicicleta.acel(5));
        bicicleta.par();

        System.out.println();

        Auto automovel = new Auto();
        automovel.acel(30);
        System.out.println("Velocidade do veiculo: " + automovel.acel(20));
        automovel.par();
        automovel.mudarOleo(2.0f);
    }
}
