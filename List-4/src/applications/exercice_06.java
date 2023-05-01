package applications;

import static utils.VectorUtils.*;

public class exercice_06 {

    public static void main(String[] args) {
        final int[] vectorA = new int[10];
        final int[] vectorB = new int[10];
        final int[] vectorC = new int[10];

        generateValuesVector(vectorA);
        generateValuesVector(vectorB);

        for (int i = ZERO_START; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
        printVector("VectorC", vectorC);
    }
}
