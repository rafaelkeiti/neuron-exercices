import java.util.Scanner;

public class exercice_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ray = 0;
        double area = 0;

        System.out.println("Digite o raio do circulo para calcular a área.");
        ray = input.nextDouble();

        area = 3.14 * Math.pow(ray, 2);
        System.out.println("A área é: " + area);
    }
}
