import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Agradavel");
        } else {
            System.out.println("Quente");
        }

        sc.close();
    }
}
