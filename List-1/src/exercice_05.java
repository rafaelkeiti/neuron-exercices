import java.util.Scanner;

public class exercice_05 {

    private static final int METER_VALUE_IN_CM = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em metros para converter em cm.");
        double meters = input.nextDouble();

        double metersConverted = meters * METER_VALUE_IN_CM;
        System.out.println(metersConverted + "cm");
    }
}
