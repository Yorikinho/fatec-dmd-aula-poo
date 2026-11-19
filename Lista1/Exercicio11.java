import java.util.Arrays;

// Exercício 11: Matriz com operações
public class Exercicio11 {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public Exercicio11(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("As dimensões devem ser positivas.");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        dados = new int[linhas][colunas];
    }

    public int get(int linha, int coluna) {
        return dados[linha][coluna];
    }

    public void set(int linha, int coluna, int valor) {
        dados[linha][coluna] = valor;
    }

    public int getLinhas() { return linhas; }
    public int getColunas() { return colunas; }

    public boolean equals(Exercicio11 outra) {
        return outra != null && Arrays.deepEquals(dados, outra.dados);
    }

    public Exercicio11 transposta() {
        Exercicio11 resultado = new Exercicio11(colunas, linhas);
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                resultado.dados[j][i] = dados[i][j];
        return resultado;
    }

    public Exercicio11 oposta() {
        Exercicio11 resultado = new Exercicio11(linhas, colunas);
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                resultado.dados[i][j] = -dados[i][j];
        return resultado;
    }

    public static Exercicio11 nula(int linhas, int colunas) {
        return new Exercicio11(linhas, colunas);
    }

    public boolean ehIdentidade() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                if (dados[i][j] != (i == j ? 1 : 0)) return false;
        return true;
    }

    public boolean ehDiagonal() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                if (i != j && dados[i][j] != 0) return false;
        return true;
    }

    // Implementado conforme a definição escrita na lista.
    public boolean ehSingular() {
        if (!ehDiagonal() || linhas == 0) return false;
        int valor = dados[0][0];
        for (int i = 1; i < linhas; i++)
            if (dados[i][i] != valor) return false;
        return true;
    }

    public boolean ehSimetrica() {
        if (linhas != colunas) return false;
        return equals(transposta());
    }

    public boolean ehAntissimetrica() {
        if (linhas != colunas) return false;
        return oposta().equals(transposta());
    }

    public void adicionar(Exercicio11 outra) {
        verificarMesmasDimensoes(outra);
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                dados[i][j] += outra.dados[i][j];
    }

    public void subtrair(Exercicio11 outra) {
        verificarMesmasDimensoes(outra);
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                dados[i][j] -= outra.dados[i][j];
    }

    public void multiplicar(Exercicio11 outra) {
        if (colunas != outra.linhas) {
            throw new IllegalArgumentException("Dimensões incompatíveis para multiplicação.");
        }
        int[][] resultado = new int[linhas][outra.colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                for (int k = 0; k < colunas; k++) {
                    resultado[i][j] += dados[i][k] * outra.dados[k][j];
                }
            }
        }
        dados = resultado;
        colunas = outra.colunas;
    }

    private void verificarMesmasDimensoes(Exercicio11 outra) {
        if (linhas != outra.linhas || colunas != outra.colunas) {
            throw new IllegalArgumentException("As matrizes precisam ter as mesmas dimensões.");
        }
    }

    public Exercicio11 copia() {
        Exercicio11 copia = new Exercicio11(linhas, colunas);
        for (int i = 0; i < linhas; i++)
            copia.dados[i] = Arrays.copyOf(dados[i], colunas);
        return copia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] linha : dados) sb.append(Arrays.toString(linha)).append(System.lineSeparator());
        return sb.toString();
    }

    public static void main(String[] args) {
        Exercicio11 matriz = new Exercicio11(2, 2);
        matriz.set(0, 0, 1);
        matriz.set(0, 1, 2);
        matriz.set(1, 0, 3);
        matriz.set(1, 1, 4);

        System.out.println("Matriz:");
        System.out.println(matriz);
        System.out.println("Transposta:");
        System.out.println(matriz.transposta());
        System.out.println("É simétrica? " + matriz.ehSimetrica());
    }
}
