import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Primeiro numero: ");
                    double a = sc.nextDouble();

                    System.out.print("Segundo numero: ");
                    double b = sc.nextDouble();

                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Primeiro numero: ");
                    double c = sc.nextDouble();

                    System.out.print("Segundo numero: ");
                    double d = sc.nextDouble();

                    System.out.println("Resultado: " + (c - d));
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 3);

        sc.close();
    }
}
