import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        System.out.println("Media: " + (soma / 6));
        sc.close();
    }
}
