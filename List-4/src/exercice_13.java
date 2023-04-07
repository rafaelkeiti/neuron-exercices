import java.util.Scanner;

public class exercice_13 {

    private static final int ZERO_START = 0;
    private static final int DIVIDING_BY_TWO = 2;
    private static final int ZERO_REST = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                System.out.println("Digite um valor para preencher a matriz na posição (Linha: " + i + " | Coluna: " + j + ")");
                array[i][j] = input.nextInt();
                if (array[i][j] % DIVIDING_BY_TWO == ZERO_REST) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
            }
        }

        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("Pares: " + evenNumber + " | " + "Ímpares: " + oddNumber);
    }
}
