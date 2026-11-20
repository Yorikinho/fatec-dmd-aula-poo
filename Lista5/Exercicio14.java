import java.util.Scanner;

public class Exercicio14 {
    static Scanner sc = new Scanner(System.in);
    static double saldo = 500;

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = sc.nextInt();

            if (opcao == 1) depositar();
            else if (opcao == 2) sacar();
            else if (opcao == 3) consultarSaldo();
            else if (opcao == 4) encerrarSistema();
            else System.out.println("Opcao invalida");
        } while (opcao != 4);
    }

    public static void mostrarMenu() {
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");
        System.out.print("Escolha: ");
    }

    public static void depositar() {
        System.out.print("Valor do deposito: ");
        double valor = sc.nextDouble();
        if (valor > 0) saldo += valor;
        else System.out.println("Valor invalido");
    }

    public static void sacar() {
        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();
        if (valor > 0 && valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente ou valor invalido");
    }

    public static void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void encerrarSistema() {
        System.out.println("Sistema encerrado.");
    }
}
