import java.util.*;

public class zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Сандар енгізіңіз (0 тоқтатады):");
        do {
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Қосынды: " + sum);
    }
}