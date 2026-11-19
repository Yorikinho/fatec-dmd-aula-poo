// Exercício 5: Círculo no plano cartesiano
public class Exercicio05 {
    private double raio;
    private double x;
    private double y;

    public Exercicio05(double raio, double x, double y) {
        if (raio < 0) throw new IllegalArgumentException("O raio não pode ser negativo.");
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public Exercicio05(double raio) {
        this(raio, 0, 0);
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) {
        if (raio < 0) throw new IllegalArgumentException("O raio não pode ser negativo.");
        this.raio = raio;
    }

    public void inflar(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Informe um valor positivo.");
        raio += valor;
    }

    public void desinflar(double valor) {
        if (valor < 0 || valor > raio) throw new IllegalArgumentException("Valor inválido.");
        raio -= valor;
    }

    public void inflar() { raio++; }

    public void desinflar() {
        if (raio > 0) raio--;
    }

    public void mover() { mover(0, 0); }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto ponto) {
        this.x = ponto.getX();
        this.y = ponto.getY();
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Círculo(centro=(" + x + ", " + y + "), raio=" + raio + ")";
    }

    public static void main(String[] args) {
        Exercicio05 circulo = new Exercicio05(5);
        circulo.inflar(2);
        circulo.mover(3, 4);
        System.out.println(circulo);
        System.out.println("Área: " + circulo.area());
    }
}

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
