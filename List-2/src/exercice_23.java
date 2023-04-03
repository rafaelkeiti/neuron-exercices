import java.util.Scanner;

public class exercice_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é inteiro ou decimal:");
        double firstNumber = input.nextDouble();

        if (firstNumber == Math.floor(firstNumber)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
    }
}
