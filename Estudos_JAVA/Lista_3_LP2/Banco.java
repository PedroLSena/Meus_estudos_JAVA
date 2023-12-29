import java.util.*;

public class Banco {

    public static int Sacar(int valorConta) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar:");
        int valSaq = ler.nextInt();
        valSaq = valorConta - valSaq;
        return valSaq;
    }

    public static int Depositar(int valorConta) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar:");
        int valDep = ler.nextInt();
        valDep = valorConta + valDep;
        return valDep;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valCont = 0;

        int opc;
        do {
            System.out.println("Escolha uma operação para ser realizada (0 para sacar, 1 para depositar, 3 para sair):");
            opc = ler.nextInt();

            if (opc == 0) {
                valCont = Banco.Sacar(valCont);
                System.out.println("Saldo após saque: " + valCont);
            } else if (opc == 1) {
                valCont = Banco.Depositar(valCont);
                System.out.println("Saldo após depósito: " + valCont);
            }

        } while (opc != 3);
    }
}
