// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.Scanner;

public class Questao4_lista3 {
   public Questao4_lista3() {
   }

   public static void main(String[] arg) {
      Scanner ler = new Scanner(System.in);
      System.out.println("Digite o numero de nottas que sera lido: ");
      int val = ler.nextInt();
      int[] nota = new int[val];
      int contador = 0;

      int i;
      for(i = 0; i < val; ++i) {
         System.out.print("Digite a nota " + i + " :");
         nota[i] = ler.nextInt();
         contador += nota[i];
      }

      int media = contador / val;

      for(i = 0; i < val; ++i) {
         if (media > nota[i]) {
            System.out.println("Notas menores que a media: " + nota[i]);
         } else if (media < nota[i]) {
            System.out.println("Notas maiores que a media: " + nota[i]);
         }
      }

   }
}