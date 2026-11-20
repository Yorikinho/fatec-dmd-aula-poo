import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();
        int quantidade = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) quantidade++;
        }

        System.out.println("O valor aparece " + quantidade + " vez(es).");
        sc.close();
    }
}
