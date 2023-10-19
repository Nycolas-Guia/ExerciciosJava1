import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        System.out.println("Insira o primeiro valor: ");
        A = Integer.parseInt(sc.nextLine());

        System.out.println("Insira o segundo valor: ");
        B = Integer.parseInt(sc.nextLine());

        int soma = A + B;
        System.out.print("Soma = " + soma);
        sc.close();
    }
}