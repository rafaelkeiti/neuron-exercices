import java.util.Objects;
import java.util.Scanner;

public class exercice_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sex;
        double height = 0;
        double idealWeight = 0;

        System.out.println("Qual é sua altura?");
        height = input.nextDouble();

        System.out.println("Você é do sexo M / F?");
        sex = input.next();

        if (Objects.equals(sex, "m") || Objects.equals(sex, "M")) {
            idealWeight = (72.7 * height) - 58;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else if (Objects.equals(sex, "f") || Objects.equals(sex, "F")) {
            idealWeight = (62.1 * height) - 44.7;
            System.out.println("O seu peso ideal deve ser: " + idealWeight);
        } else {
            System.out.println("Você digitou uma opção inválida.");
        }

    }
}
