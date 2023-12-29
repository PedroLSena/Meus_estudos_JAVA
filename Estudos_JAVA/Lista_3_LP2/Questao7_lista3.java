// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.Scanner;

public class Questao7_lista3 {
   public Questao7_lista3() {
   }

   public static void main(String[] arg) {
      Scanner ler = new Scanner(System.in);
      int[][] matriz = new int[3][3];

      int i;
      int j;
      for(i = 0; i < matriz.length; ++i) {
         for(j = 0; j < matriz.length; ++j) {
            matriz[i][j] = ler.nextInt();
         }
      }

      for(i = 0; i < matriz.length; ++i) {
         for(j = 0; j < matriz.length; ++j) {
            System.out.println(matriz[i][j]);
         }
      }

   }
}
