import java.util.Scanner;

public class ttask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгіз: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("Теріс санға sqrt жоқ!");
        } else {
            System.out.println("Нәтиже: " + Math.sqrt(num));
        }
    }
}