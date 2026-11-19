import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: R$ ");
        int valor = sc.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = valor / nota;
            valor = valor % nota;

            if (quantidade > 0) {
                System.out.println(
                    quantidade + " nota(s) de R$ " + nota
                );
            }
        }

        sc.close();
    }
}
