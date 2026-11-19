import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double b = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }

        sc.close();
    }
}
