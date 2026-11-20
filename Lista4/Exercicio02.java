import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);
        sc.close();
    }
}
