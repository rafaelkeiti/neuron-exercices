import java.util.Scanner;

public class exercice_11 {

    public static final int DOUBLE = 2;
    public static final int HALF = 2;
    public static final int TRIPLE = 3;
    public static final int THREETOTHE_REAL_NUMBER = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        double realNumber;
        int firstResult;
        double secondResult;
        double thirdResult;

        System.out.println("Digite um número inteiro:");
        firstNumber = input.nextInt();

        System.out.println("Digite outro número inteiro:");
        secondNumber = input.nextInt();

        System.out.println("Digite um número real:");
        realNumber = input.nextDouble();

        firstResult = (firstNumber * DOUBLE) * (secondNumber / HALF);
        secondResult = (firstNumber * TRIPLE) + realNumber;
        thirdResult = Math.pow(realNumber, THREETOTHE_REAL_NUMBER);
        System.out.println("A) " + firstResult + "\nB) " + secondResult + "\nC) " + thirdResult);
    }
}
