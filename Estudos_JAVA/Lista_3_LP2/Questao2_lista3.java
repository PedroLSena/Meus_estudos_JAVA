// Source code is decompiled from a .class file using FernFlower decompiler.
//package Lista3;

import java.util.Scanner;

public class Questao2_lista3 {
   public Questao2_lista3() {
   }

   public static void main(String[] arg) {
      Scanner ler = new Scanner(System.in);

      int opr;
      do {
         System.out.println("Digite a operacao que deseja realizar:");
         System.out.println("1 para soma\n2 para subtracao\n3 para multiplicacao\n4 para divisao\n5 para o modulo\ndigite 9 para sair do programa");
         opr = ler.nextInt();
         int valor1;
         int valor2;
         switch (opr) {
            case 1:
               System.out.println("\n");
               System.out.println("Digite uma valor 1");
               valor1 = ler.nextInt();
               System.out.println("Digite uma valor 2");
               valor2 = ler.nextInt();
               System.out.println("valor da soma :" + (valor1 + valor2));
               System.out.println("\n");
               break;
            case 2:
               System.out.println("\n");
               System.out.println("Digite uma valor 1");
               valor1 = ler.nextInt();
               System.out.println("Digite uma valor 2");
               valor2 = ler.nextInt();
               System.out.println("valor da subtra\u00e7\u00e3o :" + (valor1 - valor2));
               System.out.println("\n");
               break;
            case 3:
               System.out.println("\n");
               System.out.println("Digite uma valor 1");
               valor1 = ler.nextInt();
               System.out.println("Digite uma valor 2");
               valor2 = ler.nextInt();
               System.out.println("valor da multiplicacao :" + valor1 * valor2);
               System.out.println("\n");
               break;
            case 4:
               System.out.println("\n");
               System.out.println("Digite uma valor 1");
               valor1 = ler.nextInt();
               System.out.println("Digite uma valor 2");
               valor2 = ler.nextInt();
               System.out.println("valor da divisao :" + valor1 / valor2);
               System.out.println("\n");
               break;
            case 5:
               System.out.println("\n");
               System.out.println("Digite uma valor 1");
               valor1 = ler.nextInt();
               System.out.println("Digite uma valor 2");
               valor2 = ler.nextInt();
               System.out.println("valor do mod :" + (valor1 & valor2));
               System.out.println("\n");
         }
      } while(opr != 9);

      System.out.println("\n");
      System.out.println("Programa finalizado!!");
   }
}
