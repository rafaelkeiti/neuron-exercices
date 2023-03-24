import java.util.Scanner;

public class exercice_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = 0;
        double number2 = 0;
        double totalSum = 0;

        System.out.println("Digite um número:");
        number1 = input.nextDouble();

        System.out.println("Digite o próximo valor:");
        number2 = input.nextDouble();

        totalSum = number1 + number2;
        System.out.println("O total da soma é: " + totalSum);
    }
}