import java.util.Scanner;

public class exercice_07 {

    public static final int CONSTANT_NUMBER_TWO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base;
        double height;
        double result;

        System.out.println("Digite o valor da base:");
        base = input.nextDouble();

        System.out.println("Digite o valor da altura:");
        height = input.nextDouble();

        result = (base * height) * CONSTANT_NUMBER_TWO;
        System.out.println("O dobro da área do quadrado é: " + result);
    }
}
