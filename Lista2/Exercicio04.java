import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Maior: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2);
        } else {
            System.out.println("Os numeros sao iguais");
        }

        sc.close();
    }
}
