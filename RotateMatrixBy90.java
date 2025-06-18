import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
       // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 4},
                {9, 5, 3},
                {4, 7, 6}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotate(matrix);
        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }
}
