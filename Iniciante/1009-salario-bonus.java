import java.util.Scanner;

public class 1009-salario-bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeFuncionario = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}