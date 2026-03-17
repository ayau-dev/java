import java.util.*;

public class ttask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Сан енгіз: ");
            int x = sc.nextInt();
            System.out.println("Сен енгізген сан: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізу керек!");
        }
    }
}