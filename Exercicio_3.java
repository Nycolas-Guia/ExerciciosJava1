import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Insira o valor de A: ");
        A = Integer.parseInt(sc.nextLine());

        System.out.println("Insira o valor de B: ");
        B = Integer.parseInt(sc.nextLine());

        System.out.println("Insira o valor de C: ");
        C = Integer.parseInt(sc.nextLine());

        System.out.println("Insira o valor de D: ");
        D = Integer.parseInt(sc.nextLine());

        int diff = (A * B) - (C * D);
        System.out.printf("Diferença = %d", diff);
        sc.close();
    }
}