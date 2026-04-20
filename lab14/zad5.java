import java.util.*;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Палиндром емес");
        }
    }
}