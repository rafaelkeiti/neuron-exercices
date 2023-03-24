import java.util.Scanner;

public class exercice_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        double realNumber = 0;
        int result = 0;
        double result2 = 0;
        double result3 = 0;

        System.out.println("Digite um número inteiro:");
        number1 = input.nextInt();

        System.out.println("Digite outro número inteiro:");
        number2 = input.nextInt();

        System.out.println("Digite um número real:");
        realNumber = input.nextDouble();

        result = (number1 * 2) * (number2 / 2);
        result2 = (number1 * 3) + realNumber;
        result3 = Math.pow(realNumber, 3);
        System.out.println("A) " + result + "\nB) " + result2 + "\nC) " + result3);
    }
}
