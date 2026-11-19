// Exercício 2: Ponto no plano cartesiano
public class Exercicio02 {
    private double x;
    private double y;

    public Exercicio02() {
        this(0, 0);
    }

    public Exercicio02(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Exercicio02(Exercicio02 outro) {
        this(outro.x, outro.y);
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public void mover() {
        mover(0, 0);
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Exercicio02 outro) {
        mover(outro.x, outro.y);
    }

    public boolean equals(Exercicio02 outro) {
        return outro != null
            && Double.compare(x, outro.x) == 0
            && Double.compare(y, outro.y) == 0;
    }

    public double distancia(Exercicio02 outro) {
        double dx = x - outro.x;
        double dy = y - outro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Exercicio02 clone() {
        return new Exercicio02(this);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Exercicio02 p1 = new Exercicio02(3, 4);
        Exercicio02 p2 = new Exercicio02(6, 8);
        System.out.println("Ponto 1: " + p1);
        System.out.println("Ponto 2: " + p2);
        System.out.println("Distância: " + p1.distancia(p2));
        System.out.println("Cópia: " + p1.clone());
    }
}
