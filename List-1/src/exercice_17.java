import java.util.Scanner;

public class exercice_17 {

    private static final int SQUARE_METERS = 6;
    private static final int EIGHTEEN_LITER_CANS = 18;
    private static final int VALUE_OF_THE_EIGHTEEN_LITER_CAN = 80;
    private static final double LITERS_GALLON_THREE_POINT_SIX = 3.6;
    private static final int VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN = 25;
    private static final double ADD_TEN_PERCENT = 1.1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura");
        double width = input.nextDouble();

        System.out.println("Digite o comprimento");
        double length = input.nextDouble();

        double resultMetroSquare = (width * length) / SQUARE_METERS;

        int resultLiterCanEighteen = (int) Math.ceil(resultMetroSquare / EIGHTEEN_LITER_CANS);
        double priceLiterCanEighteen = resultLiterCanEighteen * VALUE_OF_THE_EIGHTEEN_LITER_CAN;

        int resultLiterCanThirtySix = (int) Math.ceil(resultMetroSquare / LITERS_GALLON_THREE_POINT_SIX);
        double priceLiterCanThirtySix = resultLiterCanThirtySix * VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN;

        double ink = Math.ceil(resultMetroSquare * ADD_TEN_PERCENT);
        int cans = (int) Math.ceil(ink / EIGHTEEN_LITER_CANS);
        int gallons = (int) Math.ceil((ink % EIGHTEEN_LITER_CANS) / LITERS_GALLON_THREE_POINT_SIX);
        double priceCansGallons = (cans * VALUE_OF_THE_EIGHTEEN_LITER_CAN) + (gallons * VALUE_OF_THE_THREE_POINT_SIX_LITER_CAN);

        System.out.println("Será necessário " + resultLiterCanEighteen + " latas, um total de R$" + priceLiterCanEighteen);
        System.out.println(" ");
        System.out.println("Será necessário " + resultLiterCanThirtySix + " latas, um total de R$" + priceLiterCanThirtySix);
        System.out.println(" ");
        System.out.println("Um total de " + cans + " latas e um total de " + gallons + " galões.\nValor total " +
                "de R$" + priceCansGallons);
    }
}
