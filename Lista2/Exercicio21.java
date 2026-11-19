import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (!usuario.equals("admin") || !senha.equals("1234")) {
            System.out.println("Login invalido");
            sc.close();
            return;
        }

        double saldo = 1000;
        int opcao;

        do {
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Valor do deposito: R$ ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito realizado");
                    } else {
                        System.out.println("Valor invalido");
                    }
                    break;

                case 3:
                    System.out.print("Valor do saque: R$ ");
                    double saque = sc.nextDouble();

                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Saldo insuficiente ou valor invalido");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 4);

        sc.close();
    }
}
