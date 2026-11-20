import java.util.Scanner;

public class Exercicio13 {
    static Scanner sc = new Scanner(System.in);
    static int vida = 100;

    public static void main(String[] args) {
        criarPersonagem();
        mostrarStatus();
        atacar();
        receberDano();
        curar();
        mostrarStatus();
    }

    public static void criarPersonagem() {
        vida = 100;
        System.out.println("Personagem criado!");
    }

    public static void mostrarStatus() {
        System.out.println("Vida: " + vida);
    }

    public static void atacar() {
        System.out.println("O personagem atacou!");
    }

    public static void receberDano() {
        vida -= 20;
        if (vida < 0) vida = 0;
        System.out.println("O personagem recebeu 20 de dano.");
    }

    public static void curar() {
        vida += 10;
        if (vida > 100) vida = 100;
        System.out.println("O personagem recuperou 10 de vida.");
    }
}
