// Exercício 3: Número complexo
public class Exercicio03 {
    private double real;
    private double imaginario;

    public Exercicio03(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() { return real; }
    public void setReal(double real) { this.real = real; }
    public double getImaginario() { return imaginario; }
    public void setImaginario(double imaginario) { this.imaginario = imaginario; }

    public void somar(Exercicio03 outro) {
        real += outro.real;
        imaginario += outro.imaginario;
    }

    public void subtrair(Exercicio03 outro) {
        real -= outro.real;
        imaginario -= outro.imaginario;
    }

    public void multiplicar(Exercicio03 outro) {
        double r = real * outro.real - imaginario * outro.imaginario;
        double i = real * outro.imaginario + imaginario * outro.real;
        real = r;
        imaginario = i;
    }

    public void dividir(Exercicio03 outro) {
        double denominador = outro.real * outro.real
                           + outro.imaginario * outro.imaginario;
        if (denominador == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        double r = (real * outro.real + imaginario * outro.imaginario) / denominador;
        double i = (imaginario * outro.real - real * outro.imaginario) / denominador;
        real = r;
        imaginario = i;
    }

    public boolean equals(Exercicio03 outro) {
        return outro != null
            && Double.compare(real, outro.real) == 0
            && Double.compare(imaginario, outro.imaginario) == 0;
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    @Override
    public String toString() {
        if (imaginario < 0) return real + " - " + (-imaginario) + "i";
        return real + " + " + imaginario + "i";
    }

    public static void main(String[] args) {
        Exercicio03 z = new Exercicio03(3, 4);
        System.out.println("Número: " + z);
        System.out.println("Módulo: " + z.modulo());
        z.somar(new Exercicio03(1, -2));
        System.out.println("Após soma: " + z);
    }
}
