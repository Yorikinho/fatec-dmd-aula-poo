import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor que deseja buscar: ");
        int x = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) encontrou = true;
        }

        if (encontrou) System.out.println("Valor encontrado");
        else System.out.println("Valor nao encontrado");
        sc.close();
    }
}
