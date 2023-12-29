import java.util.Scanner;

class Anim {
    public void cmr() {
        System.out.println("Eu estou comendo.");
    }

    public void cmncr() {
        System.out.println("Fazendo sons genéricos.");
    }

    public void andr() {
        System.out.println("Eu estou andando.");
    }
}

class Leao extends Anim {
    public void cmncr() {
        System.out.println("Rugindo como um leão.");
    }
}

class Cachorro extends Anim {
    public void cmncr() {
        System.out.println("Latindo como um cachorro.");
    }
}

class Gato extends Anim {
    public void cmncr() {
        System.out.println("Miando como um gato.");
    }
}

class Tigre extends Anim {
    public void cmncr() {
        System.out.println("Rugindo como um tigre.");
    }
}

class Hipo extends Anim {
    public void cmncr() {
        System.out.println("Bufando como um hipopótamo.");
    }
}

public class Questao4_lista4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao zoológico!");

        Anim[] anmls = new Anim[5];
        anmls[0] = new Leao();
        anmls[1] = new Cachorro();
        anmls[2] = new Gato();
        anmls[3] = new Tigre();
        anmls[4] = new Hipo();

        while (true) {
            System.out.println("\nEscolha um animal para interagir (1 a 5) ou 0 para sair:");
            for (int i = 0; i < anmls.length; i++) {
                System.out.println((i + 1) + ". " + anmls[i].getClass().getSimpleName());
            }

            int escolha = scan.nextInt();

            if (escolha == 0) {
                System.out.println("Obrigado por visitar o Zoológico");
                break;
            }

            if (escolha >= 1 && escolha <= anmls.length) {
                Anim animalEscolhido = anmls[escolha - 1];

                System.out.println("Informações do animal escolhido:");
                animalEscolhido.andr();
                animalEscolhido.cmr();
                animalEscolhido.cmncr();
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        scan.close();
    }
}
