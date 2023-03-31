import java.util.Scanner;

public class exercice_05 {

    public static final int AVERAGE_PASSED = 7;
    public static final int FULL_MARK = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstTestGrade;
        double secondTestGrade;
        double average;

        System.out.println("Digite a primeira nota:");
        firstTestGrade = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        secondTestGrade = input.nextDouble();

        average = (firstTestGrade + secondTestGrade) / 2;
        if (average >= AVERAGE_PASSED && average < FULL_MARK) {
            System.out.println("Aprovado.");
        } else if (average < AVERAGE_PASSED) {
            System.out.println("Reprovado.");
        } else if (average == FULL_MARK) {
            System.out.println("Aprovado com Distinção.");
        }
    }
}
