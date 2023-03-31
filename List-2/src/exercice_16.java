import java.util.Scanner;

public class exercice_16 {

    public static final int ZERO = 0;
    public static final int SQUARED = 2;
    public static final int FOUR_DELTA = 4;
    public static final int TWO = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.println("Digite o valor de a:");
        a = input.nextDouble();

        if (a == ZERO) {
            System.out.println("A equação não é de segundo grau!");
            return;
        }

        System.out.println("Digite o valor de b:");
        b = input.nextDouble();

        System.out.println("Digite o valor de c:");
        c = input.nextDouble();

        delta = Math.pow(b, SQUARED) - FOUR_DELTA * a * c;
        x1 = (-b + Math.sqrt(delta)) / (TWO * a);
        x2 = (-b - Math.sqrt(delta)) / (TWO * a);

        if (delta < ZERO) {
            System.out.println("Não possui raízes reais.");
        } else if (delta == ZERO) {
            System.out.println(+x1);
        } else {
            System.out.println("A raiz x1 é " + x1 + " | raiz x2 é " + x2);
        }
    }
}
