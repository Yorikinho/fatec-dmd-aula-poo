import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.print("Operacao (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Nao e possivel dividir por zero");
                }
                break;
            default:
                System.out.println("Operacao invalida");
        }

        sc.close();
    }
}
