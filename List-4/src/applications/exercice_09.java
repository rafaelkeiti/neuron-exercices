package application;

import static utils.VectorUtils.*;

public class exercice_09 {

    private static final int ADDING_ONE_MORE = 1;

    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        double[] vectorC = new double[10];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = (i + ADDING_ONE_MORE);
        }

        for (int i = ZERO_START; i < vectorC.length; i++) {
            vectorC[i] = (double) vectorA[i] / vectorB[i];
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
        printVector("VectorC", vectorC);
    }
}
