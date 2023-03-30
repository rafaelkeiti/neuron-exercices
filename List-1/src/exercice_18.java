import java.util.Scanner;

public class exercice_18 {

    public static final int CONVERSION_NUMBER = 8;
    public static final int NUMBER_TO_CONVERT_TO_MINUTES = 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double download;
        double speedNet;
        double time;

        System.out.println("Digite o tamanho do arquivo em MB:");
        download = input.nextDouble();

        System.out.println("Digite a velocidade da internet:");
        speedNet = input.nextDouble();

        time = (download / (speedNet / CONVERSION_NUMBER)) / NUMBER_TO_CONVERT_TO_MINUTES;
        System.out.printf("O valor em minutos é: %.2f", time);
    }
}
