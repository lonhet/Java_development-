import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double maxVal = Math.max(a, b - 5);
        double minVal = Math.min(1 - a, b);

        double d = (2 * maxVal - 4 * minVal) /
                   (3 + maxVal / minVal);

        System.out.println("d = " + d);}
}