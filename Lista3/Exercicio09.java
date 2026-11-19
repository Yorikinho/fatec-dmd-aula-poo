import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro nao negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Numero invalido");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial: " + fatorial);
        }

        sc.close();
    }
}
