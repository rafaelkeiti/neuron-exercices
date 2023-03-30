import java.util.Scanner;

public class exercice_13 {

    public static final double IDEAL_WEIGHT_FORMULA_NUMBER_MEN = 72.7;
    public static final int NUMBER_FIFTY_EIGHT_FORMULA_IDEAL_WEIGHT = 58;
    public static final double IDEAL_WEIGHT_FORMULA_NUMBER_WOMEN = 62.1;
    public static final double NEGATIVE_NUMBER_IDEAL_WEIGHT_FORMULA_WOMEN = 44.7;
    public static final String WOMAN_SEX = "F";
    public static final String MALE_SEX = "M";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sex;
        double height;
        double idealWeight;

        System.out.println("Qual é sua altura?");
        height = input.nextDouble();

        System.out.println("Você é do sexo M / F?");
        sex = input.next();

        if (sex.equalsIgnoreCase(WOMAN_SEX)) {
            idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER_MEN * height) - NUMBER_FIFTY_EIGHT_FORMULA_IDEAL_WEIGHT;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else if (sex.equalsIgnoreCase(MALE_SEX)) {
            idealWeight = (IDEAL_WEIGHT_FORMULA_NUMBER_WOMEN * height) - NEGATIVE_NUMBER_IDEAL_WEIGHT_FORMULA_WOMEN;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else {
            System.out.println("Você digitou uma opção inválida.");
        }
    }
}
