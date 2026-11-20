import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) identidade = false;
                if (i != j && matriz[i][j] != 0) identidade = false;
            }
        }

        if (identidade) System.out.println("E matriz identidade");
        else System.out.println("Nao e matriz identidade");
        sc.close();
    }
}
