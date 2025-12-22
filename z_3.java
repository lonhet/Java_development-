import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y, f;

        if (x <= -3) {
            y = Math.pow(x, 3) + 1;
        } else if (x <= 4) {
            y = x * (1 + Math.pow(2, x));
        } else {
            y = Math.tan(x);}

        if (x <= -3) {
            f = Math.exp(Math.sin(x));
        } else if (x <= 4) {
            f = Math.pow(x, 4);
        } else {
            f = Math.pow(Math.sqrt(x), 1.0 / 5.0);}

        System.out.println("Y = " + y);
        System.out.println("F = " + f);}
}