// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao5_lista3 {
   public Questao5_lista3() {
   }

   public static void main(String[] arg) {
      Scanner ler = new Scanner(System.in);
      ArrayList<Integer> salario = new ArrayList();
      int contador = 0;
      System.out.println("digite o valor do ajuste(Sem a porcentagem);");
      int ajuste = ler.nextInt();
      System.out.println("digite se o ajuste \u00e9 negativo ou positivo('p' para positivo e 'n' para negativo):");
      char PosNe = ler.next().charAt(0);

      int ValSal;
      do {
         System.out.println("Digite o valor do salario: (digite -1 para sair)");
         ValSal = ler.nextInt();
         if (PosNe == 'p') {
            if (ValSal != -1) {
               salario.add(ValSal + ajuste * ValSal / 100);
            }
         } else if (PosNe == 'n') {
            if (ValSal != -1) {
               salario.add(ValSal - ajuste * ValSal / 100);
            }
         } else {
            System.out.println("Erro!!");
         }
      } while(ValSal != -1);

      System.out.println("salarios: " + String.valueOf(salario));
   }
}
