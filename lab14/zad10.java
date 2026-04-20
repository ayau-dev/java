import java.util.*;

public class zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int num;

        System.out.println("Сандар енгізіңіз (0 тоқтатады):");
        do {
            num = sc.nextInt();
            if (num != 0 && num < min) {
                min = num;
            }
        } while (num != 0);

        if (min == Integer.MAX_VALUE) {
            System.out.println("Сан енгізілмеді");
        } else {
            System.out.println("Ең кіші сан: " + min);
        }
    }
}