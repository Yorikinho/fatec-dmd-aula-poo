import java.util.Scanner;

public class Exercicio08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();
        mostrarResumo(nome, idade, cidade);
    }

    public static String lerNome() {
        System.out.print("Digite seu nome: ");
        return sc.nextLine();
    }

    public static int lerIdade() {
        System.out.print("Digite sua idade: ");
        return sc.nextInt();
    }

    public static String lerCidade() {
        sc.nextLine();
        System.out.print("Digite sua cidade: ");
        return sc.nextLine();
    }

    public static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}
