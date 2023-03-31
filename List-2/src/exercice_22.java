import java.util.Scanner;

public class exercice_22 {

    public static final int TWO = 2;
    public static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;

        System.out.println("Digite um número para saber se ele é par ou ímpar:");
        firstNumber = input.nextInt();

        if (firstNumber % TWO == ZERO) {
            System.out.println("O número " + firstNumber + " é par.");
        } else {
            System.out.println("O número " + firstNumber + " é ímpar.");
        }
    }
}
