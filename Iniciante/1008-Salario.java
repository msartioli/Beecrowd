public class 1008-Salario {
    psvm(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionario = scanner.nextInt();  
        int numeroHorasTrabalhadas = scanner.nextInt();
        int valorAreceber = scanner.nextInt();

        double salario = numeroHorasTrabalhadas * valorAreceber;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
