public class Exercicio07 {
    public static void main(String[] args) {
        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    public static void mostrarNumeros() {
        System.out.println("Numeros de 1 a 100:");
        for (int i = 1; i <= 100; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void mostrarPares() {
        System.out.println("Pares de 1 a 100:");
        for (int i = 2; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    public static void mostrarImpares() {
        System.out.println("Impares de 1 a 100:");
        for (int i = 1; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();
    }
}
