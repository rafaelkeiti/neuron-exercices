import java.util.Scanner;

public class exercice_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int workedHours = 0;
        double earningsPerHour = 0, salaryTotal = 0, incomeTax = 0, inss = 0, syndicate = 0, netSalary = 0;

        System.out.println("Quanto você recebe por horas trabalhadas?");
        earningsPerHour = input.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        workedHours = input.nextInt();

        salaryTotal = earningsPerHour * workedHours;
        incomeTax = salaryTotal * 0.11;
        inss = (salaryTotal - incomeTax) * 0.08;
        syndicate = (salaryTotal - inss) * 0.05;
        netSalary = (salaryTotal - incomeTax - inss - syndicate);

        System.out.println("O salário bruto é de: " + salaryTotal +
                "\nO IR foi de: " + incomeTax + "\nINSS: " + inss +
                "\nSindicato: " + syndicate + "\nSalário Líquido: " + netSalary);
    }
}
