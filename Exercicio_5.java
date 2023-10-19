import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1, nmp1, p2, nmp2;
        double vlp1, vlp2, vltotal;

        System.out.println("Insira o código da peça 1");
        p1 = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o número de peças 1");
        nmp1 = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o valor unitário da peça 1");
        vlp1 = Double.parseDouble(sc.nextLine());

        System.out.println("Insira o código da peça 2");
        p2 = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o número de peças 2");
        nmp2 = Integer.parseInt(sc.nextLine());
        System.out.println("Insira o valor unitário da peça 2");
        vlp2 = Double.parseDouble(sc.nextLine());

        vltotal = (nmp1 * vlp1) + (nmp2 * vlp2);
        System.out.printf("VALOR A PAGAR PELAS PEÇAS %d e %d: R$%.2f", p1, p2, vltotal);

        sc.close();
    }
}
