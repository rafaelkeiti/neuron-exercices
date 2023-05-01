package utils;

public class VectorUtils {

    public static final int ZERO_START = 0;

    public static void printVector(final String s, final int[] vectorA) {
        System.out.print("\n" + s + " - ");
        for (int j : vectorA) {
            System.out.print(j + " | ");
        }
    }

    public static void printVector(final String s, final double[] vectorB) {
        System.out.print("\n" + s + " - ");
        for (double v : vectorB) {
            System.out.printf("%.2f | ", v);
        }
    }

    public static void printArray(final int[][] array) {
        for (int i = ZERO_START; i < array.length; i++) {
            for (int j = ZERO_START; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void generateValuesVector(final int[] vectorA) {
        for (int i = ZERO_START; i < vectorA.length; i++) {
            vectorA[i] = i;
        }
    }
}