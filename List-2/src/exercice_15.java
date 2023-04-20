import java.util.Scanner;

public class exercice_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado:");
        double firstSide = input.nextDouble();

        System.out.println("Digite o valor do segundo lado:");
        double secondSide = input.nextDouble();

        System.out.println("Digite o valor do terceiro lado:");
        double thirdSide = input.nextDouble();

        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            if (firstSide == secondSide && secondSide == thirdSide) {
                System.out.println("Triângulo Equilátero");
            } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
