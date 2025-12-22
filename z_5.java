import java.util.*;

public class Main {
    public static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;}}

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;}}

    public static void main(String[] args) {
        int[] x = {5, -2, 9, 1, 4, 3, 7, 2}; 
        int n = x.length;

        int[] y = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] > 3) {
                y[k] = x[i];
                k++;}}

        selectionSort(y, k);

        System.out.print("Исходный массив x: ");
        for (int v : x) System.out.print(v + " ");
        System.out.println();

        System.out.print("Новый массив y (>3): ");
        for (int i = 0; i < k; i++) System.out.print(y[i] + " ");
        System.out.println();

        System.out.println("Количество элементов в y: " + k);}
}