// Superclasse Animal
class Anim {
    public void comer() {
        System.out.println("Eu estou comendo.");
    }

    public void comun() {
        System.out.println("Comunicando como um animal qualquer.");
    }

    public void andar() {
        System.out.println("Eu estou andando.");
    }
}

// Subclasses
class Leao extends Anim {
    public void comun() {
        System.out.println("Rugindo como um leão.");
    }
}

class Cachorro extends Anim {
    public void comun() {
        System.out.println("Latindo como um cachorro.");
    }
}

class Gato extends Anim {
    public void comun() {
        System.out.println("Miando como um gato.");
    }
}

class Tigre extends Anim {
    public void comun() {
        System.out.println("Rugindo como um tigre.");
    }
}

class Hipo extends Anim {
    public void comun() {
        System.out.println("Murmurando como um hipopotamo.");
    }
}

// Classe Zoo
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao zoológico!");

        while (true) {
            System.out.println("Escolha um animal:");
            System.out.println("1. Leão");
            System.out.println("2. Cachorro");
            System.out.println("3. Gato");
            System.out.println("4. Tigre");
            System.out.println("5. Hipopótamo");
            System.out.println("0. Sair");

            int escolha = scan.nextInt();

            if (escolha == 0) {
                System.out.println("Obrigado por visitar o zoológico ");
                break;
            }

            Anim ani = null;

            switch (escolha) {
                case 1:
                    ani = new Leao();
                    break;
                case 2:
                    ani = new Cachorro();
                    break;
                case 3:
                    ani = new Gato();
                    break;
                case 4:
                    ani = new Tigre();
                    break;
                case 5:
                    ani = new Hipo();
                    break;
                default:
                    System.out.println("Escolha inválida");
                    continue;
            }

            System.out.println("Informações do animal:");
            ani.andar();
            ani.comer();
            ani.comun();
        }

        scan.close();
    }
}
