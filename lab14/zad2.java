import java.util.*;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Цифр саны: " + count);
    }
}