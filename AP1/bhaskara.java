import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1, b = 12, c = -13;

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("O valor de delta é; %.2f%n", delta);

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízed da equação são: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else {
            System.out.println("A equação não possui raízes reais.");

        }

        scanner.close();

    }
}
