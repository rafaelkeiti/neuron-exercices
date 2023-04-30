package application;

import static utils.VectorUtils.*;

public class exercice_11 {

    private static final int TIMES_TEN = 10;

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int higherNumber = 0;
        int positionLine = 0;
        int positionColumn = 0;

        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * TIMES_TEN);
            }
        }

        printArray(array);

        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                if (array[i][j] > higherNumber) {
                    higherNumber = array[i][j];
                    positionLine = i;
                    positionColumn = j;
                }
            }
        }
        System.out.println("Maior número: " + higherNumber + "\nPosição linha: " + positionLine + "\nPosição coluna: " + positionColumn);
    }
}
