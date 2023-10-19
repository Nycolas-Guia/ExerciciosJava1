import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cdFuncionario, qtHoras;
        double vlHora, vlSalario;

        System.out.println("Insira o número do funcionário: ");
        cdFuncionario = Integer.parseInt(sc.nextLine());

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        qtHoras = Integer.parseInt(sc.nextLine());

        System.out.println("Insira o valor recebido por hora: ");
        vlHora = Double.parseDouble(sc.nextLine());

        vlSalario = qtHoras * vlHora;
        System.out.printf("Número = %d\nSalário = R$%.2f", cdFuncionario, vlSalario);

        sc.close();
    }
}
