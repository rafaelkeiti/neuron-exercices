import java.util.Scanner;

public class exercice_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double meters = 0;
        double metersConverted = 0;

        System.out.println("Digite um valor em metros para converter em cm.");
        meters = input.nextDouble();

        metersConverted = meters * 100;
        System.out.println(metersConverted + "cm");
    }
}
