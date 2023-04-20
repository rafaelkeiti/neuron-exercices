import java.util.Scanner;

public class exercice_04 {

    public static final int FIRST_LETTER = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowels = "AEIOU";

        System.out.println("Digite uma letter:");
        String letter = input.nextLine().toUpperCase();

        if (vowels.contains(String.valueOf(letter.charAt(FIRST_LETTER)))) {
            System.out.println("A letter (" + letter.charAt(FIRST_LETTER) + ") é uma vogal.");
        } else {
            System.out.println("A letter (" + letter.charAt(FIRST_LETTER) + ") é uma consoante.");
        }
    }
}
