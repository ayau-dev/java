import java.util.Scanner;

public class sro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Email енгізіңіз: ");
        String email = scanner.nextLine();

        // Regex үлгісі (email тексеру үшін)
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        // Тексеру
        if (email.matches(regex)) {
            System.out.println("✅ Дұрыс email!");
        } else {
            System.out.println("❌ Қате email формат!");

            // Қосымша тексерулер (қай жерде қате екенін көрсету)
            if (!email.contains("@")) {
                System.out.println("→ '@' белгісі жоқ");
            } else if (email.startsWith("@")) {
                System.out.println("→ Email аты жоқ ( @ алдында бос )");
            } else if (!email.contains(".")) {
                System.out.println("→ Доменде нүкте жоқ (.com сияқты)");
            } else if (email.contains(" ")) {
                System.out.println("→ Бос орын болмауы керек");
            } else {
                System.out.println("→ Формат дұрыс емес (мысалы: name@mail.com)");
            }
        }

        scanner.close();
    }
}