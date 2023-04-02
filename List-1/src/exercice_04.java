import java.util.Scanner;

public class exercice_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double proofNote = 0;

        System.out.println("(Digite quantas notas você quer obter a média.)");
        int amountOfNotes = input.nextInt();

        for (int i = 0; i < amountOfNotes; i++) {
            System.out.println("Nota: ");
            proofNote += input.nextDouble();
        }

        double totalAverage = proofNote / amountOfNotes;
        System.out.println("Sua média foi de: " + totalAverage);
    }
}
