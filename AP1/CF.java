import java.util.Scanner;

public class CF{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f°C%n", fahrenheit);
        scanner.close();
    }
}
