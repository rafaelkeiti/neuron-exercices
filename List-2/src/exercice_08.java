import java.util.Scanner;

public class exercice_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto:");
        double firstProduct = input.nextDouble();

        System.out.println("Digite o valor do segundo produto:");
        double secondProduct = input.nextDouble();

        System.out.println("Digite o valor do terceiro produto:");
        double thirdProduct = input.nextDouble();

        if (firstProduct < secondProduct && firstProduct < thirdProduct) {
            System.out.println("O produto 1 é mais barato, valor: R$ " + firstProduct);

        } else if (secondProduct < firstProduct && secondProduct < thirdProduct) {
            System.out.println("O produto 2 é mais barato, valor: R$ " + secondProduct);
        } else if (thirdProduct < firstProduct && thirdProduct < secondProduct) {
            System.out.println("O produto 3 é mais barato, valor: R$ " + thirdProduct);
        } else {
            System.out.println("Todos produtos possuem valores iguais.");
        }
    }
}
