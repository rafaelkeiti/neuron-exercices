import java.util.Scanner;

public class exercice_18 {

    public static final int ZERO = 0;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int TEN = 10;
    public static final int MONTH_ONE = 1;
    public static final int MONTH_TWELVE = 12;
    public static final int YEAR_ONE = 1;
    public static final int MONTH_FOUR = 4;
    public static final int MONTH_SIX = 6;
    public static final int MONTH_NINE = 9;
    public static final int MONTH_ELEVEN = 11;
    public static final int TOTAL_DAYS = 30;
    public static final int MONTH_TWO = 2;
    public static final int FOUR = 4;
    public static final int TOTAL_DAYS_TWENTY_NINE = 29;
    public static final int TOTAL_DAYS_TWENTY_EIGHT = 28;
    public static final int DAY_ONE = 1;
    public static final int ONE_HUNDRED = 100;
    public static final int FOUR_HUNDRED = 400;
    public static final int DAYS_OF_THE_MONTH = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String date;
        int day;
        int month;
        int year;
        int daysOfMonths;

        System.out.println("Digite uma date:");
        date = input.nextLine();

        if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Formato válido.");
        } else {
            System.out.println("Formato Inválido. Digite neste formato: day/mês/year");
            return;
        }

        day = Integer.parseInt(date.substring(ZERO, TWO));
        month = Integer.parseInt(date.substring(THREE, FIVE));
        year = Integer.parseInt(date.substring(SIX, TEN));

        daysOfMonths = DAYS_OF_THE_MONTH;

        if (month < MONTH_ONE || month > MONTH_TWELVE) {
            System.out.println("Mês inválido.");
        } else if (year < YEAR_ONE) {
            System.out.println("Ano inválido.");
        } else if (month == MONTH_FOUR || month == MONTH_SIX || month == MONTH_NINE || month == MONTH_ELEVEN) {
            daysOfMonths = TOTAL_DAYS;
        } else if (month == MONTH_TWO) {
            if ((year % FOUR == ZERO && year % ONE_HUNDRED != ZERO) || year % FOUR_HUNDRED == ZERO) {
                daysOfMonths = TOTAL_DAYS_TWENTY_NINE;
            } else {
                daysOfMonths = TOTAL_DAYS_TWENTY_EIGHT;
            }
        }
        if (day < DAY_ONE || day > daysOfMonths) {
            System.out.println("Data inválida.");
            return;
        }
        System.out.println("A date " + date + " é válida.");
    }
}
