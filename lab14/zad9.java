import java.util.*;

public class zad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Құпиясөз енгізіңіз: ");
        String password = sc.next();

        if (password.length() >= 6) {
            System.out.println("Жарамды");
        } else {
            System.out.println("Қысқа құпиясөз");
        }
    }
}