import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
        }

        System.out.println("Quantidade de pares: " + pares);
        sc.close();
    }
}
