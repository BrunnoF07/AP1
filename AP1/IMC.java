import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner Scanner = new  Scanner(System.in);
        System.out.print("Digite seu peso (Kg): ");
        double peso = Scanner.nextDouble();
        System.out.print("Digite sua altura (M): ");
        double altura = Scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        Scanner.close();
    }
}
