import java.util.Arrays;

// Exercício 9: Conjunto de Strings com tamanho variável
public class Exercicio09 {
    private String[] elementos;

    public Exercicio09() {
        elementos = new String[0];
    }

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

    public Exercicio09 uniao(Exercicio09 outro) {
        Exercicio09 resultado = new Exercicio09();
        for (String item : elementos) resultado.adicionar(item);
        for (String item : outro.elementos) resultado.adicionar(item);
        return resultado;
    }

    public Exercicio09 inter(Exercicio09 outro) {
        Exercicio09 resultado = new Exercicio09();
        for (String item : elementos) {
            if (outro.contem(item)) resultado.adicionar(item);
        }
        return resultado;
    }

    public Exercicio09 menos(Exercicio09 outro) {
        Exercicio09 resultado = new Exercicio09();
        for (String item : elementos) {
            if (!outro.contem(item)) resultado.adicionar(item);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public static void main(String[] args) {
        Exercicio09 conjuntoA = new Exercicio09();
        conjuntoA.adicionar("Java");
        conjuntoA.adicionar("Python");
        conjuntoA.adicionar("C++");

        Exercicio09 conjuntoB = new Exercicio09();
        conjuntoB.adicionar("Python");
        conjuntoB.adicionar("JavaScript");

        System.out.println("União: " + conjuntoA.uniao(conjuntoB));
        System.out.println("Interseção: " + conjuntoA.inter(conjuntoB));
        System.out.println("A menos B: " + conjuntoA.menos(conjuntoB));
    }
}
