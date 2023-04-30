package application;

import static utils.VectorUtils.*;

public class exercice_10 {

    private static final int ADDING_FIVE_MORE = 5;
    private static final int REST_OF_DIVISION = 2;

    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i + ADDING_FIVE_MORE;
        }

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i] % REST_OF_DIVISION;
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}
