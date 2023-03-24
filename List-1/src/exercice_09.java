import java.util.Scanner;

public class exercice_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FahrenheitTemperature = 0;
        int result = 0;

        System.out.println("Digite uma temperatura em fahrenheit:");
        FahrenheitTemperature = input.nextInt();

        result = 5 * ((FahrenheitTemperature - 32) / 9);
        System.out.println(result + " Celsius.");
    }
}
