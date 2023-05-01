package applications;

import static utils.VectorUtils.*;

public class exercice_12 {

    private static final int TIMES_TEN = 10;

    public static void main(String[] args) {
        final int[][] array = new int[10][10];

        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * TIMES_TEN);
            }
        }

        printArray(array);

        int highNumberOnTheLine = array[4][0];
        int lowNumberOnTheLine = array[4][0];
        int highNumberOnTheColumn = array[0][6];
        int lowNumberOnTheColumn = array[0][6];
        for (int[] ints : array) {
            for (int j = ZERO_START; j < array[4].length; j++) {
                if (array[4][j] > highNumberOnTheLine) {
                    highNumberOnTheLine = array[4][j];
                }
                if (array[4][j] < lowNumberOnTheLine) {
                    lowNumberOnTheLine = array[4][j];
                }
                if (ints[6] > highNumberOnTheColumn) {
                    highNumberOnTheColumn = ints[6];
                }
                if (ints[6] < lowNumberOnTheColumn) {
                    lowNumberOnTheColumn = ints[6];
                }
            }
        }
        System.out.println("Linha 5 (" + "Maior: " + highNumberOnTheLine + " Menor: " + lowNumberOnTheLine + ")" +
                "\nColuna 7 (" + "Maior: " + highNumberOnTheColumn + " Menor: " + lowNumberOnTheColumn + ")");
    }
}
