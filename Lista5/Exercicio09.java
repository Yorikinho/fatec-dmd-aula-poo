import java.util.Scanner;

public class Exercicio09 {
    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = sc.nextInt();

            if (opcao == 1) depositar();
            else if (opcao == 2) sacar();
            else if (opcao == 3) consultarSaldo();
            else if (opcao != 4) System.out.println("Opcao invalida");
        } while (opcao != 4);
    }

    public static void mostrarMenu() {
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");
    }

    public static void depositar() {
        System.out.print("Valor para depositar: ");
        double valor = sc.nextDouble();
        if (valor > 0) saldo += valor;
        else System.out.println("Valor invalido");
    }

    public static void sacar() {
        System.out.print("Valor para sacar: ");
        double valor = sc.nextDouble();
        if (valor > 0 && valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente ou valor invalido");
    }

    public static void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}
