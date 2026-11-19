import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite o segundo numero: ");
                    double n2 = sc.nextDouble();

                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    double n3 = sc.nextDouble();

                    System.out.print("Digite o segundo numero: ");
                    double n4 = sc.nextDouble();

                    System.out.println("Resultado: " + (n3 - n4));
                    break;

                case 3:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 3);

        sc.close();
    }
}
