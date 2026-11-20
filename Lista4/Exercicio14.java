import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maior = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) maior = matriz[i][j];
            }
        }

        System.out.println("Maior valor: " + maior);
        sc.close();
    }
}
