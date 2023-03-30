import java.util.Scanner;

public class exercice_09 {

    public static final int NUMBER_FIVE_CONST_FORMULA = 5;
    public static final int NUMBER_THIRTYTWO_CONST_FORMULA = 32;
    public static final int NUMBER_NINE_CONST_FORMULA = 9;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FahrenheitTemperature;
        int result;

        System.out.println("Digite uma temperatura em fahrenheit:");
        FahrenheitTemperature = input.nextInt();

        result = NUMBER_FIVE_CONST_FORMULA * ((FahrenheitTemperature - NUMBER_THIRTYTWO_CONST_FORMULA) / NUMBER_NINE_CONST_FORMULA);
        System.out.println(result + " Celsius.");
    }
}
