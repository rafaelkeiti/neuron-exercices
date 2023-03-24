import java.util.Scanner;

public class exercice_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = 0;
        double height = 0;
        double result = 0;

        System.out.println("Digite o valor da base:");
        base = input.nextDouble();

        System.out.println("Digite o valor da altura:");
        height = input.nextDouble();

        result = (base * height) * 2;
        System.out.println("O dobro da área do quadrado é: " + result);
    }
}
