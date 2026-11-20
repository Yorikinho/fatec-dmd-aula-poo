package JogodaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    private static final char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        inicializarTabuleiro();
        boolean terminou = false;

        while (!terminou) {
            exibirTabuleiro();
            realizarJogada(entrada);

            if (verificarVitoria(jogadorAtual)) {
                exibirTabuleiro();
                System.out.println("O jogador " + jogadorAtual + " venceu!");
                terminou = true;
            } else if (tabuleiroCompleto()) {
                exibirTabuleiro();
                System.out.println("A partida terminou empatada!");
                terminou = true;
            } else {
                trocarJogador();
            }
        }
        entrada.close();
    }

    private static void inicializarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }
    }

    private static void exibirTabuleiro() {
        System.out.println();
        System.out.println("    1   2   3");
        System.out.println("  +---+---+---+");
        for (int linha = 0; linha < 3; linha++) {
            System.out.print((linha + 1) + " |");
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(" " + tabuleiro[linha][coluna] + " |");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
        System.out.println();
    }

    private static void realizarJogada(Scanner entrada) {
        while (true) {
            System.out.println("Jogador " + jogadorAtual + ", informe a linha (1 a 3):");
            int linha = lerNumero(entrada);
            System.out.println("Jogador " + jogadorAtual + ", informe a coluna (1 a 3):");
            int coluna = lerNumero(entrada);

            if (!posicaoValida(linha, coluna)) {
                System.out.println("Posição inválida. Digite valores entre 1 e 3.");
            } else if (tabuleiro[linha - 1][coluna - 1] != ' ') {
                System.out.println("Essa posição já está ocupada. Escolha outra posição.");
            } else {
                tabuleiro[linha - 1][coluna - 1] = jogadorAtual;
                return;
            }
        }
    }

    private static int lerNumero(Scanner entrada) {
        while (!entrada.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            entrada.next();
        }
        return entrada.nextInt();
    }

    private static boolean posicaoValida(int linha, int coluna) {
        return linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3;
    }

    private static boolean verificarVitoria(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador
                    && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador
                    && tabuleiro[2][i] == jogador) return true;
        }

        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador
                && tabuleiro[2][2] == jogador) return true;

        return tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador
                && tabuleiro[2][0] == jogador;
    }

    private static boolean tabuleiroCompleto() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == ' ') return false;
            }
        }
        return true;
    }

    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
}
