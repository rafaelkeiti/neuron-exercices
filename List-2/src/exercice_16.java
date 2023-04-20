import java.util.Scanner;

public class exercice_16 {

    private static final int ZERO = 0;
    private static final int SQUARED = 2;
    private static final int FOUR_DELTA = 4;
    private static final int TWO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = input.nextDouble();

        if (a == ZERO) {
            System.out.println("A equação não é de segundo grau!");
            return;
        }

        System.out.println("Digite o valor de b:");
        double b = input.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = input.nextDouble();

        double delta = Math.pow(b, SQUARED) - FOUR_DELTA * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (TWO * a);
        double x2 = (-b - Math.sqrt(delta)) / (TWO * a);

        if (delta < ZERO) {
            System.out.println("Não possui raízes reais.");
        } else if (delta == ZERO) {
            System.out.println(+x1);
        } else {
            System.out.println("A raiz x1 é " + x1 + " | raiz x2 é " + x2);
        }
    }
}
