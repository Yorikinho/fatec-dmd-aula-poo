import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Usuario ou senha incorretos");
        }

        sc.close();
    }
}
