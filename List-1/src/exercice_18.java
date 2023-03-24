import java.util.Scanner;

public class exercice_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double download = 0;
        double speedNet = 0;
        double time = 0;

        System.out.println("Digite o tamanho do arquivo em MB:");
        download = input.nextDouble();

        System.out.println("Digite a velocidade da internet:");
        speedNet = input.nextDouble();

        time = (download / (speedNet / 8)) / 60;
        System.out.printf("O valor em minutos é: %.2f", time);
    }
}
