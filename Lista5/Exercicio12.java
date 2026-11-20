import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        String jogador = jogadaJogador();
        String computador = jogadaComputador();
        String resultado = verificarVencedor(jogador, computador);
        mostrarResultado(jogador, computador, resultado);
    }

    public static void mostrarMenu() {
        System.out.println("Escolha: pedra, papel ou tesoura");
    }

    public static String jogadaJogador() {
        System.out.print("Sua jogada: ");
        return sc.nextLine().toLowerCase();
    }

    public static String jogadaComputador() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        return opcoes[new Random().nextInt(3)];
    }

    public static String verificarVencedor(String jogador, String computador) {
        if (jogador.equals(computador)) return "Empate";
        if (jogador.equals("pedra") && computador.equals("tesoura")
            || jogador.equals("papel") && computador.equals("pedra")
            || jogador.equals("tesoura") && computador.equals("papel")) return "Voce venceu";
        if (!jogador.equals("pedra") && !jogador.equals("papel") && !jogador.equals("tesoura")) return "Jogada invalida";
        return "Computador venceu";
    }

    public static void mostrarResultado(String jogador, String computador, String resultado) {
        System.out.println("Voce: " + jogador);
        System.out.println("Computador: " + computador);
        System.out.println(resultado);
    }
}
