import java.util.Scanner;

public class exercice_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        System.out.println("Digite um número:");
        firstNumber = input.nextInt();

        System.out.println("Digite outro número:");
        secondNumber = input.nextInt();

        System.out.println("Digite mais um número:");
        thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("O maior digitado foi o " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("O maior digitado foi o " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("O maior digitado foi o " + thirdNumber);
        }
    }
}
