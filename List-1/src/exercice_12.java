import java.util.Scanner;

public class exercice_12 {

    public static final double IDEAL_WEIGHT_FORMULA_NUMBER = 72.7;
    public static final int NUMBER_FIFTYEIGHT_FORMULA_IDEAL_WEIGHT = 58;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;
        double idealWeight;

        System.out.println("Digite sua altura:");
        height = input.nextDouble();

        idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER * height) - NUMBER_FIFTYEIGHT_FORMULA_IDEAL_WEIGHT;
        System.out.println("Seu peso ideal é: " + idealWeight);
    }
}
