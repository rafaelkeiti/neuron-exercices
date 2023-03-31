import java.util.Scanner;

public class exercice_01 {

    public static final int MINIMUM_GRADE = 0;
    public static final int FULL_MARK = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double proofNote;

        System.out.println("Digite uma nota de 0 até 10:");
        proofNote = input.nextDouble();

        while (proofNote < MINIMUM_GRADE || proofNote > FULL_MARK) {
            System.out.println("Nota inválida.");
            System.out.println("Digite uma nota válida de 0 até 10:");
            proofNote = input.nextDouble();
        }

        System.out.println(proofNote);
    }
}
