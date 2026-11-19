import java.util.ArrayList;
import java.util.List;

// Exercício 7 da lista: Continente composto por países
public class Exercicio07 {
    public static void main(String[] args) {
        Continente america = new Continente("América do Sul");
        america.adicionarPais(new PaisContinente("BRA", "Brasil", 203000000, 8515767));
        america.adicionarPais(new PaisContinente("ARG", "Argentina", 46000000, 2780400));
        System.out.println("Continente: " + america.getNome());
        System.out.println("População total: " + america.populacaoTotal());
        System.out.println("Dimensão total: " + america.dimensaoTotal());
        System.out.println("Maior população: " + america.paisMaiorPopulacao().getNome());
    }
}

class PaisContinente {
    private String codigo;
    private String nome;
    private long populacao;
    private double dimensao;

    public PaisContinente(String codigo, String nome, long populacao, double dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public long getPopulacao() { return populacao; }
    public double getDimensao() { return dimensao; }
}

class Continente {
    private String nome;
    private List<PaisContinente> paises = new ArrayList<>();

    public Continente(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void adicionarPais(PaisContinente pais) {
        if (pais != null && paises.size() < 48) paises.add(pais);
    }

    public double dimensaoTotal() {
        double total = 0;
        for (PaisContinente p : paises) total += p.getDimensao();
        return total;
    }

    public long populacaoTotal() {
        long total = 0;
        for (PaisContinente p : paises) total += p.getPopulacao();
        return total;
    }

    public double densidadePopulacional() {
        double dimensao = dimensaoTotal();
        return dimensao == 0 ? 0 : populacaoTotal() / dimensao;
    }

    public PaisContinente paisMaiorPopulacao() {
        if (paises.isEmpty()) return null;
        PaisContinente maior = paises.get(0);
        for (PaisContinente p : paises) if (p.getPopulacao() > maior.getPopulacao()) maior = p;
        return maior;
    }

    public PaisContinente paisMenorPopulacao() {
        if (paises.isEmpty()) return null;
        PaisContinente menor = paises.get(0);
        for (PaisContinente p : paises) if (p.getPopulacao() < menor.getPopulacao()) menor = p;
        return menor;
    }

    public PaisContinente paisMaiorDimensao() {
        if (paises.isEmpty()) return null;
        PaisContinente maior = paises.get(0);
        for (PaisContinente p : paises) if (p.getDimensao() > maior.getDimensao()) maior = p;
        return maior;
    }

    public PaisContinente paisMenorDimensao() {
        if (paises.isEmpty()) return null;
        PaisContinente menor = paises.get(0);
        for (PaisContinente p : paises) if (p.getDimensao() < menor.getDimensao()) menor = p;
        return menor;
    }

    public double razaoMaiorMenorPais() {
        PaisContinente maior = paisMaiorDimensao();
        PaisContinente menor = paisMenorDimensao();
        if (maior == null || menor == null || menor.getDimensao() == 0) return 0;
        return maior.getDimensao() / menor.getDimensao();
    }
}
