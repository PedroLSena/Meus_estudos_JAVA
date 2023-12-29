// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.Random;

public class Questao10_lista3 {
   public Questao10_lista3() {
   }

   public static void main(String[] arg) {
      Random rand = new Random();
      int[][] matriz = new int[10][10];

      int i;
      int j;
      for(i = 0; i < matriz.length; ++i) {
         for(j = 0; j < matriz.length; ++j) {
            matriz[i][j] = rand.nextInt(10);
         }
      }

      for(i = 0; i < matriz.length; ++i) {
         System.out.println("\n");
         System.out.print(matriz[i][0]);

         for(j = 1; j < matriz.length; ++j) {
            System.out.print(" " + matriz[0][j]);
         }
      }

   }
}
