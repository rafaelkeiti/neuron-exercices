import java.util.Scanner;

public class exercice_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int firstNumber = input.nextInt();

        switch (firstNumber) {
            case 1 -> System.out.println("Segunda-Feira");
            case 2 -> System.out.println("Terça-Feira");
            case 3 -> System.out.println("Quarta-Feira");
            case 4 -> System.out.println("Quinta-Feira");
            case 5 -> System.out.println("Sexta-Feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }
}
