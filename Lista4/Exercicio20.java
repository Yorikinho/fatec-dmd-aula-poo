import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) somaLinha += matriz[i][j];
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }

        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) somaColuna += matriz[i][j];
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }
        sc.close();
    }
}
