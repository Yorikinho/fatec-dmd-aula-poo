import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida");
            sc.close();
            return;
        }

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "o numero: ");
            double numero = sc.nextDouble();

            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println("Media: " + media);

        sc.close();
    }
}
