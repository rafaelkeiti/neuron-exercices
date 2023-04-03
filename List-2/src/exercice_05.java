import java.util.Scanner;

public class exercice_05 {

    private static final int AVERAGE_PASSED = 7;
    private static final int FULL_MARK = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double firstTestGrade = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        double secondTestGrade = input.nextDouble();

        double average = (firstTestGrade + secondTestGrade) / 2;
        if (average >= AVERAGE_PASSED && average < FULL_MARK) {
            System.out.println("Aprovado.");
        } else if (average < AVERAGE_PASSED) {
            System.out.println("Reprovado.");
        } else if (average == FULL_MARK) {
            System.out.println("Aprovado com Distinção.");
        }
    }
}
