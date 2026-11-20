import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Valores unicos:");
        for (int i = 0; i < 10; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) repetido = true;
            }

            if (!repetido) System.out.println(numeros[i]);
        }
        sc.close();
    }
}
