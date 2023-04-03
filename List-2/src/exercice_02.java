import java.util.Scanner;

public class exercice_02 {

    private static final int NEUTRAL_NUMBER = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int firstNumber = input.nextInt();

        if (firstNumber > NEUTRAL_NUMBER) {
            System.out.println("O número " + firstNumber + " é positivo.");
        } else if (firstNumber < NEUTRAL_NUMBER) {
            System.out.println("O número " + firstNumber + " é negativo.");
        } else {
            System.out.println("O número " + firstNumber + " é neutro.");
        }
    }
}
