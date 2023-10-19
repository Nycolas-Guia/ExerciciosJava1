import java.util.Scanner;

public class Exercicios_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite o valor de A: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor de B: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor de C: ");
        c = Double.parseDouble(sc.nextLine());

        triangulo = (a * c) / 2;
        circulo = (c * c) * 3.14159;
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        sc.close();
    }
}