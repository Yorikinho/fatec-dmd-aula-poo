import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();
            }

        System.out.print("Digite o numero para buscar: ");
        int x = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Encontrado na linha " + (i + 1) + ", coluna " + (j + 1));
                    encontrou = true;
                }
            }
        }

        if (!encontrou) System.out.println("Numero nao encontrado");
        sc.close();
    }
}
