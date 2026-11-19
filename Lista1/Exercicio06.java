import java.util.ArrayList;
import java.util.List;

// Exercício 6: País, população, dimensão e países vizinhos
public class Exercicio06 {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 203000000, 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 46000000, 2780400);
        brasil.adicionarFronteira(argentina);
        argentina.adicionarFronteira(brasil);

        System.out.println(brasil.getNome());
        System.out.println("Densidade: " + brasil.densidadePopulacional());
        System.out.println("Faz fronteira com Argentina? " + brasil.eLimitrofe(argentina));
    }
}

class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras = new ArrayList<>();

    public Pais(String codigoISO, String nome, double dimensao) {
        this(codigoISO, nome, 0, dimensao);
    }

    public Pais(String codigoISO, String nome, long populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() { return codigoISO; }
    public void setCodigoISO(String codigoISO) { this.codigoISO = codigoISO; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public long getPopulacao() { return populacao; }
    public void setPopulacao(long populacao) { this.populacao = populacao; }
    public double getDimensao() { return dimensao; }
    public void setDimensao(double dimensao) { this.dimensao = dimensao; }

    public boolean equals(Pais outro) {
        return outro != null && codigoISO.equalsIgnoreCase(outro.codigoISO);
    }

    public void adicionarFronteira(Pais pais) {
        if (pais != null && !eLimitrofe(pais) && fronteiras.size() < 40) {
            fronteiras.add(pais);
        }
    }

    public boolean eLimitrofe(Pais pais) {
        for (Pais vizinho : fronteiras) {
            if (vizinho.equals(pais)) return true;
        }
        return false;
    }

    public double densidadePopulacional() {
        if (dimensao == 0) return 0;
        return populacao / dimensao;
    }

    public Pais[] vizinhosComuns(Pais outro) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais vizinho : fronteiras) {
            if (outro.eLimitrofe(vizinho)) comuns.add(vizinho);
        }
        return comuns.toArray(new Pais[0]);
    }

    public Pais[] getFronteiras() {
        return fronteiras.toArray(new Pais[0]);
    }
}
