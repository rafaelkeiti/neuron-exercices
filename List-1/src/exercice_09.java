import java.util.Scanner;

public class exercice_09 {

    private static final int NUMBER_FIVE_CONST_FORMULA = 5;
    private static final int NUMBER_THIRTYTWO_CONST_FORMULA = 32;
    private static final int NUMBER_NINE_CONST_FORMULA = 9;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma temperatura em fahrenheit:");
        int fahrenheitTemperature = input.nextInt();

        int result = NUMBER_FIVE_CONST_FORMULA * ((fahrenheitTemperature - NUMBER_THIRTYTWO_CONST_FORMULA) / NUMBER_NINE_CONST_FORMULA);
        System.out.println(result + " Celsius.");
    }
}
