import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 5; 
        int[][] A = new int[n][n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rnd.nextInt(21) - 10;}}

        System.out.println("Матрица A:");
        for (int[] row : A) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();}

        double sum = 0;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int value = A[i][i + 1]; 
            
            if (value > 0) {
                sum += value;
                count++;}}

        if (count > 0) {
            double average = sum / count;
            System.out.println("\nСреднее арифметическое положительных элементов над главной диагональю: " + average);
        } else {
            System.out.println("\nНа параллели выше главной диагонали нет положительных элементов.");}}
}