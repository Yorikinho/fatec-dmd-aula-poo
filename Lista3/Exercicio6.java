import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "o numero: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior numero: " + maior);

        sc.close();
    }
}
