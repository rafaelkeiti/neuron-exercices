package applications;

import static utils.VectorUtils.*;

public class exercice_08 {

    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        int[] vectorC = new int[10];

        generateValuesVector(vectorA);

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i];
        }

        for (int i = ZERO_START; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
        printVector("VectorC", vectorC);
    }
}
