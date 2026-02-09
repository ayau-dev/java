import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        double x = sc.nextDouble();

        // 1-тапсырма
        double f1 = Math.cbrt(
                Math.exp(2 * x) - Math.sin(7 * x / (x + 2.0 / 3))
        ) + 1.7;
        System.out.println("f1 = " + f1);

        // 2-тапсырма
        double f2 = Math.log(Math.abs(x - 1.5))
                + Math.pow(x, 4.0 / 5)
                + Math.cbrt(Math.exp(3 * x))
                + 4;
        System.out.println("f2 = " + f2);

        // 3-тапсырма
        double f3 = Math.tan(5.0 / 3 * x)
                + Math.log(Math.abs(2 * x + 5))
                + 1.8;
        System.out.println("f3 = " + f3);
    }
}