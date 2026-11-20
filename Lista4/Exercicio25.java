import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }

        for (int i = 0; i < 3; i++) soma += matriz[i][2 - i];

        System.out.println("Soma da diagonal secundaria: " + soma);
        sc.close();
    }
}
