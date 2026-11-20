import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean semRepetidos = true;

        System.out.println("Digite 9 numeros de 1 a 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) matriz[i][j] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < 1 || matriz[i][j] > 9) semRepetidos = false;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if ((i != x || j != y) && matriz[i][j] == matriz[x][y]) {
                            semRepetidos = false;
                        }
                    }
                }
            }
        }

        if (semRepetidos) System.out.println("Nao ha numeros repetidos");
        else System.out.println("Existem repetidos ou numeros fora de 1 a 9");
        sc.close();
    }
}
