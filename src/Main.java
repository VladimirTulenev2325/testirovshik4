public class Main {
    public static void main(String[] args) {
        int n = 6; // Размерность матрицы (четное число >= 2)
        int[][] matrix = createMatrix(n);
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int center = n / 2; // Индекс центральной ячейки

        // Заполнение центрального блока 2x2 нулями
        for (int i = center - 1; i <= center; i++) {
            for (int j = center - 1; j <= center; j++) {
                matrix[i][j] = 0;
            }
        }

        // Заполнение остальных ячеек значениями, увеличивающимися на 1
        int value = 1;
        for (int i = 0; i < center; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }

        for (int i = center; i < n; i++) {
            for (int j = 0; j < center; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}