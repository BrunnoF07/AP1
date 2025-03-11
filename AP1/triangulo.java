import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triangulo:");
        double altura = scanner.nextDouble();
        double area = (base*altura) /2;
        System.out.printf("A area do triangulo é: %.2f%n", area);
        scanner.close();
    }
}
