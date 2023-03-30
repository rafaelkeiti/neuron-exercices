import java.util.Scanner;

public class exercice_06 {

    public static final double PI_VALUE = 3.14;
    public static final int SQUARED = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ray;
        double areaValue;

        System.out.println("Digite o raio do circulo para calcular a área.");
        ray = input.nextDouble();

        areaValue = PI_VALUE * Math.pow(ray, SQUARED);
        System.out.println("A área é: " + areaValue);
    }
}
