import java.util.Scanner;

public class exercice_14 {

    private static final int LIMIT_NUMBER_KG = 50;
    private static final int AMOUNT_FINE = 4;
    private static final int VALUE_INVERTER = -1;
    private static final int BASE_VALUE = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes:");
        double weightFish = input.nextDouble();

        double result = LIMIT_NUMBER_KG - weightFish;
        if (result < BASE_VALUE) {
            double amountOfTheFine = (result * AMOUNT_FINE) * VALUE_INVERTER;
            System.out.println("Você ultrapassou os 50KG e deve pagar uma multa de: R$" + amountOfTheFine);
        } else {
            System.out.println("Você não ultrapassou o peso limite.");
        }
    }
}
