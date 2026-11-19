import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um numero de 1 a 10: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Numero invalido. Tente novamente.");
            }

        } while (numero < 1 || numero > 10);

        System.out.println("Numero valido: " + numero);

        sc.close();
    }
}
