import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um numero (0 para parar): ");
            numero = sc.nextInt();

            soma += numero;

        } while (numero != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
