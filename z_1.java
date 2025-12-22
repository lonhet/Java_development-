import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x * y > 100) {
            System.out.println("утроенный квадрат первого числа: " + 2 * Math.pow(x, 3));
            System.out.println("куб второго числа: " + y / 2);}}
}