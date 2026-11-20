import java.util.Scanner;

public class Exercicio05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        int opcao = sc.nextInt();
        System.out.print("Primeiro numero: ");
        double a = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double b = sc.nextDouble();

        if (opcao == 1) System.out.println("Resultado: " + somar(a, b));
        else if (opcao == 2) System.out.println("Resultado: " + subtrair(a, b));
        else if (opcao == 3) System.out.println("Resultado: " + multiplicar(a, b));
        else if (opcao == 4) {
            if (b == 0) System.out.println("Nao pode dividir por zero");
            else System.out.println("Resultado: " + dividir(a, b));
        } else System.out.println("Opcao invalida");
    }

    public static void mostrarMenu() {
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha: ");
    }

    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
}
