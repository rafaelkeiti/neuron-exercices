import java.util.Scanner;

public class exercice_07 {

    private static final int CONSTANT_NUMBER_TWO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura:");
        double height = input.nextDouble();

        double result = (base * height) * CONSTANT_NUMBER_TWO;
        System.out.println("O dobro da área do quadrado é: " + result);
    }
}
