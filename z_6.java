import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 4; 
        int cols = 5; 
        int[][] matrix = new int[rows][cols];
        Random rnd = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rnd.nextInt(21) - 10;}}

        System.out.println("Матрица:");
        for (int[] row : matrix) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();}

        System.out.println("\nСреднее геометрическое положительных элементов по столбцам:");

        for (int j = 0; j < cols; j++) {
            double product = 1.0;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    product *= matrix[i][j];
                    count++;}}

            if (count > 0) {
                double geometricMean = Math.pow(product, 1.0 / count);
                System.out.printf("Столбец %d: %.4f%n", j, geometricMean);
            } else {
                System.out.printf("Столбец %d: нет положительных элементов%n", j);}}}
}