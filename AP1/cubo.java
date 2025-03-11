import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();
        System.out.printf("Quadrado: %.2f%n", Math.pow(valor, 2));
        System.out.printf("cubo: %.2f%n", Math.pow(valor, 3));
        scanner.close();
    }
}
