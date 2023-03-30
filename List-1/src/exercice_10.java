import java.util.Scanner;

public class exercice_10 {

    public static final double NUMBER_FORM_FAHRENHEIT = 1.8;
    public static final int NUMBER_THIRTYTWO_FORM_FAHRENHEIT = 32;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperatureCelsius;
        double result;

        System.out.println("Digite uma temperatura em Celsius:");
        temperatureCelsius = input.nextInt();

        result = (temperatureCelsius * NUMBER_FORM_FAHRENHEIT) + NUMBER_THIRTYTWO_FORM_FAHRENHEIT;
        System.out.println(result + " Fahrenheit.");
    }
}
