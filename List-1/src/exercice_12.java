import java.util.Scanner;

public class exercice_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height = 0;
        double IdealWeight = 0;

        System.out.println("Digite sua altura:");
        height = input.nextDouble();

        IdealWeight = (72.7 * height) - 58;
        System.out.println("Seu peso ideal é: " + IdealWeight);
    }
}
