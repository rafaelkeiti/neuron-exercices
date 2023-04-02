import java.util.Scanner;

public class exercice_11 {

    private static final int DOUBLE = 2;
    private static final int HALF = 2;
    private static final int TRIPLE = 3;
    private static final int THREETOTHE_REAL_NUMBER = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int firstNumber = input.nextInt();

        System.out.println("Digite outro número inteiro:");
        int secondNumber = input.nextInt();

        System.out.println("Digite um número real:");
        double realNumber = input.nextDouble();

        int firstResult = (firstNumber * DOUBLE) * (secondNumber / HALF);
        double secondResult = (firstNumber * TRIPLE) + realNumber;
        double thirdResult = Math.pow(realNumber, THREETOTHE_REAL_NUMBER);
        System.out.println("A) " + firstResult + "\nB) " + secondResult + "\nC) " + thirdResult);
    }
}
