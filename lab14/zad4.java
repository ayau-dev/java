import java.util.*;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        int max = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }

        System.out.println("Ең үлкен цифр: " + max);
    }
}