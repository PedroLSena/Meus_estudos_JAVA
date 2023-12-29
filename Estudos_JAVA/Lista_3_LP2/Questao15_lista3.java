import java.util.*;

public class Questao15_lista3{
    static ArrayList<String> nome =  new ArrayList<String>();
    static ArrayList<Integer> telefone = new ArrayList<Integer>();
    static ArrayList<String> email =  new ArrayList<String>();
    static ArrayList<String> endereco =  new ArrayList<String>();

    public static void pessoa ( String nm, int tl, String em, String end ) {
        nome.add(nm);
        telefone.add(tl);
        email.add(em);
        endereco.add(end);
    }

    public static void cadernoDeEnderecos(){
        for(int i = 0; i < nome.size(); i++){
            System.out.println(nome.get(i));
            System.out.println(telefone.get(i));
            System.out.println(email.get(i));
            System.out.println(endereco.get(i));
        }
    }

    public static void main(String[] arg){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua ação (0 veja a agenda, 1 adicione informações na agenda): ");
        int opc = ler.nextInt();
        ler.nextLine();

        if(opc == 0){
            cadernoDeEnderecos();
        } else if(opc == 1){
            System.out.println("Digite o nome:");
            String nm = ler.nextLine();
            System.out.println("Digite o telefone:");
            int tl = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o email:");
            String em = ler.nextLine();
            System.out.println("Digite o endereço:");
            String end = ler.nextLine();
            pessoa(nm, tl, em, end);
        } else {
            System.out.println("Erro!!");
        }

        cadernoDeEnderecos();
    }
}
