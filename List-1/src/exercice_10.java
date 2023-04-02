import java.util.Scanner;

public class exercice_10 {

    private static final double NUMBER_FORM_FAHRENHEIT = 1.8;
    private static final int NUMBER_THIRTYTWO_FORM_FAHRENHEIT = 32;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        int temperatureCelsius = input.nextInt();

        double result = (temperatureCelsius * NUMBER_FORM_FAHRENHEIT) + NUMBER_THIRTYTWO_FORM_FAHRENHEIT;
        System.out.println(result + " Fahrenheit.");
    }
}
