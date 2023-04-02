import java.util.Scanner;

public class exercice_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor que você ganha por hora:");
        double moneyPerHour = input.nextDouble();

        System.out.println("Digite a quantidade de horas que você trabalha:");
        int hoursWork = input.nextInt();

        double totalSalary = moneyPerHour * hoursWork;
        System.out.println("Você ganha por mês: R$ " + totalSalary);
    }
}
