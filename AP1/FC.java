import java.util.Scanner;

public class FC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/ 9;
        System.out.printf("A temperatura em celsius é>: %.2f°C%n", celsius);
        scanner.close();
    }
}
