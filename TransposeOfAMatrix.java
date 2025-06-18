public class TransposeOfAMatrix {
    public static void printMatrixTranspose(int[][] matrix) {
        for (int[] r: matrix) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {3, 5, 10},
                {4, 8, 8}
        };
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transpose = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Original Matrix:");
        printMatrixTranspose(matrix);

        System.out.println("Transposed Matrix:");
        printMatrixTranspose(transpose);
    }


}

