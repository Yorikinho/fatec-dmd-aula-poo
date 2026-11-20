import java.util.Scanner;

public class Exercicio15 {
    static Scanner sc = new Scanner(System.in);
    static int pontos = 0;

    public static void main(String[] args) {
        iniciarJogo();
        criarJogador();
        executarTurno();
        verificarVitoria();
        encerrarJogo();
    }

    public static void iniciarJogo() {
        System.out.println("=== QUIZ SIMPLES ===");
    }

    public static void mostrarMenu() {
        System.out.println("Responda a pergunta para ganhar um ponto.");
    }

    public static void criarJogador() {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Boa sorte, " + nome + "!");
        mostrarMenu();
    }

    public static void executarTurno() {
        System.out.println("Qual linguagem estamos usando?");
        System.out.println("1 - Java");
        System.out.println("2 - Python");
        System.out.print("Resposta: ");
        int resposta = sc.nextInt();
        if (resposta == 1) pontos++;
    }

    public static void verificarVitoria() {
        if (pontos == 1) System.out.println("Voce acertou!");
        else System.out.println("Resposta incorreta.");
    }

    public static void encerrarJogo() {
        System.out.println("Fim do jogo. Pontos: " + pontos);
    }
}
