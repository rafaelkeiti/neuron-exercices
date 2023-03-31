import java.util.Scanner;

public class exercice_11 {

    public static final int BASE_TWENTY_PERCENT_INCREASE = 280;
    public static final int BASE_FIFTEEN_PERCENT_INCREASE = 700;
    public static final int BASE_TEN_PERCENT_INCREASE = 1500;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double wage;
        double salaryReadjustment = 0;
        double increase = 0;
        String percentage = "";

        System.out.println("Digite o salário do colaborador:");
        wage = input.nextDouble();

        if (wage <= BASE_TWENTY_PERCENT_INCREASE) {
            salaryReadjustment = wage * 1.2;
            increase = salaryReadjustment - wage;
            percentage = "20%";
        } else if (wage > BASE_TWENTY_PERCENT_INCREASE && wage < BASE_FIFTEEN_PERCENT_INCREASE) {
            salaryReadjustment = wage * 1.15;
            increase = salaryReadjustment - wage;
            percentage = "15%";
        } else if (wage >= BASE_FIFTEEN_PERCENT_INCREASE && wage < BASE_TEN_PERCENT_INCREASE) {
            salaryReadjustment = wage * 1.1;
            increase = salaryReadjustment - wage;
            percentage = "10%";
        } else if (wage >= BASE_TEN_PERCENT_INCREASE) {
            salaryReadjustment = wage * 1.05;
            increase = salaryReadjustment - wage;
            percentage = "5%";
        }
        System.out.println("Salário: R$" + wage +
                "\nPercentual de aumento: " + percentage +
                "\nValor do aumento: R$" + increase +
                "\nSalário com reajuste: R$" + salaryReadjustment);
    }
}
