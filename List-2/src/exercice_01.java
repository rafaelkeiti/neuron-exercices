import java.util.Scanner;

public class exercice_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Digite um número:");
        firstNumber = input.nextInt();

        System.out.println("Digite outro número:");
        secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Ö maior número é o " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("O maior número é o " + secondNumber);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
