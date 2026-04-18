import java.util.Scanner;

public class ttask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (мыс: 2+3): ");
        String input = sc.nextLine();

        String[] parts;

        if (input.contains("+")) {
            parts = input.split("\\+");
            System.out.println(Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]));
        } else if (input.contains("-")) {
            parts = input.split("-");
            System.out.println(Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]));
        } else if (input.contains("*")) {
            parts = input.split("\\*");
            System.out.println(Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]));
        } else if (input.contains("/")) {
            parts = input.split("/");
            System.out.println(Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]));
        } else {
            System.out.println("Қате формат");
        }
    }
}