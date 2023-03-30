import java.util.Scanner;

public class exercice_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        double totalSum;

        System.out.println("Digite um número:");
        firstNumber = input.nextDouble();

        System.out.println("Digite o próximo valor:");
        secondNumber = input.nextDouble();

        totalSum = firstNumber + secondNumber;
        System.out.println("O total da soma é: " + totalSum);
    }
}