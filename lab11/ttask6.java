import java.util.*;

public class ttask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double res = a + b;
            history.add(a + " + " + b + " = " + res);
        }

        System.out.println("Тарих:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}