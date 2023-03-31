import java.util.Scanner;

public class exercice_20 {

    public static final int AVERAGE = 7;
    public static final int FULL_MARK = 10;
    public static final int GRADE_AVERAGE = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNote;
        double secondNote;
        double thirdNote;
        double average;

        System.out.println("Digite a primeira nota:");
        firstNote = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        secondNote = input.nextDouble();

        System.out.println("Digite a terceira nota:");
        thirdNote = input.nextDouble();

        average = (firstNote + secondNote + thirdNote) / GRADE_AVERAGE;

        if (average >= AVERAGE && average < FULL_MARK) {
            System.out.println("APROVADO");
        } else if (average == FULL_MARK) {
            System.out.println("Aprovado com distinção.");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
