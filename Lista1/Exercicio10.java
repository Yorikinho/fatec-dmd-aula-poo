import java.util.Arrays;

// Exercício 10: Conjunto de Strings com tamanho variável
public class Exercicio10 {
    private String[] elementos = new String[0];

    public boolean adicionar(String elemento) {
        if (elemento == null || contem(elemento)) return false;
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = elemento;
        return true;
    }

    public boolean contem(String elemento) {
        for (String atual : elementos) {
            if (atual.equals(elemento)) return true;
        }
        return false;
    }

    public Exercicio10 uniao(Exercicio10 outro) {
        Exercicio10 resultado = new Exercicio10();
        for (String item : elementos) resultado.adicionar(item);
        for (String item : outro.elementos) resultado.adicionar(item);
        return resultado;
    }

    public Exercicio10 inter(Exercicio10 outro) {
        Exercicio10 resultado = new Exercicio10();
        for (String item : elementos)
            if (outro.contem(item)) resultado.adicionar(item);
        return resultado;
    }

    public Exercicio10 menos(Exercicio10 outro) {
        Exercicio10 resultado = new Exercicio10();
        for (String item : elementos)
            if (!outro.contem(item)) resultado.adicionar(item);
        return resultado;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public static void main(String[] args) {
        Exercicio10 a = new Exercicio10();
        a.adicionar("Java");
        a.adicionar("Python");
        a.adicionar("C++");

        Exercicio10 b = new Exercicio10();
        b.adicionar("Python");
        b.adicionar("JavaScript");

        System.out.println("União: " + a.uniao(b));
        System.out.println("Interseção: " + a.inter(b));
        System.out.println("A menos B: " + a.menos(b));
    }
}
