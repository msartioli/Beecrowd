import java.util.Scanner;   


public class AreaDoCirculo {
    Scanner scanner = new Scanner(System.in);
    double pi = 3.14159;
    public void main (String[] args){
      System.out.println("Digite o numéro do raio");
      double raio = scanner.nextDouble();
      double soma = raio * raio;
      System.out.println("A="+ soma * pi);
    }
}