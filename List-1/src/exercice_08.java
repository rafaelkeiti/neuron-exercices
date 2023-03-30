import java.util.Scanner;

public class exercice_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double moneyPerHour;
        int hoursWork;
        double totalSalary;

        System.out.println("Digite o valor que você ganha por hora:");
        moneyPerHour = input.nextDouble();

        System.out.println("Digite a quantidade de horas que você trabalha:");
        hoursWork = input.nextInt();

        totalSalary = moneyPerHour * hoursWork;
        System.out.println("Você ganha por mês: R$ " + totalSalary);
    }
}
