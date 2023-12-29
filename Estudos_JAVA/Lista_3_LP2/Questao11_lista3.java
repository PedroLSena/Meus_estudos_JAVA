// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao11_lista3 {
   public Questao11_lista3() {
   }

   public static void main(String[] arg) {
      Scanner ler = new Scanner(System.in);
      ArrayList<Integer> valores = new ArrayList<Integer>();
      System.out.print("Digite o primeiro valor:");
      int recebedor = ler.nextInt();
      valores.add(recebedor);
      System.out.print("Digite o segundo valor:");
      recebedor = ler.nextInt();
      valores.add(recebedor);
      System.out.print("Digite o terceiro valor:");
      recebedor = ler.nextInt();
      valores.add(recebedor);
      System.out.print("Digite o quarto valor:");
      recebedor = ler.nextInt();
      valores.add(recebedor);
      System.out.print("Digite o quinto valor:");
      recebedor = ler.nextInt();
      valores.add(recebedor);

      for(int i = 0; i < valores.size(); ++i) {
         System.out.print('\n');
         System.out.print(valores.get(i));
      }

   }
}
