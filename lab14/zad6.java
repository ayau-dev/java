import java.util.*;

public class zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Жұп цифр саны: " + count);
    }
}