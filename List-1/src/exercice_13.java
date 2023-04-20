import java.util.Scanner;

public class exercice_13 {

    private static final double IDEAL_WEIGHT_FORMULA_NUMBER_MEN = 72.7;
    private static final int NUMBER_FIFTY_EIGHT_FORMULA_IDEAL_WEIGHT = 58;
    private static final double IDEAL_WEIGHT_FORMULA_NUMBER_WOMEN = 62.1;
    private static final double NEGATIVE_NUMBER_IDEAL_WEIGHT_FORMULA_WOMEN = 44.7;
    private static final String WOMAN_SEX = "F";
    private static final String MALE_SEX = "M";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é sua altura?");
        double height = input.nextDouble();

        System.out.println("Você é do sexo M / F?");
        String sex = input.next();

        if (sex.equalsIgnoreCase(WOMAN_SEX)) {
            double idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER_MEN * height) - NUMBER_FIFTY_EIGHT_FORMULA_IDEAL_WEIGHT;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else if (sex.equalsIgnoreCase(MALE_SEX)) {
            double idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER_WOMEN * height) - NEGATIVE_NUMBER_IDEAL_WEIGHT_FORMULA_WOMEN;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else {
            System.out.println("Você digitou uma opção inválida.");
        }
    }
}
