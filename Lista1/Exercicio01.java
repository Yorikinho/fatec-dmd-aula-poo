// Exercício 1: Contador
public class Exercicio01 {
    private int valor;

    public Exercicio01() {
        valor = 0;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Exercicio01 contador = new Exercicio01();
        contador.incrementar();
        contador.incrementar();
        System.out.println("Contador: " + contador.getValor());
        contador.zerar();
        System.out.println("Depois de zerar: " + contador.getValor());
    }
}
