import java.util.Scanner;

public class exercice_20 {

    private static final int AVERAGE = 7;
    private static final int FULL_MARK = 10;
    private static final int GRADE_AVERAGE = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double firstNote = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        double secondNote = input.nextDouble();

        System.out.println("Digite a terceira nota:");
        double thirdNote = input.nextDouble();

        double average = (firstNote + secondNote + thirdNote) / GRADE_AVERAGE;

        if (average >= AVERAGE && average < FULL_MARK) {
            System.out.println("APROVADO");
        } else if (average == FULL_MARK) {
            System.out.println("Aprovado com distinção.");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
