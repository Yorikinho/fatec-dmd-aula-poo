public class Exercicio16 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int resultado = somar(n1, n2);
        mostrarResultado(resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("Resultado da soma: " + resultado);
    }
}
