import java.util.Scanner;

public class Exercicio04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = lerNota();
        double n2 = lerNota();
        double n3 = lerNota();
        double media = calcularMedia(n1, n2, n3);
        mostrarResultado(media, verificarSituacao(media));
    }

    public static double lerNota() {
        System.out.print("Digite uma nota: ");
        return sc.nextDouble();
    }

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6) return "Aprovado";
        if (media >= 4) return "Recuperacao";
        return "Reprovado";
    }

    public static void mostrarResultado(double media, String situacao) {
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);
    }
}
