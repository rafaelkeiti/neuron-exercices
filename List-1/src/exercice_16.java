import java.util.Scanner;

public class exercice_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width = 0;
        double length = 0;
        double resultMetroSquare = 0;
        double resultLiterCan = 0;
        double resultPrice = 0;

        System.out.println("Digite a largura:");
        width = input.nextDouble();

        System.out.println("Digite o comprimento:");
        length = input.nextDouble();

        resultMetroSquare = (width * length) / 3;
        resultLiterCan = resultMetroSquare / 18;
        resultPrice = resultLiterCan * 80;

        if (resultLiterCan < 1) {
            System.out.printf("Infelizmente vendemos a lata fechada com 18 litros. Você precisaria usar somente %.2f litros.", resultLiterCan);
        } else {
            System.out.printf("O total de tinta é de: %.2f litros, precisaremos de %.2f latas um total de R$ %.2f", resultMetroSquare, resultLiterCan, resultPrice);
        }
    }
}
