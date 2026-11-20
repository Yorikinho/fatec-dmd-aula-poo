import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) b[i][j] = sc.nextInt();
        }

        System.out.println("Soma das matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
        sc.close();
    }
}
