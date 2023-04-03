import java.util.Scanner;

public class exercice_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int firstNumber = input.nextInt();

        System.out.println("Digite outro número:");
        int secondNumber = input.nextInt();

        System.out.println("Digite outro número:");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (secondNumber > thirdNumber) {
                System.out.println(+firstNumber + " / " + secondNumber + " / " + thirdNumber);
            } else {
                System.out.println(+firstNumber + " / " + thirdNumber + " / " + secondNumber);
            }
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(+secondNumber + " / " + firstNumber + " / " + thirdNumber);
            } else {
                System.out.println(+secondNumber + " / " + thirdNumber + " / " + firstNumber);
            }
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if (firstNumber > secondNumber) {
                System.out.println(+thirdNumber + " / " + firstNumber + " / " + secondNumber);
            } else {
                System.out.println(+thirdNumber + " / " + secondNumber + " / " + firstNumber);
            }
        } else {
            System.out.println("Digite apenas números diferentes um do outro.");
        }
    }
}
