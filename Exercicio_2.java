
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, pi = 3.14159;
        System.out.println("Insira o valor do raio: ");
        raio = Double.parseDouble(sc.nextLine());

        double area = pi * (raio * raio);
        System.out.printf("Área = %.4f", area);
        sc.close();
    }
}
