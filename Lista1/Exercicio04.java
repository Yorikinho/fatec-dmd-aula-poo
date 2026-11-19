// Exercício 4: Reta representada por y = ax + b
public class Exercicio04 {
    private double a; // coeficiente angular
    private double b; // coeficiente linear

    public Exercicio04(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Exercicio04(Exercicio02Ponto p1, Exercicio02Ponto p2) {
        if (Double.compare(p1.getX(), p2.getX()) == 0) {
            throw new IllegalArgumentException("Os pontos não definem uma reta y=ax+b (x iguais).");
        }
        this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.b = p1.getY() - this.a * p1.getX();
    }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }
    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public boolean contemPonto(double x, double y) {
        return Math.abs(y - (a * x + b)) < 0.000001;
    }

    public double[] intersecao(Exercicio04 outra) {
        if (Math.abs(a - outra.a) < 0.000001) return null;
        double x = (outra.b - b) / (a - outra.a);
        double y = a * x + b;
        return new double[] { x, y };
    }

    @Override
    public String toString() {
        return "y = " + a + "x + " + b;
    }

    public static void main(String[] args) {
        Exercicio04 r1 = new Exercicio04(2, 1);
        Exercicio04 r2 = new Exercicio04(-1, 4);
        System.out.println(r1);
        double[] p = r1.intersecao(r2);
        if (p != null) System.out.println("Interseção: (" + p[0] + ", " + p[1] + ")");
        else System.out.println("As retas são paralelas.");
    }
}

// Classe auxiliar para permitir construir uma reta a partir de dois pontos.
class Exercicio02Ponto {
    private double x;
    private double y;

    public Exercicio02Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
