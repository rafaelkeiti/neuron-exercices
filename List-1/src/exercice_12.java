import java.util.Scanner;

public class exercice_12 {

    private static final double IDEAL_WEIGHT_FORMULA_NUMBER = 72.7;
    private static final int NUMBER_FIFTYEIGHT_FORMULA_IDEAL_WEIGHT = 58;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double height = input.nextDouble();

        double idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER * height) - NUMBER_FIFTYEIGHT_FORMULA_IDEAL_WEIGHT;
        System.out.println("Seu peso ideal é: " + idealWeight);
    }
}
