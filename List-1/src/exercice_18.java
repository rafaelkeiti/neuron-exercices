import java.util.Scanner;

public class exercice_18 {

    private static final int CONVERSION_NUMBER = 8;
    private static final int NUMBER_TO_CONVERT_TO_MINUTES = 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em MB:");
        double download = input.nextDouble();

        System.out.println("Digite a velocidade da internet:");
        double speedNet = input.nextDouble();

        double time = (download / (speedNet / CONVERSION_NUMBER)) / NUMBER_TO_CONVERT_TO_MINUTES;
        System.out.printf("O valor em minutos é: %.2f", time);
    }
}
