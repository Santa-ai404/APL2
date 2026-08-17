import java.util.*;

class MatrixMismatchException extends Exception {
    public MatrixMismatchException(String message) {
        super(message);
    }
}

public class Problem2_MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) throws MatrixMismatchException {
        int rA = A.length;
        int cA = A[0].length;
        int rB = B.length;
        int cB = B[0].length;

        if (cA != rB) {
            throw new MatrixMismatchException("Columns of A must equal rows of B");
        }

        int[][] result = new int[rA][cB];
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cB; j++) {
                int sum = 0;
                for (int k = 0; k < cA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int rA = sc.nextInt(), cA = sc.nextInt();
            int[][] A = new int[rA][cA];
            for (int i = 0; i < rA; i++) for (int j = 0; j < cA; j++) A[i][j] = sc.nextInt();

            int rB = sc.nextInt(), cB = sc.nextInt();
            int[][] B = new int[rB][cB];
            for (int i = 0; i < rB; i++) for (int j = 0; j < cB; j++) B[i][j] = sc.nextInt();

            int[][] result = multiplyMatrices(A, B);
            for (int[] row : result) System.out.println(Arrays.toString(row));

        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
