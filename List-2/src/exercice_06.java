import java.util.Scanner;

public class exercice_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int firstNumber = input.nextInt();

        System.out.println("Digite outro número:");
        int secondNumber = input.nextInt();

        System.out.println("Digite mais um número:");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("O maior digitado foi o " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("O maior digitado foi o " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("O maior digitado foi o " + thirdNumber);
        }
    }
}
