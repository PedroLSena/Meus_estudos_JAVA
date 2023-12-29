import java.util.Scanner;

public class Questao5_lista4 {

    public static class Data {
        private int mes;
        private int dia;
        private int ano;

        public Data(int m, int d, int a) {
            this.mes = m;
            this.dia = d;
            this.ano = a;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int m) {
            this.mes = m;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int d) {
            this.dia = d;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int a) {
            this.ano = a;
        }

        public void displayData() {
            System.out.println(dia + "/" + mes + "/" + ano);
        }
    }

    public static void main(String[] args) {

        Data data1 = new Data(12, 31, 2022);


        System.out.println("Data 1:");
        data1.displayData();

        data1.setMes(1);
        data1.setDia(1);
        data1.setAno(2023);

        System.out.println("\nData 1 após alteração:");
        data1.displayData();

        Data data2 = new Data(6, 15, 2022);

        System.out.println("\nData 2:");
        data2.displayData();
    }
}
