import java.util.Scanner;

public class exercice_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double firstNumber = input.nextDouble();

        System.out.println("Digite o próximo valor:");
        double secondNumber = input.nextDouble();

        double totalSum = firstNumber + secondNumber;
        System.out.println("O total da soma é: " + totalSum);
    }
}