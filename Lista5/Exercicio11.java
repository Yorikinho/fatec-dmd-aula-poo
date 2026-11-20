import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = sortearNumero();
        int palpite;
        do {
            palpite = lerPalpite();
            if (verificarAcerto(numero, palpite)) {
                mostrarVitoria();
            } else {
                mostrarDica(numero, palpite);
            }
        } while (numero != palpite);
    }

    public static int sortearNumero() {
        return new Random().nextInt(10) + 1;
    }

    public static int lerPalpite() {
        System.out.print("Adivinhe um numero de 1 a 10: ");
        return sc.nextInt();
    }

    public static boolean verificarAcerto(int numero, int palpite) {
        return numero == palpite;
    }

    public static void mostrarDica(int numero, int palpite) {
        if (palpite < numero) System.out.println("Tente um numero maior");
        else System.out.println("Tente um numero menor");
    }

    public static void mostrarVitoria() {
        System.out.println("Parabens! Voce acertou!");
    }
}
