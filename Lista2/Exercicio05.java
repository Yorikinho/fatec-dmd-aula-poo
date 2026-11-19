import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("O numero esta no intervalo");
        } else {
            System.out.println("O numero esta fora do intervalo");
        }

        sc.close();
    }
}
