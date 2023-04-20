import java.util.Scanner;

public class exercice_16 {

    private static final int SQUARE_METERS = 3;
    private static final int LITERS_OF_PAINT = 18;
    private static final int VALUE_OF_THE_EIGHTEEN_LITER_CAN = 80;
    private static final int SMALLER_THAN_A_WHOLE_CAN = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura:");
        double width = input.nextDouble();

        System.out.println("Digite o comprimento:");
        double length = input.nextDouble();

        double resultMetroSquare = (width * length) / SQUARE_METERS;
        double resultLiterCan = resultMetroSquare / LITERS_OF_PAINT;
        double resultPrice = resultLiterCan * VALUE_OF_THE_EIGHTEEN_LITER_CAN;

        if (resultLiterCan < SMALLER_THAN_A_WHOLE_CAN) {
            System.out.printf("Infelizmente vendemos a lata fechada com 18 litros. Você precisaria usar somente %.2f litros.", resultLiterCan);
        } else {
            System.out.printf("O total de tinta é de: %.2f litros, precisaremos de %.2f latas um total de R$ %.2f", resultMetroSquare, resultLiterCan, resultPrice);
        }
    }
}
