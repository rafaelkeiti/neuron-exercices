import java.util.Scanner;

public class exercice_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperatureCelsius = 0;
        double result = 0;

        System.out.println("Digite uma temperatura em Celsius:");
        temperatureCelsius = input.nextInt();

        result = (temperatureCelsius * 1.8) + 32;
        System.out.println(result + " Fahrenheit.");
    }
}
