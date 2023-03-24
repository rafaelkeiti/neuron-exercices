import java.util.Scanner;

public class exercice_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightFish = 0;
        double amountOfTheFine = 0;
        double result = 0;

        System.out.println("Digite o peso dos peixes:");
        weightFish = input.nextDouble();

        result = 50 - weightFish;
        if (result < 0) {
            amountOfTheFine = (result * 4) * -1;
            System.out.println("Você ultrapassou os 50KG e deve pagar uma multa de: R$" + amountOfTheFine);
        } else {
            System.out.println("Você não ultrapassou o peso limite.");
        }
    }
}
