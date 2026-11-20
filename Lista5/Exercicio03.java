import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int numero = lerNumero();
        mostrarResultado(numero, ehPar(numero));
    }

    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        return sc.nextInt();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero, boolean par) {
        if (par) System.out.println(numero + " e par");
        else System.out.println(numero + " e impar");
    }
}
