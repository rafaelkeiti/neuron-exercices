import java.util.Scanner;

public class exercice_17 {

    public static final int SQUARE_METERS = 6;
    public static final int EIGHTEEN_LITER_CANS = 18;
    public static final int VALUE_OF_THE_EIGHTEEN_LITER_CAN = 80;
    public static final double LITERS_GALLON_THREE_POINT_SIX = 3.6;
    public static final int VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN = 25;
    public static final double ADD_TEN_PERCENT = 1.1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width;
        double length;
        double resultMetroSquare;
        int resultLiterCan18;
        double priceLiterCan18;
        int resultLiterCan36;
        double priceLiterCan36;
        double ink;
        int cans;
        int gallons;
        double priceCansGallons;

        System.out.println("Digite a largura");
        width = input.nextDouble();

        System.out.println("Digite o comprimento");
        length = input.nextDouble();

        resultMetroSquare = (width * length) / SQUARE_METERS;

        resultLiterCan18 = (int) Math.ceil(resultMetroSquare / EIGHTEEN_LITER_CANS);
        priceLiterCan18 = resultLiterCan18 * VALUE_OF_THE_EIGHTEEN_LITER_CAN;

        resultLiterCan36 = (int) Math.ceil(resultMetroSquare / LITERS_GALLON_THREE_POINT_SIX);
        priceLiterCan36 = resultLiterCan36 * VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN;

        ink = Math.ceil(resultMetroSquare * ADD_TEN_PERCENT);
        cans = (int) Math.ceil(ink / EIGHTEEN_LITER_CANS);
        gallons = (int) Math.ceil((ink % EIGHTEEN_LITER_CANS) / LITERS_GALLON_THREE_POINT_SIX);
        priceCansGallons = (cans * VALUE_OF_THE_EIGHTEEN_LITER_CAN) + (gallons * VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN);

        System.out.println("Será necessário " + resultLiterCan18 + " latas, um total de R$" + priceLiterCan18);
        System.out.println(" ");
        System.out.println("Será necessário " + resultLiterCan36 + " latas, um total de R$" + priceLiterCan36);
        System.out.println(" ");
        System.out.println("Um total de " + cans + " latas e um total de " + gallons + " galões.\nValor total " +
                "de R$" + priceCansGallons);
    }
}
