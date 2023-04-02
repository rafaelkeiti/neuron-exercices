import java.util.Scanner;

public class exercice_06 {

    private static final double PI_VALUE = 3.14;
    private static final int SQUARED = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do circulo para calcular a área.");
        double ray = input.nextDouble();

        double areaValue = PI_VALUE * Math.pow(ray, SQUARED);
        System.out.println("A área é: " + areaValue);
    }
}
