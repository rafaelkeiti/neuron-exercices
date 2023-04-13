import java.util.Scanner;

public class exercice_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String response = "S";
        int years = 0;

        while (response.equalsIgnoreCase("S")) {
            System.out.println("Digite a quantidade de habitantes do País menor:");
            int countryA = input.nextInt();

            while (countryA <= 0) {
                System.out.println("Digite um valor válido:");
                countryA = input.nextInt();
            }

            System.out.println("Digite a porcentagem de crescimento do País:");
            double percentageA = input.nextDouble();

            while (percentageA <= 0) {
                System.out.println("Digite um valor válido:");
                percentageA = input.nextDouble();
            }

            System.out.println("Digite a quantidade de habitantes do País maior:");
            int countryB = input.nextInt();

            while (countryB <= 0) {
                System.out.println("Digite um valor válido:");
                countryB = input.nextInt();
            }

            System.out.println("Digite a porcentagem de crescimento do País:");
            double percentageB = input.nextDouble();

            while (percentageB <= 0) {
                System.out.println("Digite um valor válido:");
                percentageB = input.nextDouble();
            }

            if (countryA > countryB) {
                System.out.println("O primeiro país deve ser MENOR que o segundo país!");
                return;
            }

            while (countryA < countryB) {
                countryA += countryA * (percentageA / 100);
                countryB += countryB * (percentageB / 100);
                years++;
            }
            System.out.println("Quantidade de anos para ultrapassar: " + years + "\nPaís A: " + countryA + "\nPaís B: " + countryB);

            System.out.println("Deseja continuar? (S/N)");
            response = input.next();
            years = 0;
        }
    }
}
