import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();

        double desconto = 0;

        if (valor >= 100) {
            desconto = valor * 0.10;
        }

        double total = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + total);

        sc.close();
    }
}
