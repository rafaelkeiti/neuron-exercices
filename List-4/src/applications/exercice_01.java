package applications;

import static utils.VectorUtils.*;

public class exercice_01 {

    public static void main(String[] args) {
        int[] vectorA = new int[]{1, 2, 3, 4, 5};
        int[] vectorB = new int[5];

        for (int i = ZERO_START; i < vectorB.length; i++) {
            vectorB[i] = vectorA[i];
        }

        printVector("VectorA", vectorA);
        printVector("VectorB", vectorB);
    }
}
