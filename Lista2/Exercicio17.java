import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        boolean logado = false;

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto)
                    && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso");
                logado = true;
                break;
            } else {
                System.out.println("Dados incorretos");
            }
        }

        if (!logado) {
            System.out.println("Conta bloqueada");
        }

        sc.close();
    }
}
