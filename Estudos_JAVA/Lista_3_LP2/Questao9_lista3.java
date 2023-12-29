// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.Random;

public class Questao9_lista3 {
   public Questao9_lista3() {
   }

   public static void main(String[] arg) {
      Random rand = new Random();
      int[][] matriz = new int[20][10];
      int[] vetor = new int[200];
      int[] vet = new int[200];
      int acumulador = 0;

      int i;
      int j;
      for(i = 0; i < 20; ++i) {
         for(j = 0; j < 10; ++j) {
            matriz[i][j] = rand.nextInt(10);
            vetor[j] += matriz[0][j];
         }
      }

      for(i = 0; i < 20; ++i) {
         for(j = 0; j < 10; ++j) {
            matriz[i][j] *= vetor[j];
            System.out.print(matriz[i][j] + "  ");
         }

         System.out.println();
      }

   }
}
