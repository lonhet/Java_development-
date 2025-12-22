import java.util.Random;
public class Main {
    public static double[] CreateReciprocalFraction(int[] arr) {
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            try {
                result[i] = 1.0 / arr[i]; 
            } catch (ArithmeticException e) {
                result[i] = 0; 
                System.out.println("Ошибка: деление на ноль в индексе " + i);}}
        return result;}

    public static int CountSignChanges(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] < 0 && arr[i - 1] > 0) ||
                (arr[i] > 0 && arr[i - 1] < 0)) {
                count++;}}
        return count;}

    public static void main(String[] args) {
        Random rnd = new Random();

        int size = 10; 
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(199) - 99;}

        double[] reciprocal = CreateReciprocalFraction(array);

        int signChanges = CountSignChanges(array);

        System.out.print("Исходный массив: ");
        for (int v : array) System.out.print(v + " ");
        System.out.println();

        System.out.print("Обратные значения: ");
        for (double v : reciprocal) System.out.print(v + " ");
        System.out.println();
        System.out.println("Количество смен знака: " + signChanges);}
}