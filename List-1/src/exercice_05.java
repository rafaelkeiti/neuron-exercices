import java.util.Scanner;

public class exercice_05 {

    public static final int METER_VALUE_IN_CM = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double meters;
        double metersConverted;

        System.out.println("Digite um valor em metros para converter em cm.");
        meters = input.nextDouble();

        metersConverted = meters * METER_VALUE_IN_CM;
        System.out.println(metersConverted + "cm");
    }
}
