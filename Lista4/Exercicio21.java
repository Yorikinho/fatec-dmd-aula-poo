import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) tabuleiro[i][j] = ' ';

        char jogador = 'X';
        boolean fim = false;

        for (int jogada = 0; jogada < 9 && !fim; jogada++) {
            mostrar(tabuleiro);
            System.out.println("Jogador " + jogador);
            System.out.print("Linha (1-3): ");
            int linha = sc.nextInt() - 1;
            System.out.print("Coluna (1-3): ");
            int coluna = sc.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posicao invalida. Tente novamente.");
                jogada--;
                continue;
            }

            tabuleiro[linha][coluna] = jogador;
            fim = venceu(tabuleiro, jogador);

            if (fim) {
                mostrar(tabuleiro);
                System.out.println("Jogador " + jogador + " venceu!");
            } else if (jogada == 8) {
                mostrar(tabuleiro);
                System.out.println("Empate!");
            }

            jogador = (jogador == 'X') ? 'O' : 'X';
        }
        sc.close();
    }

    public static void mostrar(char[][] t) {
        for (int i = 0; i < 3; i++) {
            System.out.println(t[i][0] + " | " + t[i][1] + " | " + t[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    public static boolean venceu(char[][] t, char j) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == j && t[i][1] == j && t[i][2] == j) return true;
            if (t[0][i] == j && t[1][i] == j && t[2][i] == j) return true;
        }
        return (t[0][0] == j && t[1][1] == j && t[2][2] == j)
            || (t[0][2] == j && t[1][1] == j && t[2][0] == j);
    }
}
