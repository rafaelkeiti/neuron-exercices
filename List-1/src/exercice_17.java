import java.util.Scanner;

public class exercice_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width = 0;
        double length = 0;
        double resultMetroSquare = 0;
        int resultLiterCan18 = 0;
        double priceLiterCan18 = 0;
        int resultLiterCan36 = 0;
        double priceLiterCan36 = 0;
        double ink = 0;
        int cans = 0;
        int gallons = 0;
        double priceCansGallons = 0;

        System.out.println("Digite a largura");
        width = input.nextDouble();

        System.out.println("Digite o comprimento");
        length = input.nextDouble();

        resultMetroSquare = (width * length) / 6;

        resultLiterCan18 = (int) Math.ceil(resultMetroSquare / 18);
        priceLiterCan18 = resultLiterCan18 * 80;

        resultLiterCan36 = (int) Math.ceil(resultMetroSquare / 3.6);
        priceLiterCan36 = resultLiterCan36 * 25;

        ink = Math.ceil(resultMetroSquare * 1.1);
        cans = (int) Math.ceil(ink / 18);
        gallons = (int) Math.ceil((ink % 18) / 3.6);
        priceCansGallons = (cans * 80) + (gallons * 25);

        System.out.println("Será necessário " + resultLiterCan18 + " latas, um total de R$" + priceLiterCan18);
        System.out.println(" ");
        System.out.println("Será necessário " + resultLiterCan36 + " latas, um total de R$" + priceLiterCan36);
        System.out.println(" ");
        System.out.println("Um total de " + cans + " latas e um total de " + gallons + " galões.\nValor total " +
                "de R$" + priceCansGallons);


    }
}
