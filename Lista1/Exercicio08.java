// Exercício 8: Pessoa em uma árvore genealógica
public class Exercicio08 {
    public static void main(String[] args) {
        Pessoa avo = new Pessoa("Carlos");
        Pessoa mae = new Pessoa("Ana", avo, null);
        Pessoa pai = new Pessoa("João");
        Pessoa filha = new Pessoa("Maria", pai, mae);

        System.out.println("Nome: " + filha.getNome());
        System.out.println("Ana é antecessora de Maria? " + filha.eAntecessora(mae));
    }
}

class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() { return nome; }
    public Pessoa getPai() { return pai; }
    public Pessoa getMae() { return mae; }

    public boolean equals(Pessoa outra) {
        if (outra == null || !nome.equalsIgnoreCase(outra.nome)) return false;
        if (mae == null) return outra.mae == null;
        return mae.equals(outra.mae);
    }

    public boolean eIrma(Pessoa outra) {
        if (outra == null || outra == this) return false;
        boolean mesmoPai = pai != null && outra.pai != null && pai.equals(outra.pai);
        boolean mesmaMae = mae != null && outra.mae != null && mae.equals(outra.mae);
        return mesmoPai || mesmaMae;
    }

    public boolean eAntecessora(Pessoa pessoa) {
        if (pessoa == null) return false;
        if ((pai != null && pai.equals(pessoa)) || (mae != null && mae.equals(pessoa))) return true;
        return (pai != null && pai.eAntecessora(pessoa))
            || (mae != null && mae.eAntecessora(pessoa));
    }
}
