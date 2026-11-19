import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Crianca");
        } else if (idade <= 17 && idade >= 13) {
            System.out.println("Adolescente");
        } else if (idade <= 59 && idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade invalida");
        }

        sc.close();
    }
}
